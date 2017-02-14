// Generated from /home/andrey/Dropbox/9PIS/ANTLR4/src/GraphExpr.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ASSIGN=2, GRAPH=3, VERTEX=4, EDGE=5, OPAR=6, CPAR=7, OANGLEBR=8, 
		CANGLEBR=9, OBRACKET=10, CBRACKET=11, PUSH=12, PULL=13, CONTAIN=14, EQ=15, 
		NEQ=16, IS=17, IN=18, PRINT=19, IF=20, ELSE=21, WHILE=22, FOREACH=23, 
		MAIN=24, FUNCTION=25, RETURN=26, INT=27, ID=28, STRING=29, COMMENT=30, 
		SPACES=31;
	public static final int
		RULE_parse = 0, RULE_main = 1, RULE_start = 2, RULE_instruction = 3, RULE_create = 4, 
		RULE_create_graph = 5, RULE_create_vertex = 6, RULE_create_edge = 7, RULE_name_object_graph = 8, 
		RULE_name_object_vertex = 9, RULE_name_object_edge = 10, RULE_connect = 11, 
		RULE_push_in_graph = 12, RULE_pull_from_graph = 13, RULE_push_more = 14, 
		RULE_pull_more = 15, RULE_if_stat = 16, RULE_condition_block = 17, RULE_stat_block = 18, 
		RULE_while_stat = 19, RULE_foreach_stat = 20, RULE_condition = 21, RULE_condition_for_each = 22, 
		RULE_print = 23, RULE_function_call = 24, RULE_param_call = 25, RULE_arg_call = 26, 
		RULE_function = 27, RULE_stat_block_with_return = 28, RULE_return_id = 29, 
		RULE_param = 30, RULE_arg = 31, RULE_type = 32;
	public static final String[] ruleNames = {
		"parse", "main", "start", "instruction", "create", "create_graph", "create_vertex", 
		"create_edge", "name_object_graph", "name_object_vertex", "name_object_edge", 
		"connect", "push_in_graph", "pull_from_graph", "push_more", "pull_more", 
		"if_stat", "condition_block", "stat_block", "while_stat", "foreach_stat", 
		"condition", "condition_for_each", "print", "function_call", "param_call", 
		"arg_call", "function", "stat_block_with_return", "return_id", "param", 
		"arg", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'='", "'graph'", "'vertex'", "'edge'", "'('", "')'", "'<'", 
		"'>'", "'{'", "'}'", "'<-'", "'->'", "'<?>'", "'=='", "'!='", "'is'", 
		"'in'", "'print'", "'if'", "'else'", "'while'", "'forEach'", "'main'", 
		"'fn'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ASSIGN", "GRAPH", "VERTEX", "EDGE", "OPAR", "CPAR", "OANGLEBR", 
		"CANGLEBR", "OBRACKET", "CBRACKET", "PUSH", "PULL", "CONTAIN", "EQ", "NEQ", 
		"IS", "IN", "PRINT", "IF", "ELSE", "WHILE", "FOREACH", "MAIN", "FUNCTION", 
		"RETURN", "INT", "ID", "STRING", "COMMENT", "SPACES"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GraphExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GraphExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GraphExprParser.EOF, 0); }
		public List<CreateContext> create() {
			return getRuleContexts(CreateContext.class);
		}
		public CreateContext create(int i) {
			return getRuleContext(CreateContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPH) | (1L << VERTEX) | (1L << EDGE))) != 0)) {
				{
				{
				setState(66);
				create();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			main();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(73);
				function();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(GraphExprParser.MAIN, 0); }
		public TerminalNode OBRACKET() { return getToken(GraphExprParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(GraphExprParser.CBRACKET, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(MAIN);
			setState(82);
			match(OBRACKET);
			setState(83);
			start();
			setState(84);
			match(CBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPH) | (1L << VERTEX) | (1L << EDGE) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOREACH) | (1L << ID))) != 0)) {
				{
				{
				setState(86);
				instruction();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public Push_in_graphContext push_in_graph() {
			return getRuleContext(Push_in_graphContext.class,0);
		}
		public Pull_from_graphContext pull_from_graph() {
			return getRuleContext(Pull_from_graphContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public Foreach_statContext foreach_stat() {
			return getRuleContext(Foreach_statContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				create();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				push_in_graph();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				pull_from_graph();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				if_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				while_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(98);
				foreach_stat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(99);
				function_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateContext extends ParserRuleContext {
		public Create_graphContext create_graph() {
			return getRuleContext(Create_graphContext.class,0);
		}
		public Create_vertexContext create_vertex() {
			return getRuleContext(Create_vertexContext.class,0);
		}
		public Create_edgeContext create_edge() {
			return getRuleContext(Create_edgeContext.class,0);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_create);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GRAPH:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				create_graph();
				}
				break;
			case VERTEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				create_vertex();
				}
				break;
			case EDGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				create_edge();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_graphContext extends ParserRuleContext {
		public TerminalNode GRAPH() { return getToken(GraphExprParser.GRAPH, 0); }
		public TerminalNode ID() { return getToken(GraphExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GraphExprParser.ASSIGN, 0); }
		public Name_object_graphContext name_object_graph() {
			return getRuleContext(Name_object_graphContext.class,0);
		}
		public Create_graphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_graph; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitCreate_graph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_graphContext create_graph() throws RecognitionException {
		Create_graphContext _localctx = new Create_graphContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(GRAPH);
			setState(108);
			match(ID);
			setState(109);
			match(ASSIGN);
			setState(110);
			name_object_graph();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_vertexContext extends ParserRuleContext {
		public TerminalNode VERTEX() { return getToken(GraphExprParser.VERTEX, 0); }
		public TerminalNode ID() { return getToken(GraphExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GraphExprParser.ASSIGN, 0); }
		public Name_object_vertexContext name_object_vertex() {
			return getRuleContext(Name_object_vertexContext.class,0);
		}
		public Create_vertexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_vertex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitCreate_vertex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_vertexContext create_vertex() throws RecognitionException {
		Create_vertexContext _localctx = new Create_vertexContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_create_vertex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(VERTEX);
			setState(113);
			match(ID);
			setState(114);
			match(ASSIGN);
			setState(115);
			name_object_vertex();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_edgeContext extends ParserRuleContext {
		public TerminalNode EDGE() { return getToken(GraphExprParser.EDGE, 0); }
		public TerminalNode ID() { return getToken(GraphExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GraphExprParser.ASSIGN, 0); }
		public Name_object_edgeContext name_object_edge() {
			return getRuleContext(Name_object_edgeContext.class,0);
		}
		public Create_edgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_edge; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitCreate_edge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_edgeContext create_edge() throws RecognitionException {
		Create_edgeContext _localctx = new Create_edgeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_create_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(EDGE);
			setState(118);
			match(ID);
			setState(119);
			match(ASSIGN);
			setState(120);
			name_object_edge();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Name_object_graphContext extends ParserRuleContext {
		public Name_object_graphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_graph; }
	 
		public Name_object_graphContext() { }
		public void copyFrom(Name_object_graphContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameObjectGraphContext extends Name_object_graphContext {
		public TerminalNode STRING() { return getToken(GraphExprParser.STRING, 0); }
		public NameObjectGraphContext(Name_object_graphContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitNameObjectGraph(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallGraphContext extends Name_object_graphContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallGraphContext(Name_object_graphContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitFunctionCallGraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_graphContext name_object_graph() throws RecognitionException {
		Name_object_graphContext _localctx = new Name_object_graphContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_name_object_graph);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new NameObjectGraphContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(STRING);
				}
				break;
			case ID:
				_localctx = new FunctionCallGraphContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				function_call();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Name_object_vertexContext extends ParserRuleContext {
		public Name_object_vertexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_vertex; }
	 
		public Name_object_vertexContext() { }
		public void copyFrom(Name_object_vertexContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallVertexContext extends Name_object_vertexContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallVertexContext(Name_object_vertexContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitFunctionCallVertex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameObjectVertexContext extends Name_object_vertexContext {
		public TerminalNode STRING() { return getToken(GraphExprParser.STRING, 0); }
		public NameObjectVertexContext(Name_object_vertexContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitNameObjectVertex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_vertexContext name_object_vertex() throws RecognitionException {
		Name_object_vertexContext _localctx = new Name_object_vertexContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_name_object_vertex);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new NameObjectVertexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(STRING);
				}
				break;
			case ID:
				_localctx = new FunctionCallVertexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				function_call();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Name_object_edgeContext extends ParserRuleContext {
		public Name_object_edgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_edge; }
	 
		public Name_object_edgeContext() { }
		public void copyFrom(Name_object_edgeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallEdgeContext extends Name_object_edgeContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallEdgeContext(Name_object_edgeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitFunctionCallEdge(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameObjectEdgeContext extends Name_object_edgeContext {
		public ConnectContext connect() {
			return getRuleContext(ConnectContext.class,0);
		}
		public NameObjectEdgeContext(Name_object_edgeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitNameObjectEdge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_edgeContext name_object_edge() throws RecognitionException {
		Name_object_edgeContext _localctx = new Name_object_edgeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_name_object_edge);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OANGLEBR:
				_localctx = new NameObjectEdgeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				connect();
				}
				break;
			case ID:
				_localctx = new FunctionCallEdgeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				function_call();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConnectContext extends ParserRuleContext {
		public Token source;
		public Token target;
		public TerminalNode OANGLEBR() { return getToken(GraphExprParser.OANGLEBR, 0); }
		public TerminalNode CANGLEBR() { return getToken(GraphExprParser.CANGLEBR, 0); }
		public List<TerminalNode> ID() { return getTokens(GraphExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GraphExprParser.ID, i);
		}
		public ConnectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connect; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitConnect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectContext connect() throws RecognitionException {
		ConnectContext _localctx = new ConnectContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_connect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(OANGLEBR);
			setState(135);
			((ConnectContext)_localctx).source = match(ID);
			setState(136);
			match(T__0);
			setState(137);
			((ConnectContext)_localctx).target = match(ID);
			setState(138);
			match(CANGLEBR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Push_in_graphContext extends ParserRuleContext {
		public Token id;
		public TerminalNode PUSH() { return getToken(GraphExprParser.PUSH, 0); }
		public Push_moreContext push_more() {
			return getRuleContext(Push_moreContext.class,0);
		}
		public TerminalNode ID() { return getToken(GraphExprParser.ID, 0); }
		public Push_in_graphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push_in_graph; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitPush_in_graph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Push_in_graphContext push_in_graph() throws RecognitionException {
		Push_in_graphContext _localctx = new Push_in_graphContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_push_in_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((Push_in_graphContext)_localctx).id = match(ID);
			setState(141);
			match(PUSH);
			setState(142);
			push_more();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pull_from_graphContext extends ParserRuleContext {
		public Token id;
		public TerminalNode PULL() { return getToken(GraphExprParser.PULL, 0); }
		public Pull_moreContext pull_more() {
			return getRuleContext(Pull_moreContext.class,0);
		}
		public TerminalNode ID() { return getToken(GraphExprParser.ID, 0); }
		public Pull_from_graphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pull_from_graph; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitPull_from_graph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pull_from_graphContext pull_from_graph() throws RecognitionException {
		Pull_from_graphContext _localctx = new Pull_from_graphContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pull_from_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			((Pull_from_graphContext)_localctx).id = match(ID);
			setState(145);
			match(PULL);
			setState(146);
			pull_more();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Push_moreContext extends ParserRuleContext {
		public Push_moreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push_more; }
	 
		public Push_moreContext() { }
		public void copyFrom(Push_moreContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PushMoreContext extends Push_moreContext {
		public TerminalNode ID() { return getToken(GraphExprParser.ID, 0); }
		public Push_moreContext push_more() {
			return getRuleContext(Push_moreContext.class,0);
		}
		public PushMoreContext(Push_moreContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitPushMore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PushOneContext extends Push_moreContext {
		public TerminalNode ID() { return getToken(GraphExprParser.ID, 0); }
		public PushOneContext(Push_moreContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitPushOne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Push_moreContext push_more() throws RecognitionException {
		Push_moreContext _localctx = new Push_moreContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_push_more);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PushMoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(ID);
				setState(149);
				match(T__0);
				setState(150);
				push_more();
				}
				break;
			case 2:
				_localctx = new PushOneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pull_moreContext extends ParserRuleContext {
		public Pull_moreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pull_more; }
	 
		public Pull_moreContext() { }
		public void copyFrom(Pull_moreContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PullMoreContext extends Pull_moreContext {
		public TerminalNode ID() { return getToken(GraphExprParser.ID, 0); }
		public Pull_moreContext pull_more() {
			return getRuleContext(Pull_moreContext.class,0);
		}
		public PullMoreContext(Pull_moreContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitPullMore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PullOneContext extends Pull_moreContext {
		public TerminalNode ID() { return getToken(GraphExprParser.ID, 0); }
		public PullOneContext(Pull_moreContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitPullOne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pull_moreContext pull_more() throws RecognitionException {
		Pull_moreContext _localctx = new Pull_moreContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pull_more);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new PullMoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(ID);
				setState(155);
				match(T__0);
				setState(156);
				pull_more();
				}
				break;
			case 2:
				_localctx = new PullOneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(GraphExprParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(GraphExprParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(GraphExprParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(GraphExprParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_stat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(IF);
			setState(161);
			condition_block();
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					match(ELSE);
					setState(163);
					match(IF);
					setState(164);
					condition_block();
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(170);
				match(ELSE);
				setState(171);
				stat_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(GraphExprParser.OPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(GraphExprParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(OPAR);
			setState(175);
			condition();
			setState(176);
			match(CPAR);
			setState(177);
			stat_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACKET() { return getToken(GraphExprParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(GraphExprParser.CBRACKET, 0); }
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stat_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(OBRACKET);
			setState(180);
			start();
			setState(181);
			match(CBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GraphExprParser.WHILE, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(WHILE);
			setState(184);
			condition_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreach_statContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(GraphExprParser.FOREACH, 0); }
		public TerminalNode OPAR() { return getToken(GraphExprParser.OPAR, 0); }
		public Condition_for_eachContext condition_for_each() {
			return getRuleContext(Condition_for_eachContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(GraphExprParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Foreach_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitForeach_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_statContext foreach_stat() throws RecognitionException {
		Foreach_statContext _localctx = new Foreach_statContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_foreach_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(FOREACH);
			setState(187);
			match(OPAR);
			setState(188);
			condition_for_each();
			setState(189);
			match(CPAR);
			setState(190);
			stat_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CheckTypeContext extends ConditionContext {
		public TerminalNode ID() { return getToken(GraphExprParser.ID, 0); }
		public TerminalNode IS() { return getToken(GraphExprParser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CheckTypeContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitCheckType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainContext extends ConditionContext {
		public List<TerminalNode> ID() { return getTokens(GraphExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GraphExprParser.ID, i);
		}
		public TerminalNode CONTAIN() { return getToken(GraphExprParser.CONTAIN, 0); }
		public ContainContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitContain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ConditionContext {
		public Token op;
		public List<TerminalNode> ID() { return getTokens(GraphExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GraphExprParser.ID, i);
		}
		public TerminalNode EQ() { return getToken(GraphExprParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(GraphExprParser.NEQ, 0); }
		public EqualityExprContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_condition);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new EqualityExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(ID);
				setState(193);
				((EqualityExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NEQ) ) {
					((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(194);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ContainContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(ID);
				setState(196);
				match(CONTAIN);
				setState(197);
				match(ID);
				}
				break;
			case 3:
				_localctx = new CheckTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(ID);
				setState(199);
				match(IS);
				setState(200);
				type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_for_eachContext extends ParserRuleContext {
		public Condition_for_eachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_for_each; }
	 
		public Condition_for_eachContext() { }
		public void copyFrom(Condition_for_eachContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForEachVertexContext extends Condition_for_eachContext {
		public TerminalNode VERTEX() { return getToken(GraphExprParser.VERTEX, 0); }
		public List<TerminalNode> ID() { return getTokens(GraphExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GraphExprParser.ID, i);
		}
		public TerminalNode IN() { return getToken(GraphExprParser.IN, 0); }
		public ForEachVertexContext(Condition_for_eachContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitForEachVertex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForEachEdgeContext extends Condition_for_eachContext {
		public TerminalNode EDGE() { return getToken(GraphExprParser.EDGE, 0); }
		public List<TerminalNode> ID() { return getTokens(GraphExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GraphExprParser.ID, i);
		}
		public TerminalNode IN() { return getToken(GraphExprParser.IN, 0); }
		public ForEachEdgeContext(Condition_for_eachContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitForEachEdge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_for_eachContext condition_for_each() throws RecognitionException {
		Condition_for_eachContext _localctx = new Condition_for_eachContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condition_for_each);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERTEX:
				_localctx = new ForEachVertexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(VERTEX);
				setState(204);
				match(ID);
				setState(205);
				match(IN);
				setState(206);
				match(ID);
				}
				break;
			case EDGE:
				_localctx = new ForEachEdgeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(EDGE);
				setState(208);
				match(ID);
				setState(209);
				match(IN);
				setState(210);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GraphExprParser.PRINT, 0); }
		public TerminalNode STRING() { return getToken(GraphExprParser.STRING, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(PRINT);
			setState(214);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraphExprParser.ID, 0); }
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(ID);
			setState(217);
			param_call();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_callContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(GraphExprParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(GraphExprParser.CPAR, 0); }
		public Arg_callContext arg_call() {
			return getRuleContext(Arg_callContext.class,0);
		}
		public Param_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitParam_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_callContext param_call() throws RecognitionException {
		Param_callContext _localctx = new Param_callContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_param_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(OPAR);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(220);
				arg_call();
				}
			}

			setState(223);
			match(CPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_callContext extends ParserRuleContext {
		public Arg_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_call; }
	 
		public Arg_callContext() { }
		public void copyFrom(Arg_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamCallArgsContext extends Arg_callContext {
		public TerminalNode ID() { return getToken(GraphExprParser.ID, 0); }
		public Arg_callContext arg_call() {
			return getRuleContext(Arg_callContext.class,0);
		}
		public ParamCallArgsContext(Arg_callContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitParamCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamCallArgContext extends Arg_callContext {
		public TerminalNode ID() { return getToken(GraphExprParser.ID, 0); }
		public ParamCallArgContext(Arg_callContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitParamCallArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_callContext arg_call() throws RecognitionException {
		Arg_callContext _localctx = new Arg_callContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arg_call);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ParamCallArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamCallArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(ID);
				setState(227);
				match(T__0);
				setState(228);
				arg_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnFunctionContext extends FunctionContext {
		public TerminalNode FUNCTION() { return getToken(GraphExprParser.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GraphExprParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Stat_block_with_returnContext stat_block_with_return() {
			return getRuleContext(Stat_block_with_returnContext.class,0);
		}
		public ReturnFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitReturnFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidFunctionContext extends FunctionContext {
		public TerminalNode FUNCTION() { return getToken(GraphExprParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(GraphExprParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public VoidFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitVoidFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_function);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new VoidFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(FUNCTION);
				setState(232);
				match(ID);
				setState(233);
				param();
				setState(234);
				stat_block();
				}
				break;
			case 2:
				_localctx = new ReturnFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(FUNCTION);
				setState(237);
				type();
				setState(238);
				match(ID);
				setState(239);
				param();
				setState(240);
				stat_block_with_return();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stat_block_with_returnContext extends ParserRuleContext {
		public TerminalNode OBRACKET() { return getToken(GraphExprParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public Return_idContext return_id() {
			return getRuleContext(Return_idContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(GraphExprParser.CBRACKET, 0); }
		public Stat_block_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block_with_return; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitStat_block_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_block_with_returnContext stat_block_with_return() throws RecognitionException {
		Stat_block_with_returnContext _localctx = new Stat_block_with_returnContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_stat_block_with_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(OBRACKET);
			setState(245);
			start();
			setState(246);
			return_id();
			setState(247);
			match(CBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_idContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(GraphExprParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(GraphExprParser.ID, 0); }
		public Return_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitReturn_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_idContext return_id() throws RecognitionException {
		Return_idContext _localctx = new Return_idContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_return_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(RETURN);
			setState(250);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(GraphExprParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(GraphExprParser.CPAR, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(OPAR);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPH) | (1L << VERTEX) | (1L << EDGE))) != 0)) {
				{
				setState(253);
				arg();
				}
			}

			setState(256);
			match(CPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	 
		public ArgContext() { }
		public void copyFrom(ArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamArgsContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GraphExprParser.ID, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ParamArgsContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitParamArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamArgContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GraphExprParser.ID, 0); }
		public ParamArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitParamArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arg);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ParamArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				type();
				setState(259);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				type();
				setState(262);
				match(ID);
				setState(263);
				match(T__0);
				setState(264);
				arg();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode VERTEX() { return getToken(GraphExprParser.VERTEX, 0); }
		public TerminalNode EDGE() { return getToken(GraphExprParser.EDGE, 0); }
		public TerminalNode GRAPH() { return getToken(GraphExprParser.GRAPH, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPH) | (1L << VERTEX) | (1L << EDGE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\7\2M\n\2\f\2\16\2P\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5g\n\5\3\6\3\6\3\6\5\6l\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n\177\n\n\3\13\3\13"+
		"\5\13\u0083\n\13\3\f\3\f\5\f\u0087\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u009b\n\20"+
		"\3\21\3\21\3\21\3\21\5\21\u00a1\n\21\3\22\3\22\3\22\3\22\3\22\7\22\u00a8"+
		"\n\22\f\22\16\22\u00ab\13\22\3\22\3\22\5\22\u00af\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00cc\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00d6\n\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\5\33\u00e0\n\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34"+
		"\u00e8\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u00f5\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \5 \u0101\n "+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u010d\n!\3\"\3\"\3\"\2\2#\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\4\3\2\21\22"+
		"\3\2\5\7\u010a\2G\3\2\2\2\4S\3\2\2\2\6[\3\2\2\2\bf\3\2\2\2\nk\3\2\2\2"+
		"\fm\3\2\2\2\16r\3\2\2\2\20w\3\2\2\2\22~\3\2\2\2\24\u0082\3\2\2\2\26\u0086"+
		"\3\2\2\2\30\u0088\3\2\2\2\32\u008e\3\2\2\2\34\u0092\3\2\2\2\36\u009a\3"+
		"\2\2\2 \u00a0\3\2\2\2\"\u00a2\3\2\2\2$\u00b0\3\2\2\2&\u00b5\3\2\2\2(\u00b9"+
		"\3\2\2\2*\u00bc\3\2\2\2,\u00cb\3\2\2\2.\u00d5\3\2\2\2\60\u00d7\3\2\2\2"+
		"\62\u00da\3\2\2\2\64\u00dd\3\2\2\2\66\u00e7\3\2\2\28\u00f4\3\2\2\2:\u00f6"+
		"\3\2\2\2<\u00fb\3\2\2\2>\u00fe\3\2\2\2@\u010c\3\2\2\2B\u010e\3\2\2\2D"+
		"F\5\n\6\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2"+
		"JN\5\4\3\2KM\58\35\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2"+
		"PN\3\2\2\2QR\7\2\2\3R\3\3\2\2\2ST\7\32\2\2TU\7\f\2\2UV\5\6\4\2VW\7\r\2"+
		"\2W\5\3\2\2\2XZ\5\b\5\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\7\3"+
		"\2\2\2][\3\2\2\2^g\5\n\6\2_g\5\32\16\2`g\5\34\17\2ag\5\60\31\2bg\5\"\22"+
		"\2cg\5(\25\2dg\5*\26\2eg\5\62\32\2f^\3\2\2\2f_\3\2\2\2f`\3\2\2\2fa\3\2"+
		"\2\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\t\3\2\2\2hl\5\f\7\2il\5"+
		"\16\b\2jl\5\20\t\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\13\3\2\2\2mn\7\5\2\2"+
		"no\7\36\2\2op\7\4\2\2pq\5\22\n\2q\r\3\2\2\2rs\7\6\2\2st\7\36\2\2tu\7\4"+
		"\2\2uv\5\24\13\2v\17\3\2\2\2wx\7\7\2\2xy\7\36\2\2yz\7\4\2\2z{\5\26\f\2"+
		"{\21\3\2\2\2|\177\7\37\2\2}\177\5\62\32\2~|\3\2\2\2~}\3\2\2\2\177\23\3"+
		"\2\2\2\u0080\u0083\7\37\2\2\u0081\u0083\5\62\32\2\u0082\u0080\3\2\2\2"+
		"\u0082\u0081\3\2\2\2\u0083\25\3\2\2\2\u0084\u0087\5\30\r\2\u0085\u0087"+
		"\5\62\32\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\27\3\2\2\2\u0088"+
		"\u0089\7\n\2\2\u0089\u008a\7\36\2\2\u008a\u008b\7\3\2\2\u008b\u008c\7"+
		"\36\2\2\u008c\u008d\7\13\2\2\u008d\31\3\2\2\2\u008e\u008f\7\36\2\2\u008f"+
		"\u0090\7\16\2\2\u0090\u0091\5\36\20\2\u0091\33\3\2\2\2\u0092\u0093\7\36"+
		"\2\2\u0093\u0094\7\17\2\2\u0094\u0095\5 \21\2\u0095\35\3\2\2\2\u0096\u0097"+
		"\7\36\2\2\u0097\u0098\7\3\2\2\u0098\u009b\5\36\20\2\u0099\u009b\7\36\2"+
		"\2\u009a\u0096\3\2\2\2\u009a\u0099\3\2\2\2\u009b\37\3\2\2\2\u009c\u009d"+
		"\7\36\2\2\u009d\u009e\7\3\2\2\u009e\u00a1\5 \21\2\u009f\u00a1\7\36\2\2"+
		"\u00a0\u009c\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1!\3\2\2\2\u00a2\u00a3\7"+
		"\26\2\2\u00a3\u00a9\5$\23\2\u00a4\u00a5\7\27\2\2\u00a5\u00a6\7\26\2\2"+
		"\u00a6\u00a8\5$\23\2\u00a7\u00a4\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ad\7\27\2\2\u00ad\u00af\5&\24\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3"+
		"\2\2\2\u00af#\3\2\2\2\u00b0\u00b1\7\b\2\2\u00b1\u00b2\5,\27\2\u00b2\u00b3"+
		"\7\t\2\2\u00b3\u00b4\5&\24\2\u00b4%\3\2\2\2\u00b5\u00b6\7\f\2\2\u00b6"+
		"\u00b7\5\6\4\2\u00b7\u00b8\7\r\2\2\u00b8\'\3\2\2\2\u00b9\u00ba\7\30\2"+
		"\2\u00ba\u00bb\5$\23\2\u00bb)\3\2\2\2\u00bc\u00bd\7\31\2\2\u00bd\u00be"+
		"\7\b\2\2\u00be\u00bf\5.\30\2\u00bf\u00c0\7\t\2\2\u00c0\u00c1\5&\24\2\u00c1"+
		"+\3\2\2\2\u00c2\u00c3\7\36\2\2\u00c3\u00c4\t\2\2\2\u00c4\u00cc\7\36\2"+
		"\2\u00c5\u00c6\7\36\2\2\u00c6\u00c7\7\20\2\2\u00c7\u00cc\7\36\2\2\u00c8"+
		"\u00c9\7\36\2\2\u00c9\u00ca\7\23\2\2\u00ca\u00cc\5B\"\2\u00cb\u00c2\3"+
		"\2\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc-\3\2\2\2\u00cd\u00ce"+
		"\7\6\2\2\u00ce\u00cf\7\36\2\2\u00cf\u00d0\7\24\2\2\u00d0\u00d6\7\36\2"+
		"\2\u00d1\u00d2\7\7\2\2\u00d2\u00d3\7\36\2\2\u00d3\u00d4\7\24\2\2\u00d4"+
		"\u00d6\7\36\2\2\u00d5\u00cd\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6/\3\2\2\2"+
		"\u00d7\u00d8\7\25\2\2\u00d8\u00d9\7\37\2\2\u00d9\61\3\2\2\2\u00da\u00db"+
		"\7\36\2\2\u00db\u00dc\5\64\33\2\u00dc\63\3\2\2\2\u00dd\u00df\7\b\2\2\u00de"+
		"\u00e0\5\66\34\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3"+
		"\2\2\2\u00e1\u00e2\7\t\2\2\u00e2\65\3\2\2\2\u00e3\u00e8\7\36\2\2\u00e4"+
		"\u00e5\7\36\2\2\u00e5\u00e6\7\3\2\2\u00e6\u00e8\5\66\34\2\u00e7\u00e3"+
		"\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e8\67\3\2\2\2\u00e9\u00ea\7\33\2\2\u00ea"+
		"\u00eb\7\36\2\2\u00eb\u00ec\5> \2\u00ec\u00ed\5&\24\2\u00ed\u00f5\3\2"+
		"\2\2\u00ee\u00ef\7\33\2\2\u00ef\u00f0\5B\"\2\u00f0\u00f1\7\36\2\2\u00f1"+
		"\u00f2\5> \2\u00f2\u00f3\5:\36\2\u00f3\u00f5\3\2\2\2\u00f4\u00e9\3\2\2"+
		"\2\u00f4\u00ee\3\2\2\2\u00f59\3\2\2\2\u00f6\u00f7\7\f\2\2\u00f7\u00f8"+
		"\5\6\4\2\u00f8\u00f9\5<\37\2\u00f9\u00fa\7\r\2\2\u00fa;\3\2\2\2\u00fb"+
		"\u00fc\7\34\2\2\u00fc\u00fd\7\36\2\2\u00fd=\3\2\2\2\u00fe\u0100\7\b\2"+
		"\2\u00ff\u0101\5@!\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0103\7\t\2\2\u0103?\3\2\2\2\u0104\u0105\5B\"\2\u0105\u0106"+
		"\7\36\2\2\u0106\u010d\3\2\2\2\u0107\u0108\5B\"\2\u0108\u0109\7\36\2\2"+
		"\u0109\u010a\7\3\2\2\u010a\u010b\5@!\2\u010b\u010d\3\2\2\2\u010c\u0104"+
		"\3\2\2\2\u010c\u0107\3\2\2\2\u010dA\3\2\2\2\u010e\u010f\t\3\2\2\u010f"+
		"C\3\2\2\2\25GN[fk~\u0082\u0086\u009a\u00a0\u00a9\u00ae\u00cb\u00d5\u00df"+
		"\u00e7\u00f4\u0100\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}