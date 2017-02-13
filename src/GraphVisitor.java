import java.util.List;

public class GraphVisitor extends GraphExprBaseVisitor<String> {

    @Override public String visitParse(GraphExprParser.ParseContext ctx) {
        String buffer = "public class Main {\n";
        List<GraphExprParser.CreateContext> createContextList = ctx.create();
        for (int children = 0; children < createContextList.size(); children++){
            buffer +=  this.visit(createContextList.get(children));
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
        String nameObject = ctx.name_object().getText();
        return "Graph " + name + " = new Graph(" + nameObject + ");";
    }

    @Override
    public String visitCreate_vertex(GraphExprParser.Create_vertexContext ctx) {
        String name = ctx.ID().getText();
        String nameObject = ctx.name_object().getText();
        return "Vertex " + name + " = new Vertex(" + nameObject + ");";
    }

    @Override
    public String visitCreate_edge(GraphExprParser.Create_edgeContext ctx) {
        String name = ctx.ID().getText();
        String source = ctx.connect().source.getText();
        String target = ctx.connect().target.getText();
        return "Edge " + name + " = new Edge(" + source + ", " + target+");";
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
        return ".add(" + push + ")";
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
        return ".remove(" + push + ")";
    }

    @Override
    public String visitPrint(GraphExprParser.PrintContext ctx){
        String string = ctx.STRING().getText();
        return "System.out.println(" + string + ");";
    }

    @Override public String visitStat_block(GraphExprParser.Stat_blockContext ctx) {
        return "{\n" + this.visit(ctx.start()) +"}";
    }

    @Override
    public String visitIf_stat(GraphExprParser.If_statContext ctx) {
        String buffer = "";
        List<GraphExprParser.Condition_blockContext> conditions =  ctx.condition_block();
        boolean evaluatedBlock = false;
        for(int index = 0; index < conditions.size(); index++) {
            String conditionString = this.visit(conditions.get(index).condition());
            buffer += "if (" + conditionString + ")";
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
                throw new RuntimeException("Unknown operator: " + GraphExprParser.tokenNames[ctx.op.getType()]);
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
        right = right.substring(0,1).toUpperCase() + right.substring(1).toLowerCase();
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

    @Override public String  visitForEachVertex(GraphExprParser.ForEachVertexContext ctx) {
        String left = ctx.ID(0).getText();
        String right = ctx.ID(1).getText();
        return "Vertex " + left + " : "+ right;
    }

    @Override public String visitForEachEdge(GraphExprParser.ForEachEdgeContext ctx) {
        String left = ctx.ID(0).getText();
        String right = ctx.ID(1).getText();
        return "Edge " + left + " : "+ right;
    }


}
