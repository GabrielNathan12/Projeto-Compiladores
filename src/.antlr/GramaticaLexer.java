// Generated from c:\Users\gabri\OneDrive - estudante.ufla.br\Área de Trabalho\Projeto-Compiladores\src\Gramatica.g4 by ANTLR 4.9.2
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
		OP=10, VAR=11, NUM=12, LOOP=13, FUNC=14, COND=15, SENAO=16, NAO=17, RETURN=18, 
		AC=19, FC=20, DEL=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAIN", "TIPO", "AP", "FP", "ENTR", "SAI", "SAIQL", "OP_ARI", "OP_LOG", 
			"OP", "VAR", "NUM", "LOOP", "FUNC", "COND", "SENAO", "NAO", "RETURN", 
			"AC", "FC", "DEL", "LETRA", "DIGITO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", null, "'('", "')'", "'input'", "'output'", "'outputql'", 
			null, null, null, null, null, "'para'", "'funcao'", "'se'", "'senaose'", 
			"'naose'", "'retorna'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "TIPO", "AP", "FP", "ENTR", "SAI", "SAIQL", "OP_ARI", "OP_LOG", 
			"OP", "VAR", "NUM", "LOOP", "FUNC", "COND", "SENAO", "NAO", "RETURN", 
			"AC", "FC", "DEL", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00ba\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3F\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\nl\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13t\n"+
		"\13\3\f\3\f\3\f\6\fy\n\f\r\f\16\fz\5\f}\n\f\3\r\6\r\u0080\n\r\r\r\16\r"+
		"\u0081\3\r\3\r\5\r\u0086\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\61\30\3\2\7\5\2,-//\61"+
		"\61\4\2>>@@\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00c3\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5E\3\2\2"+
		"\2\7G\3\2\2\2\tI\3\2\2\2\13K\3\2\2\2\rQ\3\2\2\2\17X\3\2\2\2\21a\3\2\2"+
		"\2\23k\3\2\2\2\25s\3\2\2\2\27u\3\2\2\2\31\177\3\2\2\2\33\u0087\3\2\2\2"+
		"\35\u008c\3\2\2\2\37\u0093\3\2\2\2!\u0096\3\2\2\2#\u009e\3\2\2\2%\u00a4"+
		"\3\2\2\2\'\u00ac\3\2\2\2)\u00ae\3\2\2\2+\u00b0\3\2\2\2-\u00b2\3\2\2\2"+
		"/\u00b4\3\2\2\2\61\u00b6\3\2\2\2\63\64\7o\2\2\64\65\7c\2\2\65\66\7k\2"+
		"\2\66\67\7p\2\2\67\4\3\2\2\289\7k\2\29:\7p\2\2:F\7v\2\2;<\7t\2\2<=\7g"+
		"\2\2=>\7c\2\2>F\7n\2\2?@\7u\2\2@A\7v\2\2AB\7t\2\2BC\7k\2\2CD\7p\2\2DF"+
		"\7i\2\2E8\3\2\2\2E;\3\2\2\2E?\3\2\2\2F\6\3\2\2\2GH\7*\2\2H\b\3\2\2\2I"+
		"J\7+\2\2J\n\3\2\2\2KL\7k\2\2LM\7p\2\2MN\7r\2\2NO\7w\2\2OP\7v\2\2P\f\3"+
		"\2\2\2QR\7q\2\2RS\7w\2\2ST\7v\2\2TU\7r\2\2UV\7w\2\2VW\7v\2\2W\16\3\2\2"+
		"\2XY\7q\2\2YZ\7w\2\2Z[\7v\2\2[\\\7r\2\2\\]\7w\2\2]^\7v\2\2^_\7s\2\2_`"+
		"\7n\2\2`\20\3\2\2\2ab\t\2\2\2b\22\3\2\2\2cd\7c\2\2de\7p\2\2el\7f\2\2f"+
		"g\7q\2\2gl\7t\2\2hi\7p\2\2ij\7q\2\2jl\7v\2\2kc\3\2\2\2kf\3\2\2\2kh\3\2"+
		"\2\2l\24\3\2\2\2mt\t\3\2\2no\7@\2\2ot\7?\2\2pq\7>\2\2qt\7?\2\2rt\7?\2"+
		"\2sm\3\2\2\2sn\3\2\2\2sp\3\2\2\2sr\3\2\2\2t\26\3\2\2\2u|\5-\27\2vy\5/"+
		"\30\2wy\5-\27\2xv\3\2\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3"+
		"\2\2\2|x\3\2\2\2|}\3\2\2\2}\30\3\2\2\2~\u0080\5/\30\2\177~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2"+
		"\2\u0083\u0084\7\60\2\2\u0084\u0086\5/\30\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\32\3\2\2\2\u0087\u0088\7r\2\2\u0088\u0089\7c\2\2"+
		"\u0089\u008a\7t\2\2\u008a\u008b\7c\2\2\u008b\34\3\2\2\2\u008c\u008d\7"+
		"h\2\2\u008d\u008e\7w\2\2\u008e\u008f\7p\2\2\u008f\u0090\7e\2\2\u0090\u0091"+
		"\7c\2\2\u0091\u0092\7q\2\2\u0092\36\3\2\2\2\u0093\u0094\7u\2\2\u0094\u0095"+
		"\7g\2\2\u0095 \3\2\2\2\u0096\u0097\7u\2\2\u0097\u0098\7g\2\2\u0098\u0099"+
		"\7p\2\2\u0099\u009a\7c\2\2\u009a\u009b\7q\2\2\u009b\u009c\7u\2\2\u009c"+
		"\u009d\7g\2\2\u009d\"\3\2\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7c\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7g\2\2\u00a3$\3\2\2\2\u00a4"+
		"\u00a5\7t\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7q\2\2"+
		"\u00a8\u00a9\7t\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7c\2\2\u00ab&\3\2\2"+
		"\2\u00ac\u00ad\7}\2\2\u00ad(\3\2\2\2\u00ae\u00af\7\177\2\2\u00af*\3\2"+
		"\2\2\u00b0\u00b1\7=\2\2\u00b1,\3\2\2\2\u00b2\u00b3\t\4\2\2\u00b3.\3\2"+
		"\2\2\u00b4\u00b5\t\5\2\2\u00b5\60\3\2\2\2\u00b6\u00b7\t\6\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00b9\b\31\2\2\u00b9\62\3\2\2\2\13\2Eksxz|\u0081\u0085"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}