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
	 * Visit a parse tree produced by the {@code nameObjectGraph}
	 * labeled alternative in {@link GraphExprParser#name_object_graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectGraph(GraphExprParser.NameObjectGraphContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallGraph}
	 * labeled alternative in {@link GraphExprParser#name_object_graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallGraph(GraphExprParser.FunctionCallGraphContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectVertex}
	 * labeled alternative in {@link GraphExprParser#name_object_vertex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectVertex(GraphExprParser.NameObjectVertexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallVertex}
	 * labeled alternative in {@link GraphExprParser#name_object_vertex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallVertex(GraphExprParser.FunctionCallVertexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectEdge}
	 * labeled alternative in {@link GraphExprParser#name_object_edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectEdge(GraphExprParser.NameObjectEdgeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallEdge}
	 * labeled alternative in {@link GraphExprParser#name_object_edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallEdge(GraphExprParser.FunctionCallEdgeContext ctx);
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
	 * labeled alternative in {@link GraphExprParser#condition_for_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachVertex(GraphExprParser.ForEachVertexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forEachAdjacencyVertex}
	 * labeled alternative in {@link GraphExprParser#condition_for_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachAdjacencyVertex(GraphExprParser.ForEachAdjacencyVertexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forEachEdge}
	 * labeled alternative in {@link GraphExprParser#condition_for_each}.
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
	 * Visit a parse tree produced by the {@code concatString}
	 * labeled alternative in {@link GraphExprParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatString(GraphExprParser.ConcatStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link GraphExprParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintId(GraphExprParser.PrintIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printString}
	 * labeled alternative in {@link GraphExprParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintString(GraphExprParser.PrintStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(GraphExprParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#param_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_call(GraphExprParser.Param_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link GraphExprParser#arg_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallArg(GraphExprParser.ParamCallArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link GraphExprParser#arg_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallArgs(GraphExprParser.ParamCallArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link GraphExprParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunction(GraphExprParser.VoidFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link GraphExprParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunction(GraphExprParser.ReturnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block_with_return(GraphExprParser.Stat_block_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#return_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_id(GraphExprParser.Return_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(GraphExprParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link GraphExprParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArg(GraphExprParser.ParamArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link GraphExprParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArgs(GraphExprParser.ParamArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GraphExprParser.TypeContext ctx);
}