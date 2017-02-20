import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.PrintWriter;

public class Main {

    private static final String pach = "ANTLRGRL/src/main/java/by/bsuir/lpis/grlang/Main.java";
    private static final String pachPom = "ANTLRGRL/pom.xml";

    public static void main(String[] args) throws Exception {
        String fileName = "dfs.gr";
        GraphExprLexer lexer = new GraphExprLexer(new ANTLRFileStream(fileName));
        GraphExprParser parser = new GraphExprParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        GraphExprVisitor graphExprVisitor = new GraphVisitor(fileName);
        String output = (String) graphExprVisitor.visit(tree);
        System.out.print(output);
        PrintWriter printer = new PrintWriter(pach);
        printer.print(output);
        printer.close();

        Runtime.getRuntime().exec("mvn -f " + pachPom + " package");
    }

}
