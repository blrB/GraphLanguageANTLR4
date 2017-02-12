import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) throws Exception {
        GraphExprLexer lexer = new GraphExprLexer(new ANTLRFileStream("test.gr"));
        GraphExprParser parser = new GraphExprParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        GraphExprVisitor graphExprVisitor = new GraphVisitor();
        graphExprVisitor.visit(tree);
    }

}
