import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) throws Exception {
        String fileName = "dfs.gr";
        GraphExprLexer lexer = new GraphExprLexer(new ANTLRFileStream(fileName));
        GraphExprParser parser = new GraphExprParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        GraphExprVisitor graphExprVisitor = new GraphVisitor(fileName);
        System.out.print(graphExprVisitor.visit(tree));
    }

}
