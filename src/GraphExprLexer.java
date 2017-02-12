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
		T__0=1, ASSIGN=2, GRAPH=3, VERTEX=4, EDGE=5, OANGLEBR=6, CANGLEBR=7, PUSH=8, 
		PULL=9, CONTAIN=10, PRINT=11, INT=12, ID=13, STRING=14, COMMENT=15, SPACES=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "ASSIGN", "GRAPH", "VERTEX", "EDGE", "OANGLEBR", "CANGLEBR", "PUSH", 
		"PULL", "CONTAIN", "PRINT", "INT", "ID", "STRING", "COMMENT", "SPACES"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'='", "'graph'", "'vertex'", "'edge'", "'<'", "'>'", "'<-'", 
		"'->'", "'<?>'", "'print'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ASSIGN", "GRAPH", "VERTEX", "EDGE", "OANGLEBR", "CANGLEBR", 
		"PUSH", "PULL", "CONTAIN", "PRINT", "INT", "ID", "STRING", "COMMENT", 
		"SPACES"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\6\rO\n\r\r\r\16\rP\3\16\3\16\7\16U\n\16\f\16"+
		"\16\16X\13\16\3\17\3\17\3\17\3\17\7\17^\n\17\f\17\16\17a\13\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\7\20i\n\20\f\20\16\20l\13\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22\3\2\b\3\2\62;\5\2C\\aac|\6\2\62;C\\aac"+
		"|\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"w\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'"+
		"\3\2\2\2\t-\3\2\2\2\13\64\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21=\3\2\2\2\23"+
		"@\3\2\2\2\25C\3\2\2\2\27G\3\2\2\2\31N\3\2\2\2\33R\3\2\2\2\35Y\3\2\2\2"+
		"\37d\3\2\2\2!o\3\2\2\2#$\7.\2\2$\4\3\2\2\2%&\7?\2\2&\6\3\2\2\2\'(\7i\2"+
		"\2()\7t\2\2)*\7c\2\2*+\7r\2\2+,\7j\2\2,\b\3\2\2\2-.\7x\2\2./\7g\2\2/\60"+
		"\7t\2\2\60\61\7v\2\2\61\62\7g\2\2\62\63\7z\2\2\63\n\3\2\2\2\64\65\7g\2"+
		"\2\65\66\7f\2\2\66\67\7i\2\2\678\7g\2\28\f\3\2\2\29:\7>\2\2:\16\3\2\2"+
		"\2;<\7@\2\2<\20\3\2\2\2=>\7>\2\2>?\7/\2\2?\22\3\2\2\2@A\7/\2\2AB\7@\2"+
		"\2B\24\3\2\2\2CD\7>\2\2DE\7A\2\2EF\7@\2\2F\26\3\2\2\2GH\7r\2\2HI\7t\2"+
		"\2IJ\7k\2\2JK\7p\2\2KL\7v\2\2L\30\3\2\2\2MO\t\2\2\2NM\3\2\2\2OP\3\2\2"+
		"\2PN\3\2\2\2PQ\3\2\2\2Q\32\3\2\2\2RV\t\3\2\2SU\t\4\2\2TS\3\2\2\2UX\3\2"+
		"\2\2VT\3\2\2\2VW\3\2\2\2W\34\3\2\2\2XV\3\2\2\2Y_\7$\2\2Z^\n\5\2\2[\\\7"+
		"$\2\2\\^\7$\2\2]Z\3\2\2\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3"+
		"\2\2\2a_\3\2\2\2bc\7$\2\2c\36\3\2\2\2de\7\61\2\2ef\7\61\2\2fj\3\2\2\2"+
		"gi\n\6\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2"+
		"mn\b\20\2\2n \3\2\2\2op\t\7\2\2pq\3\2\2\2qr\b\21\2\2r\"\3\2\2\2\b\2PV"+
		"]_j\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}