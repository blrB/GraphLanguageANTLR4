public class GraphVisitor extends GraphExprBaseVisitor<String> {

    @Override
    public String visitCreate_graph(GraphExprParser.Create_graphContext ctx) {
        String name = ctx.ID().getText();
        String nameObject = ctx.name_object().getText();
        System.out.println("Graph " + name + " = new Graph(" + nameObject + ");");
        return "";
    }

    @Override
    public String visitCreate_vertex(GraphExprParser.Create_vertexContext ctx) {
        String name = ctx.ID().getText();
        String nameObject = ctx.name_object().getText();
        System.out.println("Vertex " + name + " = new Vertex(" + nameObject + ");");
        return "";
    }

    @Override
    public String visitCreate_edge(GraphExprParser.Create_edgeContext ctx) {
        String name = ctx.ID().getText();
        String source = ctx.connect().source.getText();
        String target = ctx.connect().target.getText();
        System.out.println("Edge " + name + " = new Edge(" + source + ", " + target+");");
        return "";
    }

    @Override
    public String visitPush_in_graph(GraphExprParser.Push_in_graphContext ctx) {
        String name = ctx.id.getText();
        String push = this.visit(ctx.push_more());
        System.out.println(name + push);
        return "";
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
        System.out.println(name + push);
        return "";
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
        System.out.println("System.out.println(" + string + ");");
        return "";
    }

}
