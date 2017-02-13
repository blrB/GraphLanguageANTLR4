// Generated from /home/andrey/Dropbox/9PIS/ANTLR4/src/GraphExpr.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ASSIGN=2, GRAPH=3, VERTEX=4, EDGE=5, OPAR=6, CPAR=7, OANGLEBR=8, 
		CANGLEBR=9, OBRACKET=10, CBRACKET=11, PUSH=12, PULL=13, CONTAIN=14, EQ=15, 
		NEQ=16, IS=17, IN=18, PRINT=19, IF=20, ELSE=21, WHILE=22, FOREACH=23, 
		MAIN=24, INT=25, ID=26, STRING=27, COMMENT=28, SPACES=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "ASSIGN", "GRAPH", "VERTEX", "EDGE", "OPAR", "CPAR", "OANGLEBR", 
		"CANGLEBR", "OBRACKET", "CBRACKET", "PUSH", "PULL", "CONTAIN", "EQ", "NEQ", 
		"IS", "IN", "PRINT", "IF", "ELSE", "WHILE", "FOREACH", "MAIN", "INT", 
		"ID", "STRING", "COMMENT", "SPACES"
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


	public GraphExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GraphExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00bc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\6\32\u0098\n\32\r\32"+
		"\16\32\u0099\3\33\3\33\7\33\u009e\n\33\f\33\16\33\u00a1\13\33\3\34\3\34"+
		"\3\34\3\34\7\34\u00a7\n\34\f\34\16\34\u00aa\13\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\7\35\u00b2\n\35\f\35\16\35\u00b5\13\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37\3\2\b\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17"+
		"$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u00c0\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2"+
		"\7A\3\2\2\2\tG\3\2\2\2\13N\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21W\3\2\2\2"+
		"\23Y\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31_\3\2\2\2\33b\3\2\2\2\35e\3\2\2"+
		"\2\37i\3\2\2\2!l\3\2\2\2#o\3\2\2\2%r\3\2\2\2\'u\3\2\2\2){\3\2\2\2+~\3"+
		"\2\2\2-\u0083\3\2\2\2/\u0089\3\2\2\2\61\u0091\3\2\2\2\63\u0097\3\2\2\2"+
		"\65\u009b\3\2\2\2\67\u00a2\3\2\2\29\u00ad\3\2\2\2;\u00b8\3\2\2\2=>\7."+
		"\2\2>\4\3\2\2\2?@\7?\2\2@\6\3\2\2\2AB\7i\2\2BC\7t\2\2CD\7c\2\2DE\7r\2"+
		"\2EF\7j\2\2F\b\3\2\2\2GH\7x\2\2HI\7g\2\2IJ\7t\2\2JK\7v\2\2KL\7g\2\2LM"+
		"\7z\2\2M\n\3\2\2\2NO\7g\2\2OP\7f\2\2PQ\7i\2\2QR\7g\2\2R\f\3\2\2\2ST\7"+
		"*\2\2T\16\3\2\2\2UV\7+\2\2V\20\3\2\2\2WX\7>\2\2X\22\3\2\2\2YZ\7@\2\2Z"+
		"\24\3\2\2\2[\\\7}\2\2\\\26\3\2\2\2]^\7\177\2\2^\30\3\2\2\2_`\7>\2\2`a"+
		"\7/\2\2a\32\3\2\2\2bc\7/\2\2cd\7@\2\2d\34\3\2\2\2ef\7>\2\2fg\7A\2\2gh"+
		"\7@\2\2h\36\3\2\2\2ij\7?\2\2jk\7?\2\2k \3\2\2\2lm\7#\2\2mn\7?\2\2n\"\3"+
		"\2\2\2op\7k\2\2pq\7u\2\2q$\3\2\2\2rs\7k\2\2st\7p\2\2t&\3\2\2\2uv\7r\2"+
		"\2vw\7t\2\2wx\7k\2\2xy\7p\2\2yz\7v\2\2z(\3\2\2\2{|\7k\2\2|}\7h\2\2}*\3"+
		"\2\2\2~\177\7g\2\2\177\u0080\7n\2\2\u0080\u0081\7u\2\2\u0081\u0082\7g"+
		"\2\2\u0082,\3\2\2\2\u0083\u0084\7y\2\2\u0084\u0085\7j\2\2\u0085\u0086"+
		"\7k\2\2\u0086\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088.\3\2\2\2\u0089\u008a"+
		"\7h\2\2\u008a\u008b\7q\2\2\u008b\u008c\7t\2\2\u008c\u008d\7G\2\2\u008d"+
		"\u008e\7c\2\2\u008e\u008f\7e\2\2\u008f\u0090\7j\2\2\u0090\60\3\2\2\2\u0091"+
		"\u0092\7o\2\2\u0092\u0093\7c\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2"+
		"\u0095\62\3\2\2\2\u0096\u0098\t\2\2\2\u0097\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\64\3\2\2\2\u009b"+
		"\u009f\t\3\2\2\u009c\u009e\t\4\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\66\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a8\7$\2\2\u00a3\u00a7\n\5\2\2\u00a4\u00a5\7$\2\2\u00a5"+
		"\u00a7\7$\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ac\7$\2\2\u00ac8\3\2\2\2\u00ad\u00ae\7\61\2\2"+
		"\u00ae\u00af\7\61\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b2\n\6\2\2\u00b1\u00b0"+
		"\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\b\35\2\2\u00b7:\3\2\2\2"+
		"\u00b8\u00b9\t\7\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\b\36\2\2\u00bb<\3"+
		"\2\2\2\b\2\u0099\u009f\u00a6\u00a8\u00b3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}