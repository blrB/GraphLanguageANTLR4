// Generated from /home/andrey/Dropbox/9PIS/ANTLR4/src/GraphExpr.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GraphExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GraphExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(GraphExprParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(GraphExprParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#create_graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_graph(GraphExprParser.Create_graphContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#create_vertex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_vertex(GraphExprParser.Create_vertexContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#create_edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_edge(GraphExprParser.Create_edgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#name_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_object(GraphExprParser.Name_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#connect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnect(GraphExprParser.ConnectContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#push_in_graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush_in_graph(GraphExprParser.Push_in_graphContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#pull_from_graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPull_from_graph(GraphExprParser.Pull_from_graphContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pushMore}
	 * labeled alternative in {@link GraphExprParser#push_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPushMore(GraphExprParser.PushMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pushOne}
	 * labeled alternative in {@link GraphExprParser#push_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPushOne(GraphExprParser.PushOneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pullMore}
	 * labeled alternative in {@link GraphExprParser#pull_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPullMore(GraphExprParser.PullMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pullOne}
	 * labeled alternative in {@link GraphExprParser#pull_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPullOne(GraphExprParser.PullOneContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GraphExprParser.PrintContext ctx);
}