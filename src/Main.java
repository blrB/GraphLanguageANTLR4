import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    private static final String path = "ANTLRGRL/src/main/java/by/bsuir/lpis/grlang/Main.java";
    private static final String pathJar = "ANTLRGRL/target/ANTLR-GRL-1.0-SNAPSHOT.jar";
    private static final String pathPom = "ANTLRGRL/pom.xml";

    public static void main(String[] args) throws Exception {
        Runtime.getRuntime().exec("rm -f " + pathJar);
        String fileName = "";
        if (args.length == 1){
            fileName = args[0];
        } else {
            System.out.print("Not valid arg");
            System.exit(-1);
        }
        GraphExprLexer lexer = new GraphExprLexer(new ANTLRFileStream(fileName));
        GraphExprParser parser = new GraphExprParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        GraphExprVisitor graphExprVisitor = new GraphVisitor(fileName);
        String output = (String) graphExprVisitor.visit(tree);
        //System.out.print(output);
        PrintWriter printer = new PrintWriter(path);
        printer.print(output);
        printer.close();

        Process p = Runtime.getRuntime().exec("mvn -f " + pathPom + " package");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(p.getInputStream()) );
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
        System.out.println("\nRESULT PROGRAM : \n");
        p = Runtime.getRuntime().exec("java -jar " + pathJar);
        in = new BufferedReader(
                new InputStreamReader(p.getInputStream()) );
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }

}
