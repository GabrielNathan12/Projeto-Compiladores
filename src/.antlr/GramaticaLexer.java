// Generated from c:\Users\gabri\OneDrive - estudante.ufla.br\�rea de Trabalho\Projeto-Compiladores\src\Gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, TIPO=2, AP=3, FP=4, ENTR=5, SAI=6, SAIQL=7, OP_ARI=8, OP_LOG=9, 
		OP=10, VAR=11, NUM=12, PC=13, AC=14, FC=15, DEL=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAIN", "TIPO", "AP", "FP", "ENTR", "SAI", "SAIQL", "OP_ARI", "OP_LOG", 
			"OP", "VAR", "NUM", "PC", "AC", "FC", "DEL", "LETRA", "DIGITO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", null, "'('", "')'", "'input'", "'output'", "'outputql'", 
			null, null, null, null, null, null, "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "TIPO", "AP", "FP", "ENTR", "SAI", "SAIQL", "OP_ARI", "OP_LOG", 
			"OP", "VAR", "NUM", "PC", "AC", "FC", "DEL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n_\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13g\n\13\3\f\3\f\3\f\6\fl\n\f\r\f\16\fm\5\fp\n\f\3\r\6\rs\n\r\r\r\16"+
		"\rt\3\r\3\r\5\ry\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009a\n\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\2\2\25\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2"+
		"%\2\'\23\3\2\7\5\2,-//\61\61\4\2>>@@\4\2C\\c|\3\2\62;\5\2\13\f\17\17\""+
		"\"\2\u00b6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2\'\3\2\2\2\3)\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2"+
		"\rG\3\2\2\2\17N\3\2\2\2\21W\3\2\2\2\23^\3\2\2\2\25f\3\2\2\2\27h\3\2\2"+
		"\2\31r\3\2\2\2\33\u0099\3\2\2\2\35\u009b\3\2\2\2\37\u009d\3\2\2\2!\u009f"+
		"\3\2\2\2#\u00a1\3\2\2\2%\u00a3\3\2\2\2\'\u00a5\3\2\2\2)*\7o\2\2*+\7c\2"+
		"\2+,\7k\2\2,-\7p\2\2-\4\3\2\2\2./\7k\2\2/\60\7p\2\2\60<\7v\2\2\61\62\7"+
		"t\2\2\62\63\7g\2\2\63\64\7c\2\2\64<\7n\2\2\65\66\7u\2\2\66\67\7v\2\2\67"+
		"8\7t\2\289\7k\2\29:\7p\2\2:<\7i\2\2;.\3\2\2\2;\61\3\2\2\2;\65\3\2\2\2"+
		"<\6\3\2\2\2=>\7*\2\2>\b\3\2\2\2?@\7+\2\2@\n\3\2\2\2AB\7k\2\2BC\7p\2\2"+
		"CD\7r\2\2DE\7w\2\2EF\7v\2\2F\f\3\2\2\2GH\7q\2\2HI\7w\2\2IJ\7v\2\2JK\7"+
		"r\2\2KL\7w\2\2LM\7v\2\2M\16\3\2\2\2NO\7q\2\2OP\7w\2\2PQ\7v\2\2QR\7r\2"+
		"\2RS\7w\2\2ST\7v\2\2TU\7s\2\2UV\7n\2\2V\20\3\2\2\2WX\t\2\2\2X\22\3\2\2"+
		"\2YZ\7c\2\2Z[\7p\2\2[_\7f\2\2\\]\7q\2\2]_\7t\2\2^Y\3\2\2\2^\\\3\2\2\2"+
		"_\24\3\2\2\2`g\t\3\2\2ab\7@\2\2bg\7?\2\2cd\7>\2\2dg\7?\2\2eg\7?\2\2f`"+
		"\3\2\2\2fa\3\2\2\2fc\3\2\2\2fe\3\2\2\2g\26\3\2\2\2ho\5#\22\2il\5%\23\2"+
		"jl\5#\22\2ki\3\2\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2"+
		"ok\3\2\2\2op\3\2\2\2p\30\3\2\2\2qs\5%\23\2rq\3\2\2\2st\3\2\2\2tr\3\2\2"+
		"\2tu\3\2\2\2ux\3\2\2\2vw\7\60\2\2wy\5%\23\2xv\3\2\2\2xy\3\2\2\2y\32\3"+
		"\2\2\2z{\7r\2\2{|\7c\2\2|}\7t\2\2}\u009a\7c\2\2~\177\7h\2\2\177\u0080"+
		"\7w\2\2\u0080\u0081\7p\2\2\u0081\u0082\7e\2\2\u0082\u0083\7c\2\2\u0083"+
		"\u009a\7q\2\2\u0084\u0085\7u\2\2\u0085\u009a\7g\2\2\u0086\u0087\7u\2\2"+
		"\u0087\u0088\7g\2\2\u0088\u0089\7p\2\2\u0089\u008a\7c\2\2\u008a\u008b"+
		"\7q\2\2\u008b\u008c\7u\2\2\u008c\u009a\7g\2\2\u008d\u008e\7u\2\2\u008e"+
		"\u008f\7g\2\2\u008f\u0090\7p\2\2\u0090\u0091\7c\2\2\u0091\u009a\7q\2\2"+
		"\u0092\u0093\7t\2\2\u0093\u0094\7g\2\2\u0094\u0095\7v\2\2\u0095\u0096"+
		"\7q\2\2\u0096\u0097\7t\2\2\u0097\u0098\7p\2\2\u0098\u009a\7c\2\2\u0099"+
		"z\3\2\2\2\u0099~\3\2\2\2\u0099\u0084\3\2\2\2\u0099\u0086\3\2\2\2\u0099"+
		"\u008d\3\2\2\2\u0099\u0092\3\2\2\2\u009a\34\3\2\2\2\u009b\u009c\7}\2\2"+
		"\u009c\36\3\2\2\2\u009d\u009e\7\177\2\2\u009e \3\2\2\2\u009f\u00a0\7="+
		"\2\2\u00a0\"\3\2\2\2\u00a1\u00a2\t\4\2\2\u00a2$\3\2\2\2\u00a3\u00a4\t"+
		"\5\2\2\u00a4&\3\2\2\2\u00a5\u00a6\t\6\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8"+
		"\b\24\2\2\u00a8(\3\2\2\2\f\2;^fkmotx\u0099\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}