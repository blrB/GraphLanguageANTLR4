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
		CANGLEBR=9, OBRACKET=10, CBRACKET=11, PUSH=12, PULL=13, NEGATION=14, CONTAIN=15, 
		EQ=16, NEQ=17, IS=18, PLUS=19, IN=20, PRINT=21, IF=22, ELSE=23, WHILE=24, 
		FOREACH=25, MAIN=26, FUNCTION=27, RETURN=28, INT=29, ID=30, STRING=31, 
		COMMENT=32, SPACES=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "ASSIGN", "GRAPH", "VERTEX", "EDGE", "OPAR", "CPAR", "OANGLEBR", 
		"CANGLEBR", "OBRACKET", "CBRACKET", "PUSH", "PULL", "NEGATION", "CONTAIN", 
		"EQ", "NEQ", "IS", "PLUS", "IN", "PRINT", "IF", "ELSE", "WHILE", "FOREACH", 
		"MAIN", "FUNCTION", "RETURN", "INT", "ID", "STRING", "COMMENT", "SPACES"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'='", "'graph'", "'vertex'", "'edge'", "'('", "')'", "'<'", 
		"'>'", "'{'", "'}'", "'<-'", "'->'", "'!'", "'<?>'", "'=='", "'!='", "'is'", 
		"'+'", "'in'", "'print'", "'if'", "'else'", "'while'", "'forEach'", "'main'", 
		"'fn'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ASSIGN", "GRAPH", "VERTEX", "EDGE", "OPAR", "CPAR", "OANGLEBR", 
		"CANGLEBR", "OBRACKET", "CBRACKET", "PUSH", "PULL", "NEGATION", "CONTAIN", 
		"EQ", "NEQ", "IS", "PLUS", "IN", "PRINT", "IF", "ELSE", "WHILE", "FOREACH", 
		"MAIN", "FUNCTION", "RETURN", "INT", "ID", "STRING", "COMMENT", "SPACES"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00d2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\6\36\u00ae\n\36\r\36\16\36\u00af\3\37\3\37\7\37\u00b4\n\37\f"+
		"\37\16\37\u00b7\13\37\3 \3 \3 \3 \7 \u00bd\n \f \16 \u00c0\13 \3 \3 \3"+
		"!\3!\3!\3!\7!\u00c8\n!\f!\16!\u00cb\13!\3!\3!\3\"\3\"\3\"\3\"\2\2#\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#\3\2\b\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17$$\4\2\f\f"+
		"\17\17\5\2\13\f\17\17\"\"\u00d6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2\tO\3\2\2\2\13V\3\2\2\2\r"+
		"[\3\2\2\2\17]\3\2\2\2\21_\3\2\2\2\23a\3\2\2\2\25c\3\2\2\2\27e\3\2\2\2"+
		"\31g\3\2\2\2\33j\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2!s\3\2\2\2#v\3\2\2\2%"+
		"y\3\2\2\2\'|\3\2\2\2)~\3\2\2\2+\u0081\3\2\2\2-\u0087\3\2\2\2/\u008a\3"+
		"\2\2\2\61\u008f\3\2\2\2\63\u0095\3\2\2\2\65\u009d\3\2\2\2\67\u00a2\3\2"+
		"\2\29\u00a5\3\2\2\2;\u00ad\3\2\2\2=\u00b1\3\2\2\2?\u00b8\3\2\2\2A\u00c3"+
		"\3\2\2\2C\u00ce\3\2\2\2EF\7.\2\2F\4\3\2\2\2GH\7?\2\2H\6\3\2\2\2IJ\7i\2"+
		"\2JK\7t\2\2KL\7c\2\2LM\7r\2\2MN\7j\2\2N\b\3\2\2\2OP\7x\2\2PQ\7g\2\2QR"+
		"\7t\2\2RS\7v\2\2ST\7g\2\2TU\7z\2\2U\n\3\2\2\2VW\7g\2\2WX\7f\2\2XY\7i\2"+
		"\2YZ\7g\2\2Z\f\3\2\2\2[\\\7*\2\2\\\16\3\2\2\2]^\7+\2\2^\20\3\2\2\2_`\7"+
		">\2\2`\22\3\2\2\2ab\7@\2\2b\24\3\2\2\2cd\7}\2\2d\26\3\2\2\2ef\7\177\2"+
		"\2f\30\3\2\2\2gh\7>\2\2hi\7/\2\2i\32\3\2\2\2jk\7/\2\2kl\7@\2\2l\34\3\2"+
		"\2\2mn\7#\2\2n\36\3\2\2\2op\7>\2\2pq\7A\2\2qr\7@\2\2r \3\2\2\2st\7?\2"+
		"\2tu\7?\2\2u\"\3\2\2\2vw\7#\2\2wx\7?\2\2x$\3\2\2\2yz\7k\2\2z{\7u\2\2{"+
		"&\3\2\2\2|}\7-\2\2}(\3\2\2\2~\177\7k\2\2\177\u0080\7p\2\2\u0080*\3\2\2"+
		"\2\u0081\u0082\7r\2\2\u0082\u0083\7t\2\2\u0083\u0084\7k\2\2\u0084\u0085"+
		"\7p\2\2\u0085\u0086\7v\2\2\u0086,\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089"+
		"\7h\2\2\u0089.\3\2\2\2\u008a\u008b\7g\2\2\u008b\u008c\7n\2\2\u008c\u008d"+
		"\7u\2\2\u008d\u008e\7g\2\2\u008e\60\3\2\2\2\u008f\u0090\7y\2\2\u0090\u0091"+
		"\7j\2\2\u0091\u0092\7k\2\2\u0092\u0093\7n\2\2\u0093\u0094\7g\2\2\u0094"+
		"\62\3\2\2\2\u0095\u0096\7h\2\2\u0096\u0097\7q\2\2\u0097\u0098\7t\2\2\u0098"+
		"\u0099\7G\2\2\u0099\u009a\7c\2\2\u009a\u009b\7e\2\2\u009b\u009c\7j\2\2"+
		"\u009c\64\3\2\2\2\u009d\u009e\7o\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7"+
		"k\2\2\u00a0\u00a1\7p\2\2\u00a1\66\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4"+
		"\7p\2\2\u00a48\3\2\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8"+
		"\7v\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7p\2\2\u00ab"+
		":\3\2\2\2\u00ac\u00ae\t\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2"+
		"\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0<\3\2\2\2\u00b1\u00b5\t"+
		"\3\2\2\u00b2\u00b4\t\4\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6>\3\2\2\2\u00b7\u00b5\3\2\2\2"+
		"\u00b8\u00be\7$\2\2\u00b9\u00bd\n\5\2\2\u00ba\u00bb\7$\2\2\u00bb\u00bd"+
		"\7$\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c1\u00c2\7$\2\2\u00c2@\3\2\2\2\u00c3\u00c4\7\61\2\2\u00c4\u00c5"+
		"\7\61\2\2\u00c5\u00c9\3\2\2\2\u00c6\u00c8\n\6\2\2\u00c7\u00c6\3\2\2\2"+
		"\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\b!\2\2\u00cdB\3\2\2\2\u00ce\u00cf"+
		"\t\7\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\"\2\2\u00d1D\3\2\2\2\b\2\u00af"+
		"\u00b5\u00bc\u00be\u00c9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}