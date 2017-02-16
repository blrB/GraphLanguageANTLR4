import java.util.List;

public class GraphVisitor extends GraphExprBaseVisitor<String> {

    private String className;

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

    @Override public String visitParse(GraphExprParser.ParseContext ctx) {
        String buffer = "import by.bsuir.lpis.grlang.*;\n";
        buffer += "public class " + className + " {\n";
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

    @Override public String visitMain(GraphExprParser.MainContext ctx) {
        return  "public static void main(String[]args) throws Exception{\n" +
                     this.visit(ctx.start()) +
                "}\n";
    }

    @Override public String visitStart(GraphExprParser.StartContext ctx) {
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
        String nameObject = this.visit(ctx.name_object_graph());
        return "Graph " + name + " = " + nameObject;
    }

    @Override
    public String visitCreate_vertex(GraphExprParser.Create_vertexContext ctx) {
        String name = ctx.ID().getText();
        String nameObject = this.visit(ctx.name_object_vertex());
        return "Vertex " + name + " = " + nameObject;
    }

    @Override
    public String visitCreate_edge(GraphExprParser.Create_edgeContext ctx) {
        String name = ctx.ID().getText();
        String nameObject = this.visit(ctx.name_object_edge());
        return "Edge " + name + " = " + nameObject;
    }

    @Override
    public String visitNameObjectGraph(GraphExprParser.NameObjectGraphContext ctx) {
        return "new Graph(" + ctx.STRING().getText() + ");";
    }

    @Override
    public String visitNameObjectVertex(GraphExprParser.NameObjectVertexContext ctx) {
        return "new Vertex(" + ctx.STRING().getText() + ");";
    }

    @Override
    public String visitNameObjectEdge(GraphExprParser.NameObjectEdgeContext ctx) {
        String source = ctx.connect().source.getText();
        String target = ctx.connect().target.getText();
        return "new Edge(" + source + ", " + target+");";
    }

    @Override
    public String visitPush_in_graph(GraphExprParser.Push_in_graphContext ctx) {
        String name = ctx.id.getText();
        String push = this.visit(ctx.push_more());
        return name + push;
    }

    @Override
    public String visitPushMore(GraphExprParser.PushMoreContext ctx) {
        String push = ctx.ID().getText();
        return ".add(" + push + ")" + this.visit(ctx.push_more());
    }

    @Override
    public String visitPushOne(GraphExprParser.PushOneContext ctx) {
        String push = ctx.ID().getText();
        return ".add(" + push + ");";
    }

    @Override
    public String visitPull_from_graph(GraphExprParser.Pull_from_graphContext ctx) {
        String name = ctx.id.getText();
        String push = this.visit(ctx.pull_more());
        return name + push;
    }

    @Override
    public String visitPullMore(GraphExprParser.PullMoreContext ctx) {
        String push = ctx.ID().getText();
        return ".remove(" + push + ")" + this.visit(ctx.pull_more());
    }

    @Override
    public String visitPullOne(GraphExprParser.PullOneContext ctx) {
        String push = ctx.ID().getText();
        return ".remove(" + push + ");";
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
        return ctx.ID().toString();
    }

    @Override
    public String visitPrintString(GraphExprParser.PrintStringContext ctx) {
        return ctx.STRING().getText();
    }


    @Override public String visitStat_block(GraphExprParser.Stat_blockContext ctx) {
        return "{\n" + this.visit(ctx.start()) +"}";
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
        String right = ctx.ID(1).getText();
        switch (ctx.op.getType()) {
            case GraphExprParser.EQ:
                return left + ".equal("+ right + ")";
            case GraphExprParser.NEQ:
                return "!" + left + ".equal("+ right + ")";
            default:
                throw new RuntimeException("Unknown operator: " + ctx.op.getText());
        }
    }

    @Override public String visitContain(GraphExprParser.ContainContext ctx) {
        String left = ctx.ID(0).getText();
        String right = ctx.ID(1).getText();
        return left + ".contain("+ right + ")";
    }

    @Override public String visitCheckType(GraphExprParser.CheckTypeContext ctx) {
        String left = ctx.ID().getText();
        String right = ctx.type().getText();
        right = getStringWithFirstCapital(right);
        return left + " instanceof " + right;
    }

    @Override
    public String visitWhile_stat(GraphExprParser.While_statContext ctx) {
        return "while (" + this.visit(ctx.condition_block().condition()) + ")" +
                this.visit(ctx.condition_block().stat_block());
    }

    @Override
    public String visitForeach_stat(GraphExprParser.Foreach_statContext ctx) {
        return "for (" + this.visit(ctx.condition_for_each()) + ")" +
                this.visit(ctx.stat_block());
    }

    @Override
    public String  visitForEachVertex(GraphExprParser.ForEachVertexContext ctx) {
        String left = ctx.ID(0).getText();
        String right = ctx.ID(1).getText();
        return "Vertex " + left + " : "+ right + ".getVertices()";
    }

    @Override
    public String visitForEachEdge(GraphExprParser.ForEachEdgeContext ctx) {
        String left = ctx.ID(0).getText();
        String right = ctx.ID(1).getText();
        return "Edge " + left + " : "+ right + ".getEdges()";
    }

    @Override
    public String visitForEachAdjacencyVertex(GraphExprParser.ForEachAdjacencyVertexContext ctx)  {
        String left = ctx.ID(0).getText();
        String vertex = ctx.ID(1).getText();
        String graph = ctx.ID(2).getText();
        return "Vertex " + left + " : " + graph + ".getAdjacencyVertices(" + vertex + ")";
    }

    @Override
    public String visitVoidFunction(GraphExprParser.VoidFunctionContext ctx) {
        String name = ctx.ID().getText();
        return "private static void " + name + this.visit(ctx.param()) + this.visit(ctx.stat_block());
    }

    @Override
    public String visitReturnFunction(GraphExprParser.ReturnFunctionContext ctx) {
        String name = ctx.ID().getText();
        String returnType = ctx.type().getText();
        returnType = getStringWithFirstCapital(returnType);
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
        return "return " + id + ";\n";
    }

    @Override
    public String visitFunction_call(GraphExprParser.Function_callContext ctx) {
        String name = ctx.ID().getText();
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
        return name + ", " + this.visit(ctx.arg_call());
    }

    @Override
    public String visitParamCallArg(GraphExprParser.ParamCallArgContext ctx) {
        return ctx.ID().getText();
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
        return type + " " + name + ", " + this.visit(ctx.arg());
    }

    @Override
    public String visitParamArg(GraphExprParser.ParamArgContext ctx) {
        String type = ctx.type().getText();
        type = getStringWithFirstCapital(type);
        String name = ctx.ID().getText();
        return type + " " + name;
    }

}
