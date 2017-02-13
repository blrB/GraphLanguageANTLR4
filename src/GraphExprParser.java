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
		MAIN=24, INT=25, ID=26, STRING=27, COMMENT=28, SPACES=29;
	public static final int
		RULE_parse = 0, RULE_main = 1, RULE_start = 2, RULE_instruction = 3, RULE_create = 4, 
		RULE_create_graph = 5, RULE_create_vertex = 6, RULE_create_edge = 7, RULE_name_object = 8, 
		RULE_connect = 9, RULE_push_in_graph = 10, RULE_pull_from_graph = 11, 
		RULE_push_more = 12, RULE_pull_more = 13, RULE_if_stat = 14, RULE_condition_block = 15, 
		RULE_stat_block = 16, RULE_while_stat = 17, RULE_foreach_stat = 18, RULE_condition = 19, 
		RULE_condition_for_each = 20, RULE_print = 21, RULE_type = 22;
	public static final String[] ruleNames = {
		"parse", "main", "start", "instruction", "create", "create_graph", "create_vertex", 
		"create_edge", "name_object", "connect", "push_in_graph", "pull_from_graph", 
		"push_more", "pull_more", "if_stat", "condition_block", "stat_block", 
		"while_stat", "foreach_stat", "condition", "condition_for_each", "print", 
		"type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'='", "'graph'", "'vertex'", "'edge'", "'('", "')'", "'<'", 
		"'>'", "'{'", "'}'", "'<-'", "'->'", "'<?>'", "'=='", "'!='", "'is'", 
		"'in'", "'print'", "'if'", "'else'", "'while'", "'forEach'", "'main'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ASSIGN", "GRAPH", "VERTEX", "EDGE", "OPAR", "CPAR", "OANGLEBR", 
		"CANGLEBR", "OBRACKET", "CBRACKET", "PUSH", "PULL", "CONTAIN", "EQ", "NEQ", 
		"IS", "IN", "PRINT", "IF", "ELSE", "WHILE", "FOREACH", "MAIN", "INT", 
		"ID", "STRING", "COMMENT", "SPACES"
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPH) | (1L << VERTEX) | (1L << EDGE))) != 0)) {
				{
				{
				setState(46);
				create();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			main();
			setState(53);
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
			setState(55);
			match(MAIN);
			setState(56);
			match(OBRACKET);
			setState(57);
			start();
			setState(58);
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPH) | (1L << VERTEX) | (1L << EDGE) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOREACH) | (1L << ID))) != 0)) {
				{
				{
				setState(60);
				instruction();
				}
				}
				setState(65);
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
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				create();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				push_in_graph();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				pull_from_graph();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				if_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				while_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				foreach_stat();
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
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GRAPH:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				create_graph();
				}
				break;
			case VERTEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				create_vertex();
				}
				break;
			case EDGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
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
		public Name_objectContext name_object() {
			return getRuleContext(Name_objectContext.class,0);
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
			setState(80);
			match(GRAPH);
			setState(81);
			match(ID);
			setState(82);
			match(ASSIGN);
			setState(83);
			name_object();
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
		public Name_objectContext name_object() {
			return getRuleContext(Name_objectContext.class,0);
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
			setState(85);
			match(VERTEX);
			setState(86);
			match(ID);
			setState(87);
			match(ASSIGN);
			setState(88);
			name_object();
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
		public ConnectContext connect() {
			return getRuleContext(ConnectContext.class,0);
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
			setState(90);
			match(EDGE);
			setState(91);
			match(ID);
			setState(92);
			match(ASSIGN);
			setState(93);
			connect();
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

	public static class Name_objectContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GraphExprParser.STRING, 0); }
		public Name_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphExprVisitor ) return ((GraphExprVisitor<? extends T>)visitor).visitName_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_objectContext name_object() throws RecognitionException {
		Name_objectContext _localctx = new Name_objectContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_name_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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
		enterRule(_localctx, 18, RULE_connect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(OANGLEBR);
			setState(98);
			((ConnectContext)_localctx).source = match(ID);
			setState(99);
			match(T__0);
			setState(100);
			((ConnectContext)_localctx).target = match(ID);
			setState(101);
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
		enterRule(_localctx, 20, RULE_push_in_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((Push_in_graphContext)_localctx).id = match(ID);
			setState(104);
			match(PUSH);
			setState(105);
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
		enterRule(_localctx, 22, RULE_pull_from_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			((Pull_from_graphContext)_localctx).id = match(ID);
			setState(108);
			match(PULL);
			setState(109);
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
		enterRule(_localctx, 24, RULE_push_more);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new PushMoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(ID);
				setState(112);
				match(T__0);
				setState(113);
				push_more();
				}
				break;
			case 2:
				_localctx = new PushOneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
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
		enterRule(_localctx, 26, RULE_pull_more);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new PullMoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(ID);
				setState(118);
				match(T__0);
				setState(119);
				pull_more();
				}
				break;
			case 2:
				_localctx = new PullOneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
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
		enterRule(_localctx, 28, RULE_if_stat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IF);
			setState(124);
			condition_block();
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(125);
					match(ELSE);
					setState(126);
					match(IF);
					setState(127);
					condition_block();
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(133);
				match(ELSE);
				setState(134);
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
		enterRule(_localctx, 30, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(OPAR);
			setState(138);
			condition();
			setState(139);
			match(CPAR);
			setState(140);
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
		enterRule(_localctx, 32, RULE_stat_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(OBRACKET);
			setState(143);
			start();
			setState(144);
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
		enterRule(_localctx, 34, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(WHILE);
			setState(147);
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
		enterRule(_localctx, 36, RULE_foreach_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(FOREACH);
			setState(150);
			match(OPAR);
			setState(151);
			condition_for_each();
			setState(152);
			match(CPAR);
			setState(153);
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
		enterRule(_localctx, 38, RULE_condition);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new EqualityExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(ID);
				setState(156);
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
				setState(157);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ContainContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(ID);
				setState(159);
				match(CONTAIN);
				setState(160);
				match(ID);
				}
				break;
			case 3:
				_localctx = new CheckTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(ID);
				setState(162);
				match(IS);
				setState(163);
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
		enterRule(_localctx, 40, RULE_condition_for_each);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERTEX:
				_localctx = new ForEachVertexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(VERTEX);
				setState(167);
				match(ID);
				setState(168);
				match(IN);
				setState(169);
				match(ID);
				}
				break;
			case EDGE:
				_localctx = new ForEachEdgeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(EDGE);
				setState(171);
				match(ID);
				setState(172);
				match(IN);
				setState(173);
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
		enterRule(_localctx, 42, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(PRINT);
			setState(177);
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
		enterRule(_localctx, 44, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u00b8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\7\4@\n\4\f\4"+
		"\16\4C\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5L\n\5\3\6\3\6\3\6\5\6Q\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\5\16v\n\16\3\17\3\17\3\17\3\17\5\17|\n\17\3\20\3\20\3\20\3"+
		"\20\3\20\7\20\u0083\n\20\f\20\16\20\u0086\13\20\3\20\3\20\5\20\u008a\n"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u00a7\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00b1\n\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\2\4\3\2\21\22\3\2\5\7\u00b1\2\63\3\2\2\2\49\3\2\2\2\6"+
		"A\3\2\2\2\bK\3\2\2\2\nP\3\2\2\2\fR\3\2\2\2\16W\3\2\2\2\20\\\3\2\2\2\22"+
		"a\3\2\2\2\24c\3\2\2\2\26i\3\2\2\2\30m\3\2\2\2\32u\3\2\2\2\34{\3\2\2\2"+
		"\36}\3\2\2\2 \u008b\3\2\2\2\"\u0090\3\2\2\2$\u0094\3\2\2\2&\u0097\3\2"+
		"\2\2(\u00a6\3\2\2\2*\u00b0\3\2\2\2,\u00b2\3\2\2\2.\u00b5\3\2\2\2\60\62"+
		"\5\n\6\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66"+
		"\3\2\2\2\65\63\3\2\2\2\66\67\5\4\3\2\678\7\2\2\38\3\3\2\2\29:\7\32\2\2"+
		":;\7\f\2\2;<\5\6\4\2<=\7\r\2\2=\5\3\2\2\2>@\5\b\5\2?>\3\2\2\2@C\3\2\2"+
		"\2A?\3\2\2\2AB\3\2\2\2B\7\3\2\2\2CA\3\2\2\2DL\5\n\6\2EL\5\26\f\2FL\5\30"+
		"\r\2GL\5,\27\2HL\5\36\20\2IL\5$\23\2JL\5&\24\2KD\3\2\2\2KE\3\2\2\2KF\3"+
		"\2\2\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\t\3\2\2\2MQ\5\f\7\2NQ"+
		"\5\16\b\2OQ\5\20\t\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\13\3\2\2\2RS\7\5\2"+
		"\2ST\7\34\2\2TU\7\4\2\2UV\5\22\n\2V\r\3\2\2\2WX\7\6\2\2XY\7\34\2\2YZ\7"+
		"\4\2\2Z[\5\22\n\2[\17\3\2\2\2\\]\7\7\2\2]^\7\34\2\2^_\7\4\2\2_`\5\24\13"+
		"\2`\21\3\2\2\2ab\7\35\2\2b\23\3\2\2\2cd\7\n\2\2de\7\34\2\2ef\7\3\2\2f"+
		"g\7\34\2\2gh\7\13\2\2h\25\3\2\2\2ij\7\34\2\2jk\7\16\2\2kl\5\32\16\2l\27"+
		"\3\2\2\2mn\7\34\2\2no\7\17\2\2op\5\34\17\2p\31\3\2\2\2qr\7\34\2\2rs\7"+
		"\3\2\2sv\5\32\16\2tv\7\34\2\2uq\3\2\2\2ut\3\2\2\2v\33\3\2\2\2wx\7\34\2"+
		"\2xy\7\3\2\2y|\5\34\17\2z|\7\34\2\2{w\3\2\2\2{z\3\2\2\2|\35\3\2\2\2}~"+
		"\7\26\2\2~\u0084\5 \21\2\177\u0080\7\27\2\2\u0080\u0081\7\26\2\2\u0081"+
		"\u0083\5 \21\2\u0082\177\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2"+
		"\2\u0084\u0085\3\2\2\2\u0085\u0089\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088"+
		"\7\27\2\2\u0088\u008a\5\"\22\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2"+
		"\u008a\37\3\2\2\2\u008b\u008c\7\b\2\2\u008c\u008d\5(\25\2\u008d\u008e"+
		"\7\t\2\2\u008e\u008f\5\"\22\2\u008f!\3\2\2\2\u0090\u0091\7\f\2\2\u0091"+
		"\u0092\5\6\4\2\u0092\u0093\7\r\2\2\u0093#\3\2\2\2\u0094\u0095\7\30\2\2"+
		"\u0095\u0096\5 \21\2\u0096%\3\2\2\2\u0097\u0098\7\31\2\2\u0098\u0099\7"+
		"\b\2\2\u0099\u009a\5*\26\2\u009a\u009b\7\t\2\2\u009b\u009c\5\"\22\2\u009c"+
		"\'\3\2\2\2\u009d\u009e\7\34\2\2\u009e\u009f\t\2\2\2\u009f\u00a7\7\34\2"+
		"\2\u00a0\u00a1\7\34\2\2\u00a1\u00a2\7\20\2\2\u00a2\u00a7\7\34\2\2\u00a3"+
		"\u00a4\7\34\2\2\u00a4\u00a5\7\23\2\2\u00a5\u00a7\5.\30\2\u00a6\u009d\3"+
		"\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7)\3\2\2\2\u00a8\u00a9"+
		"\7\6\2\2\u00a9\u00aa\7\34\2\2\u00aa\u00ab\7\24\2\2\u00ab\u00b1\7\34\2"+
		"\2\u00ac\u00ad\7\7\2\2\u00ad\u00ae\7\34\2\2\u00ae\u00af\7\24\2\2\u00af"+
		"\u00b1\7\34\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b1+\3\2\2\2"+
		"\u00b2\u00b3\7\25\2\2\u00b3\u00b4\7\35\2\2\u00b4-\3\2\2\2\u00b5\u00b6"+
		"\t\3\2\2\u00b6/\3\2\2\2\f\63AKPu{\u0084\u0089\u00a6\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}