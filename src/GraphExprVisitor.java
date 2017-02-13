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
	 * Visit a parse tree produced by {@link GraphExprParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(GraphExprParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GraphExprParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(GraphExprParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(GraphExprParser.CreateContext ctx);
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
	 * Visit a parse tree produced by {@link GraphExprParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(GraphExprParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(GraphExprParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(GraphExprParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(GraphExprParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#foreach_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_stat(GraphExprParser.Foreach_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link GraphExprParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(GraphExprParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contain}
	 * labeled alternative in {@link GraphExprParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContain(GraphExprParser.ContainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkType}
	 * labeled alternative in {@link GraphExprParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckType(GraphExprParser.CheckTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forEachVertex}
	 * labeled alternative in {@link GraphExprParser#conditionForEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachVertex(GraphExprParser.ForEachVertexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forEachEdge}
	 * labeled alternative in {@link GraphExprParser#conditionForEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachEdge(GraphExprParser.ForEachEdgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GraphExprParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GraphExprParser.TypeContext ctx);
}