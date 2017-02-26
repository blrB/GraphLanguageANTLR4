import exceptions.NotDefinedVariable;
import exceptions.NotValidCast;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

public class GraphVisitor extends GraphExprBaseVisitor<String> {

    private String className;
    private Map<String, Type> globalVariable = new HashMap<>();
    private Map<String, Type> localVariable = new HashMap<>();
    private Map<String, Type> functionNames = new HashMap<>();

    public GraphVisitor(String fileName){
        String fileNameForClass = getStringWithFirstCapital(fileName);
        this.className = replaceDot(fileNameForClass);
    }

    private String getStringWithFirstCapital(String string) {
        return string.substring(0,1).toUpperCase() + string.substring(1).toLowerCase();
    }

    private String replaceDot(String string) {
        return string.replaceAll("[.]", "_");
    }

    private boolean isGlobal(ParserRuleContext ctx){
        return ctx.getParent().getParent() instanceof GraphExprParser.ParseContext;
    }

    private void addVariableToList(ParserRuleContext ctx, String name, Type type) {
        if (isGlobal(ctx)){
            globalVariable.put(name, type);
        } else {
            localVariable.put(name, type);
        }
    }

    private void addToLocalVariableList(String name, Type type){
        localVariable.put(name, type);
    }

    private void clearLocalVariableList(){
        localVariable.clear();
    }

    private void addToFunctionList(String name, Type type){
        functionNames.put(name, type);
    }

    private void checkVariable(String name) {
        if (!(globalVariable.containsKey(name) || localVariable.containsKey(name))){
            try {
                throw new NotDefinedVariable("Variable " + name + " is not defined");
            } catch (NotDefinedVariable notDefinedVariable) {
                notDefinedVariable.printStackTrace();
                System.exit(-1);
            }
        }
    }

    private void checkFunction(String name) {
        if (!(functionNames.containsKey(name))){
            try {
                throw new NotDefinedVariable("Function " + name + " is not defined");
            } catch (NotDefinedVariable notDefinedVariable) {
                notDefinedVariable.printStackTrace();
                System.exit(-2);
            }
        }
    }

    private void checkCast(String name, Type needType) {
        try {
            if (localVariable.containsKey(name)) {
                if (!(localVariable.get(name).equals(needType))) {
                    throw new NotValidCast("Variable " + name + " need have type " + needType);
                }
            } else {
                if (!(globalVariable.get(name).equals(needType))) {
                    throw new NotValidCast("Variable " + name + " need have type " + needType);
                }
            }
        } catch (NotValidCast notValidCast) {
            notValidCast.printStackTrace();
            System.exit(-3);
        }
    }

    private void checkCastFunction(String name, Type needType){
        if (!(functionNames.get(name).equals(needType))){
            try {
                throw new NotValidCast("Function " + name + " need have type " + needType);
            } catch (NotValidCast notValidCast) {
                notValidCast.printStackTrace();
                System.exit(-4);
            }
        }

    }

    private Type getTypeVariable(String name){
        if (localVariable.containsKey(name)) {
            return localVariable.get(name);
        } else {
            return globalVariable.get(name);
        }
    }

    private boolean notExistLocaleVariable(String name){
        return !localVariable.containsKey(name);
    }

    @Override
    public String visitParse(GraphExprParser.ParseContext ctx) {
        String buffer = "// program " + className + " " + new Date().toString() + "\n";
        buffer += "package by.bsuir.lpis.grlang;\n";
        buffer += "public class " + "Main" + " {\n";
        List<GraphExprParser.CreateContext> createContextList = ctx.create();
        for (GraphExprParser.CreateContext aCreateContextList : createContextList) {
            buffer += "static " + this.visit(aCreateContextList);
            buffer += "\n";
        }
        List<GraphExprParser.FunctionContext> functionContextList = ctx.function();
        for (GraphExprParser.FunctionContext aFunctionContextList : functionContextList) {
            buffer += this.visit(aFunctionContextList);
            buffer += "\n";
        }
        buffer += this.visit(ctx.main());
        buffer += "}\n";
        return buffer;
    }

    @Override
    public String visitMain(GraphExprParser.MainContext ctx) {
        clearLocalVariableList();
        return  "public static void main(String[]args) throws Exception{\n" +
                     this.visit(ctx.start()) +
                "}\n";
    }

    @Override
    public String visitStart(GraphExprParser.StartContext ctx) {
        String buffer = "";
        for (int children = 0; children < ctx.getChildCount(); children++){
            buffer += "";
            buffer += this.visit(ctx.getChild(children));
            buffer += "\n";
        }
        return buffer;
    }

    @Override
    public String visitCreate_graph(GraphExprParser.Create_graphContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (notExistLocaleVariable(name)){
            addVariableToList(ctx, name, Type.GRAPH);
            newVariable = Type.GRAPH.toString() + " ";
        }
        String nameObject = this.visit(ctx.name_object_graph());
        return newVariable + name + " = " + nameObject;
    }

    @Override
    public String visitCreate_vertex(GraphExprParser.Create_vertexContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (notExistLocaleVariable(name)){
            addVariableToList(ctx, name, Type.VERTEX);
            newVariable = Type.VERTEX.toString() + " ";
        }
        String nameObject = this.visit(ctx.name_object_vertex());
        return newVariable + name + " = " + nameObject;
    }

    @Override
    public String visitCreate_edge(GraphExprParser.Create_edgeContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (notExistLocaleVariable(name)){
            addVariableToList(ctx, name, Type.EDGE);
            newVariable = Type.EDGE.toString() + " ";
        }
        String nameObject = this.visit(ctx.name_object_edge());
        return newVariable + name + " = " + nameObject;
    }

    @Override
    public String visitNameObjectGraph(GraphExprParser.NameObjectGraphContext ctx) {
        GraphExprParser.Create_graphContext context = (GraphExprParser.Create_graphContext) ctx.getParent();
        String name = context.ID().getText();
        Type type = getTypeVariable(name);
        return "new " + type + "(" + ctx.STRING().getText() + ");";
    }

    @Override
    public String visitIdGraph(GraphExprParser.IdGraphContext ctx) {
        String right = ctx.ID().getText();
        checkVariable(right);
        GraphExprParser.Create_graphContext context = (GraphExprParser.Create_graphContext) ctx.getParent();
        String left = context.ID().getText();
        checkCast(right, getTypeVariable(left));
        return right + ";";
    }

    @Override
    public String visitFunctionCallGraph(GraphExprParser.FunctionCallGraphContext ctx) {
        GraphExprParser.Function_callContext context = ctx.function_call();
        String name = context.ID().getText();
        checkFunction(name);
        GraphExprParser.Create_graphContext contextP = (GraphExprParser.Create_graphContext) ctx.getParent();
        String left = contextP.ID().getText();
        checkCastFunction(name, getTypeVariable(left));
        return name + this.visit(context.param_call());
    }

    @Override
    public String visitNameObjectVertex(GraphExprParser.NameObjectVertexContext ctx) {
        GraphExprParser.Create_vertexContext context = (GraphExprParser.Create_vertexContext) ctx.getParent();
        String name = context.ID().getText();
        Type type = getTypeVariable(name);
        return "new " + type + "(" + ctx.STRING().getText() + ");";
    }

    @Override
    public String visitIdVertex(GraphExprParser.IdVertexContext ctx) {
        String right = ctx.ID().getText();
        checkVariable(right);
        GraphExprParser.Create_vertexContext context = (GraphExprParser.Create_vertexContext) ctx.getParent();
        String left = context.ID().getText();
        checkCast(right, getTypeVariable(left));
        return right + ";";
    }

    @Override
    public String visitFunctionCallVertex(GraphExprParser.FunctionCallVertexContext ctx) {
        GraphExprParser.Function_callContext context = ctx.function_call();
        String name = context.ID().getText();
        checkFunction(name);
        GraphExprParser.Create_vertexContext contextP = (GraphExprParser.Create_vertexContext) ctx.getParent();
        String left = contextP.ID().getText();
        checkCastFunction(name, getTypeVariable(left));
        return name + this.visit(context.param_call());
    }

    @Override
    public String visitNameObjectEdge(GraphExprParser.NameObjectEdgeContext ctx) {
        String source = ctx.connect().source.getText();
        checkVariable(source);
        String target = ctx.connect().target.getText();
        checkVariable(target);
        GraphExprParser.Create_edgeContext context = (GraphExprParser.Create_edgeContext) ctx.getParent();
        String name = context.ID().getText();
        Type type = getTypeVariable(name);
        return "new " + type + "(" + source + ", " + target+");";
    }

    @Override
    public String visitIdEdge(GraphExprParser.IdEdgeContext ctx) {
        String right = ctx.ID().getText();
        checkVariable(right);
        GraphExprParser.Create_edgeContext context = (GraphExprParser.Create_edgeContext) ctx.getParent();
        String left = context.ID().getText();
        checkCast(right, getTypeVariable(left));
        return right + ";";
    }

    @Override
    public String visitFunctionCallEdge(GraphExprParser.FunctionCallEdgeContext ctx) {
        GraphExprParser.Function_callContext context = ctx.function_call();
        String name = context.ID().getText();
        checkFunction(name);
        GraphExprParser.Create_edgeContext contextP = (GraphExprParser.Create_edgeContext) ctx.getParent();
        String left = contextP.ID().getText();
        checkCastFunction(name, getTypeVariable(left));
        return name + this.visit(context.param_call());
    }

    @Override
    public String visitPush_in_graph(GraphExprParser.Push_in_graphContext ctx) {
        String name = ctx.id.getText();
        checkVariable(name);
        String push = this.visit(ctx.push_more());
        return name + push;
    }

    @Override
    public String visitPushMore(GraphExprParser.PushMoreContext ctx) {
        String push = ctx.ID().getText();
        checkVariable(push);
        return ".add(" + push + ")" + this.visit(ctx.push_more());
    }

    @Override
    public String visitPushOne(GraphExprParser.PushOneContext ctx) {
        String push = ctx.ID().getText();
        checkVariable(push);
        return ".add(" + push + ");";
    }

    @Override
    public String visitPull_from_graph(GraphExprParser.Pull_from_graphContext ctx) {
        String name = ctx.id.getText();
        checkVariable(name);
        String push = this.visit(ctx.pull_more());
        return name + push;
    }

    @Override
    public String visitPullMore(GraphExprParser.PullMoreContext ctx) {
        String pull = ctx.ID().getText();
        checkVariable(pull);
        return ".remove(" + pull + ")" + this.visit(ctx.pull_more());
    }

    @Override
    public String visitPullOne(GraphExprParser.PullOneContext ctx) {
        String pull = ctx.ID().getText();
        checkVariable(pull);
        return ".remove(" + pull + ");";
    }

    @Override
    public String visitPrint(GraphExprParser.PrintContext ctx){
        return "System.out.println(" + this.visit(ctx.print_expr()) + ");";
    }

    @Override
    public String visitConcatString(GraphExprParser.ConcatStringContext ctx) {
        String string1 = this.visit(ctx.print_expr(0));
        String string2 = this.visit(ctx.print_expr(1));
        return string1 + " + " + string2;
    }

    @Override
    public String visitPrintId(GraphExprParser.PrintIdContext ctx) {
        String name = ctx.ID().toString();
        checkVariable(name);
        return name;
    }

    @Override
    public String visitPrintString(GraphExprParser.PrintStringContext ctx) {
        return ctx.STRING().getText();
    }


    @Override public String visitStat_block(GraphExprParser.Stat_blockContext ctx) {
        Map<String, Type> beforeStatBlock = new HashMap(localVariable);
        String block = "{\n" + this.visit(ctx.start()) +"}";
        localVariable = beforeStatBlock;
        return block;
    }

    @Override
    public String visitIf_stat(GraphExprParser.If_statContext ctx) {
        String buffer = "";
        List<GraphExprParser.Condition_blockContext> conditions =  ctx.condition_block();
        for(int index = 0; index < conditions.size(); index++) {
            String conditionString = this.visit(conditions.get(index).condition());
            String negation ="";
            if (conditions.get(index).NEGATION() != null){
                negation = "!";
            }
            buffer += "if (" + negation + conditionString + ")";
            buffer += this.visit(conditions.get(index).stat_block());
            if ((index + 1) < conditions.size()){
                buffer += "else ";
            }
        }
        if(ctx.stat_block() != null) {
            buffer += "else" + this.visit(ctx.stat_block());
        }
        return buffer;
    }

    @Override public String visitCondition_block(GraphExprParser.Condition_blockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitEqualityExpr(GraphExprParser.EqualityExprContext ctx) {
        String left = ctx.ID(0).getText();
        checkVariable(left);
        String right = ctx.ID(1).getText();
        checkVariable(right);
        switch (ctx.op.getType()) {
            case GraphExprParser.EQ:
                return left + ".equals("+ right + ")";
            case GraphExprParser.NEQ:
                return "!" + left + ".equals("+ right + ")";
            default:
                throw new RuntimeException("Unknown operator: " + ctx.op.getText());
        }
    }

    @Override public String visitContain(GraphExprParser.ContainContext ctx) {
        String left = ctx.ID(0).getText();
        checkVariable(left);
        checkCast(left, Type.GRAPH);
        String right = ctx.ID(1).getText();
        checkVariable(right);
        return left + ".contain("+ right + ")";
    }

    @Override public String visitCheckType(GraphExprParser.CheckTypeContext ctx) {
        String left = ctx.ID().getText();
        checkVariable(left);
        String right = ctx.type().getText();
        right = getStringWithFirstCapital(right);
        return left + ".getClass().getSimpleName().equals(\"" + right + "\")";
    }

    @Override
    public String visitWhile_stat(GraphExprParser.While_statContext ctx) {
        return "while (" + this.visit(ctx.condition_block().condition()) + ")" +
                this.visit(ctx.condition_block().stat_block());
    }

    @Override
    public String visitForeach_stat(GraphExprParser.Foreach_statContext ctx) {
        Map<String, Type> beforeStatBlock = new HashMap(localVariable);
        String forBlock = "for (" + this.visit(ctx.condition_for_each()) + ")" +
                this.visit(ctx.stat_block());
        localVariable = beforeStatBlock;
        return forBlock;
    }

    @Override
    public String  visitForEachVertex(GraphExprParser.ForEachVertexContext ctx) {
        String left = ctx.ID(0).getText();
        addToLocalVariableList(left, Type.VERTEX);
        String right = ctx.ID(1).getText();
        checkVariable(right);
        return "Vertex " + left + " : "+ right + ".getVertices()";
    }

    @Override
    public String visitForEachEdge(GraphExprParser.ForEachEdgeContext ctx) {
        String left = ctx.ID(0).getText();
        addToLocalVariableList(left, Type.EDGE);
        String right = ctx.ID(1).getText();
        checkVariable(right);
        return "Edge " + left + " : "+ right + ".getEdges()";
    }

    @Override
    public String visitForEachAdjacencyVertex(GraphExprParser.ForEachAdjacencyVertexContext ctx)  {
        String left = ctx.ID(0).getText();
        addToLocalVariableList(left, Type.VERTEX);
        String vertex = ctx.ID(1).getText();
        checkVariable(vertex);
        checkCast(vertex, Type.VERTEX);
        String graph = ctx.ID(2).getText();
        checkVariable(graph);
        checkCast(graph, Type.GRAPH);
        return "Vertex " + left + " : " + graph + ".getAdjacencyVertices(" + vertex + ")";
    }

    @Override
    public String visitVoidFunction(GraphExprParser.VoidFunctionContext ctx) {
        clearLocalVariableList();
        String name = ctx.ID().getText();
        addToFunctionList(name, Type.VOID);
        return "private static void " + name + this.visit(ctx.param()) + this.visit(ctx.stat_block());
    }

    @Override
    public String visitReturnFunction(GraphExprParser.ReturnFunctionContext ctx) {
        clearLocalVariableList();
        String name = ctx.ID().getText();
        String returnType = ctx.type().getText();
        returnType = getStringWithFirstCapital(returnType);
        addToFunctionList(name, Type.getTypeByString(returnType));
        return "private static " + returnType + " " + name +
                this.visit(ctx.param()) +
                this.visit(ctx.stat_block_with_return());
    }

    @Override
    public String visitStat_block_with_return(GraphExprParser.Stat_block_with_returnContext ctx) {
        return "{\n" + this.visit(ctx.start()) + this.visit(ctx.return_id()) +"}";
    }

    @Override
    public String visitReturn_id(GraphExprParser.Return_idContext ctx) {
        String id = ctx.ID().getText();
        checkVariable(id);
        GraphExprParser.ReturnFunctionContext context = (GraphExprParser.ReturnFunctionContext) ctx.getParent().getParent();
        checkCast(id, Type.getTypeByString(getStringWithFirstCapital(context.type().getText())));
        return "return " + id + ";\n";
    }

    @Override
    public String visitFunction_call(GraphExprParser.Function_callContext ctx) {
        String name = ctx.ID().getText();
        checkFunction(name);
        return name + this.visit(ctx.param_call());
    }


    @Override
    public String visitParam_call(GraphExprParser.Param_callContext ctx) {
        String args = "";
        if (ctx.arg_call() != null){
            args = this.visit(ctx.arg_call());
        }
        return "(" + args + ");";
    }

    @Override
    public String visitParamCallArgs(GraphExprParser.ParamCallArgsContext ctx) {
        String name = ctx.ID().getText();
        checkVariable(name);
        return name + ", " + this.visit(ctx.arg_call());
    }

    @Override
    public String visitParamCallArg(GraphExprParser.ParamCallArgContext ctx) {
        String name = ctx.ID().getText();
        checkVariable(name);
        return name;
    }

    @Override
    public String visitParam(GraphExprParser.ParamContext ctx) {
        String args = "";
        if (ctx.arg() != null){
            args = this.visit(ctx.arg());
        }
        return "(" + args + ")";
    }

    @Override
    public String visitParamArgs(GraphExprParser.ParamArgsContext ctx) {
        String type = ctx.type().getText();
        type = getStringWithFirstCapital(type);
        String name = ctx.ID().getText();
        addToLocalVariableList(name, Type.getTypeByString(type));
        return type + " " + name + ", " + this.visit(ctx.arg());
    }

    @Override
    public String visitParamArg(GraphExprParser.ParamArgContext ctx) {
        String type = ctx.type().getText();
        type = getStringWithFirstCapital(type);
        String name = ctx.ID().getText();
        addToLocalVariableList(name, Type.getTypeByString(type));
        return type + " " + name;
    }

}
