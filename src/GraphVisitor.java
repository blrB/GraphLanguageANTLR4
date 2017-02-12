import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphVisitor extends GraphExprBaseVisitor<Value>{

    private static final double SMALL_VALUE = 0.00000000001;
    private Map<String, Value> memory = new HashMap<>();

    @Override
    public Value visitAssignment(GraphExprParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());
        return memory.put(id, value);
    }

    @Override
    public Value visitIf_stat(GraphExprParser.If_statContext ctx) {
        List<GraphExprParser.Condition_blockContext> conditions =  ctx.condition_block();
        boolean evaluatedBlock = false;
        for(GraphExprParser.Condition_blockContext condition : conditions) {
            Value evaluated = this.visit(condition.expr());
            if(evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.stat_block());
                break;
            }
        }
        if(!evaluatedBlock && ctx.stat_block() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.stat_block());
        }
        return Value.VOID;
    }

    @Override
    public Value visitWhile_stat(GraphExprParser.While_statContext ctx) {
        GraphExprParser.Condition_blockContext condition = ctx.condition_block();
        Value value = this.visit(condition.expr());
        while(value.asBoolean()) {
            this.visit(condition.stat_block());
            value = this.visit(condition.expr());
        }
        return Value.VOID;
    }

    @Override
    public Value visitForeach_stat(GraphExprParser.Foreach_statContext ctx) {
        return null;
    }

    @Override
    public Value visitPrint(GraphExprParser.PrintContext ctx) {
        Value value = this.visit(ctx.expr());
        System.out.println(value);
        return value;
    }

    @Override
    public Value visitNotExpr(GraphExprParser.NotExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(!value.asBoolean());
    }

    @Override
    public Value visitUnaryMinusExpr(GraphExprParser.UnaryMinusExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(-value.asDouble());
    }

    @Override
    public Value visitContainGraphExpr(GraphExprParser.ContainGraphExprContext ctx) {
        return null;
    }

    @Override
    public Value visitMultiplicationExpr(GraphExprParser.MultiplicationExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        switch (ctx.op.getType()) {
            case GraphExprParser.MULT:
                return new Value(left.asDouble() * right.asDouble());
            case GraphExprParser.DIV:
                return new Value(left.asDouble() / right.asDouble());
            case GraphExprParser.MOD:
                return new Value(left.asDouble() % right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + GraphExprParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitOrExpr(GraphExprParser.OrExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }

    @Override
    public Value visitPushAndPullGraphExpr(GraphExprParser.PushAndPullGraphExprContext ctx) {
        return null;
    }

    @Override
    public Value visitAdditiveExpr(GraphExprParser.AdditiveExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        switch (ctx.op.getType()) {
            case GraphExprParser.PLUS:
                if (left.isDouble() && right.isDouble()) {
                    return new Value(left.asDouble() + right.asDouble());
                } else {
                    return new Value(left.asString() + right.asString());
                }
            case GraphExprParser.MINUS:
                return new Value(left.asDouble() - right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + GraphExprParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitRelationalExpr(GraphExprParser.RelationalExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        switch (ctx.op.getType()) {
            case GraphExprParser.LT:
                return new Value(left.asDouble() < right.asDouble());
            case GraphExprParser.LTEQ:
                return new Value(left.asDouble() <= right.asDouble());
            case GraphExprParser.GT:
                return new Value(left.asDouble() > right.asDouble());
            case GraphExprParser.GTEQ:
                return new Value(left.asDouble() >= right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + GraphExprParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitEqualityExpr(GraphExprParser.EqualityExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        switch (ctx.op.getType()) {
            case GraphExprParser.EQ:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE) :
                        new Value(left.equals(right));
            case GraphExprParser.NEQ:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE) :
                        new Value(!left.equals(right));
            default:
                throw new RuntimeException("unknown operator: " + GraphExprParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitAndExpr(GraphExprParser.AndExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitGraphAtom(GraphExprParser.GraphAtomContext ctx) {
        return null;
    }

    @Override
    public Value visitVertexAtom(GraphExprParser.VertexAtomContext ctx) {
        return null;
    }

    @Override
    public Value visitEdgeAtom(GraphExprParser.EdgeAtomContext ctx) {
        return null;
    }

    @Override
    public Value visitParExpr(GraphExprParser.ParExprContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public Value visitNumberAtom(GraphExprParser.NumberAtomContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    @Override
    public Value visitBooleanAtom(GraphExprParser.BooleanAtomContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public Value visitIdAtom(GraphExprParser.IdAtomContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if(value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }

    @Override
    public Value visitStringAtom(GraphExprParser.StringAtomContext ctx) {
        String str = ctx.getText();
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    @Override
    public Value visitNullAtom(GraphExprParser.NullAtomContext ctx) {
        return new Value(null);
    }

}
