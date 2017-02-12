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
	 * Visit a parse tree produced by {@link GraphExprParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GraphExprParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(GraphExprParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GraphExprParser.AssignmentContext ctx);
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
	 * Visit a parse tree produced by {@link GraphExprParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GraphExprParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link GraphExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(GraphExprParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link GraphExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(GraphExprParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containGraphExpr}
	 * labeled alternative in {@link GraphExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainGraphExpr(GraphExprParser.ContainGraphExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link GraphExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(GraphExprParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link GraphExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(GraphExprParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link GraphExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(GraphExprParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pushAndPullGraphExpr}
	 * labeled alternative in {@link GraphExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPushAndPullGraphExpr(GraphExprParser.PushAndPullGraphExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomGraphExpr}
	 * labeled alternative in {@link GraphExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomGraphExpr(GraphExprParser.AtomGraphExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link GraphExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(GraphExprParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link GraphExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(GraphExprParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link GraphExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(GraphExprParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link GraphExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(GraphExprParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code graphAtom}
	 * labeled alternative in {@link GraphExprParser#graph_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphAtom(GraphExprParser.GraphAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vertexAtom}
	 * labeled alternative in {@link GraphExprParser#graph_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertexAtom(GraphExprParser.VertexAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code edgeAtom}
	 * labeled alternative in {@link GraphExprParser#graph_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeAtom(GraphExprParser.EdgeAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link GraphExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(GraphExprParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link GraphExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(GraphExprParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link GraphExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(GraphExprParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link GraphExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(GraphExprParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link GraphExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(GraphExprParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullAtom}
	 * labeled alternative in {@link GraphExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullAtom(GraphExprParser.NullAtomContext ctx);
}