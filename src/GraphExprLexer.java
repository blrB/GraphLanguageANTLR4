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
		NOT=1, AND=2, OR=3, EQ=4, NEQ=5, GT=6, LT=7, GTEQ=8, LTEQ=9, PLUS=10, 
		MINUS=11, MULT=12, DIV=13, MOD=14, POW=15, ASSIGN=16, SCOL=17, OPAR=18, 
		CPAR=19, OBRACE=20, CBRACE=21, OSQBRACE=22, CSQBRACE=23, TRUE=24, FALSE=25, 
		NULL=26, IF=27, ELSE=28, WHILE=29, FOREACH=30, PRINT=31, PUSH=32, PULL=33, 
		CONTAIN=34, GRAPH=35, VERTEX=36, EDGE=37, ID=38, INT=39, FLOAT=40, STRING=41, 
		COMMENT=42, SPACE=43, OTHER=44;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NOT", "AND", "OR", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", 
		"MULT", "DIV", "MOD", "POW", "ASSIGN", "SCOL", "OPAR", "CPAR", "OBRACE", 
		"CBRACE", "OSQBRACE", "CSQBRACE", "TRUE", "FALSE", "NULL", "IF", "ELSE", 
		"WHILE", "FOREACH", "PRINT", "PUSH", "PULL", "CONTAIN", "GRAPH", "VERTEX", 
		"EDGE", "ID", "INT", "FLOAT", "STRING", "COMMENT", "SPACE", "OTHER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", "'&&'", "'||'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'='", "';'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "'true'", "'false'", "'null'", "'if'", "'else'", 
		"'while'", "'forEach'", "'print'", "'<-'", "'->'", "'<?>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NOT", "AND", "OR", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", 
		"MINUS", "MULT", "DIV", "MOD", "POW", "ASSIGN", "SCOL", "OPAR", "CPAR", 
		"OBRACE", "CBRACE", "OSQBRACE", "CSQBRACE", "TRUE", "FALSE", "NULL", "IF", 
		"ELSE", "WHILE", "FOREACH", "PRINT", "PUSH", "PULL", "CONTAIN", "GRAPH", 
		"VERTEX", "EDGE", "ID", "INT", "FLOAT", "STRING", "COMMENT", "SPACE", 
		"OTHER"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u0121\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\7\'\u00e8\n\'\f\'\16\'\u00eb\13\'\3(\6"+
		"(\u00ee\n(\r(\16(\u00ef\3)\6)\u00f3\n)\r)\16)\u00f4\3)\3)\7)\u00f9\n)"+
		"\f)\16)\u00fc\13)\3)\3)\6)\u0100\n)\r)\16)\u0101\5)\u0104\n)\3*\3*\3*"+
		"\3*\7*\u010a\n*\f*\16*\u010d\13*\3*\3*\3+\3+\3+\3+\7+\u0115\n+\f+\16+"+
		"\u0118\13+\3+\3+\3,\3,\3,\3,\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\f\f\17\17$$\4\2\f\f\17"+
		"\17\5\2\13\f\17\17\"\"\u0129\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2"+
		"\5]\3\2\2\2\7`\3\2\2\2\tc\3\2\2\2\13f\3\2\2\2\ri\3\2\2\2\17k\3\2\2\2\21"+
		"m\3\2\2\2\23p\3\2\2\2\25s\3\2\2\2\27u\3\2\2\2\31w\3\2\2\2\33y\3\2\2\2"+
		"\35{\3\2\2\2\37}\3\2\2\2!\177\3\2\2\2#\u0081\3\2\2\2%\u0083\3\2\2\2\'"+
		"\u0085\3\2\2\2)\u0087\3\2\2\2+\u0089\3\2\2\2-\u008b\3\2\2\2/\u008d\3\2"+
		"\2\2\61\u008f\3\2\2\2\63\u0094\3\2\2\2\65\u009a\3\2\2\2\67\u009f\3\2\2"+
		"\29\u00a2\3\2\2\2;\u00a7\3\2\2\2=\u00ad\3\2\2\2?\u00b5\3\2\2\2A\u00bb"+
		"\3\2\2\2C\u00be\3\2\2\2E\u00c1\3\2\2\2G\u00c5\3\2\2\2I\u00cf\3\2\2\2K"+
		"\u00da\3\2\2\2M\u00e5\3\2\2\2O\u00ed\3\2\2\2Q\u0103\3\2\2\2S\u0105\3\2"+
		"\2\2U\u0110\3\2\2\2W\u011b\3\2\2\2Y\u011f\3\2\2\2[\\\7#\2\2\\\4\3\2\2"+
		"\2]^\7(\2\2^_\7(\2\2_\6\3\2\2\2`a\7~\2\2ab\7~\2\2b\b\3\2\2\2cd\7?\2\2"+
		"de\7?\2\2e\n\3\2\2\2fg\7#\2\2gh\7?\2\2h\f\3\2\2\2ij\7@\2\2j\16\3\2\2\2"+
		"kl\7>\2\2l\20\3\2\2\2mn\7@\2\2no\7?\2\2o\22\3\2\2\2pq\7>\2\2qr\7?\2\2"+
		"r\24\3\2\2\2st\7-\2\2t\26\3\2\2\2uv\7/\2\2v\30\3\2\2\2wx\7,\2\2x\32\3"+
		"\2\2\2yz\7\61\2\2z\34\3\2\2\2{|\7\'\2\2|\36\3\2\2\2}~\7`\2\2~ \3\2\2\2"+
		"\177\u0080\7?\2\2\u0080\"\3\2\2\2\u0081\u0082\7=\2\2\u0082$\3\2\2\2\u0083"+
		"\u0084\7*\2\2\u0084&\3\2\2\2\u0085\u0086\7+\2\2\u0086(\3\2\2\2\u0087\u0088"+
		"\7}\2\2\u0088*\3\2\2\2\u0089\u008a\7\177\2\2\u008a,\3\2\2\2\u008b\u008c"+
		"\7]\2\2\u008c.\3\2\2\2\u008d\u008e\7_\2\2\u008e\60\3\2\2\2\u008f\u0090"+
		"\7v\2\2\u0090\u0091\7t\2\2\u0091\u0092\7w\2\2\u0092\u0093\7g\2\2\u0093"+
		"\62\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7c\2\2\u0096\u0097\7n\2\2\u0097"+
		"\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099\64\3\2\2\2\u009a\u009b\7p\2\2\u009b"+
		"\u009c\7w\2\2\u009c\u009d\7n\2\2\u009d\u009e\7n\2\2\u009e\66\3\2\2\2\u009f"+
		"\u00a0\7k\2\2\u00a0\u00a1\7h\2\2\u00a18\3\2\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7g\2\2\u00a6:\3\2\2\2\u00a7"+
		"\u00a8\7y\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7n\2\2"+
		"\u00ab\u00ac\7g\2\2\u00ac<\3\2\2\2\u00ad\u00ae\7h\2\2\u00ae\u00af\7q\2"+
		"\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7G\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3"+
		"\7e\2\2\u00b3\u00b4\7j\2\2\u00b4>\3\2\2\2\u00b5\u00b6\7r\2\2\u00b6\u00b7"+
		"\7t\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7v\2\2\u00ba"+
		"@\3\2\2\2\u00bb\u00bc\7>\2\2\u00bc\u00bd\7/\2\2\u00bdB\3\2\2\2\u00be\u00bf"+
		"\7/\2\2\u00bf\u00c0\7@\2\2\u00c0D\3\2\2\2\u00c1\u00c2\7>\2\2\u00c2\u00c3"+
		"\7A\2\2\u00c3\u00c4\7@\2\2\u00c4F\3\2\2\2\u00c5\u00c6\7i\2\2\u00c6\u00c7"+
		"\7t\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7r\2\2\u00c9\u00ca\7j\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\5%\23\2\u00cc\u00cd\5S*\2\u00cd\u00ce\5\'\24"+
		"\2\u00ceH\3\2\2\2\u00cf\u00d0\7x\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7"+
		"t\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7z\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d7\5%\23\2\u00d7\u00d8\5S*\2\u00d8\u00d9\5\'\24\2\u00d9"+
		"J\3\2\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7i\2\2\u00dd"+
		"\u00de\7g\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\5\17\b\2\u00e0\u00e1\5M"+
		"\'\2\u00e1\u00e2\7.\2\2\u00e2\u00e3\5M\'\2\u00e3\u00e4\5\r\7\2\u00e4L"+
		"\3\2\2\2\u00e5\u00e9\t\2\2\2\u00e6\u00e8\t\3\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00eaN\3\2\2\2"+
		"\u00eb\u00e9\3\2\2\2\u00ec\u00ee\t\4\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0P\3\2\2\2\u00f1"+
		"\u00f3\t\4\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fa\7\60\2\2\u00f7"+
		"\u00f9\t\4\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0104\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00ff\7\60\2\2\u00fe\u0100\t\4\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3"+
		"\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103"+
		"\u00f2\3\2\2\2\u0103\u00fd\3\2\2\2\u0104R\3\2\2\2\u0105\u010b\7$\2\2\u0106"+
		"\u010a\n\5\2\2\u0107\u0108\7$\2\2\u0108\u010a\7$\2\2\u0109\u0106\3\2\2"+
		"\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7$\2\2\u010f"+
		"T\3\2\2\2\u0110\u0111\7\61\2\2\u0111\u0112\7\61\2\2\u0112\u0116\3\2\2"+
		"\2\u0113\u0115\n\6\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011a\b+\2\2\u011aV\3\2\2\2\u011b\u011c\t\7\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\b,\2\2\u011eX\3\2\2\2\u011f\u0120\13\2\2\2\u0120Z\3\2\2\2\f\2\u00e9"+
		"\u00ef\u00f4\u00fa\u0101\u0103\u0109\u010b\u0116\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}