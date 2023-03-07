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
		MAIN=1, TIPO=2, AP=3, FP=4, ENTR=5, SAI=6, SAIQL=7, LOOP=8, FUNC=9, COND=10, 
		SENAO=11, NAO=12, RETURN=13, OP_ARI=14, OP_BOOL=15, OP_LOG=16, OP=17, 
		ATRI=18, ACENT=19, VAR=20, NUMINT=21, NUMREAL=22, STRING=23, AC=24, FC=25, 
		DEL=26, COM=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAIN", "TIPO", "AP", "FP", "LETRA", "DIGITO", "ENTR", "SAI", "SAIQL", 
			"LOOP", "FUNC", "COND", "SENAO", "NAO", "RETURN", "OP_ARI", "OP_BOOL", 
			"OP_LOG", "OP", "ATRI", "ACENT", "VAR", "NUMINT", "NUMREAL", "STRING", 
			"AC", "FC", "DEL", "COM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", null, "'('", "')'", "'input'", "'output'", "'outputql'", 
			"'para'", "'funcao'", "'se'", "'senaose'", "'naose'", "'retorna'", null, 
			null, null, null, "'='", null, null, null, null, null, "'{'", "'}'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "TIPO", "AP", "FP", "ENTR", "SAI", "SAIQL", "LOOP", "FUNC", 
			"COND", "SENAO", "NAO", "RETURN", "OP_ARI", "OP_BOOL", "OP_LOG", "OP", 
			"ATRI", "ACENT", "VAR", "NUMINT", "NUMREAL", "STRING", "AC", "FC", "DEL", 
			"COM", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u010c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3V\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00a9\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00b3\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00be\n\24\3\25\3\25\3\26\3\26\3\26\7\26\u00c5\n"+
		"\26\f\26\16\26\u00c8\13\26\3\26\3\26\3\27\3\27\3\27\7\27\u00cf\n\27\f"+
		"\27\16\27\u00d2\13\27\3\30\6\30\u00d5\n\30\r\30\16\30\u00d6\3\31\6\31"+
		"\u00da\n\31\r\31\16\31\u00db\3\31\3\31\6\31\u00e0\n\31\r\31\16\31\u00e1"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u00e9\n\32\f\32\16\32\u00ec\13\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00fa\n\36"+
		"\f\36\16\36\u00fd\13\36\3\36\6\36\u0100\n\36\r\36\16\36\u0101\3\36\3\36"+
		"\3\37\6\37\u0107\n\37\r\37\16\37\u0108\3\37\3\37\4\u00ea\u00fb\2 \3\3"+
		"\5\4\7\5\t\6\13\2\r\2\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17"+
		"!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36"+
		"\3\2\n\4\2C\\c|\3\2\62;\6\2\'\',-//\61\61\4\2>>@@\3\2$$\4\2$$``\4\2\f"+
		"\f\17\17\5\2\13\f\17\17\"\"\2\u011e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2"+
		"\13[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21e\3\2\2\2\23l\3\2\2\2\25u\3\2\2"+
		"\2\27z\3\2\2\2\31\u0081\3\2\2\2\33\u0084\3\2\2\2\35\u008c\3\2\2\2\37\u0092"+
		"\3\2\2\2!\u009a\3\2\2\2#\u00a8\3\2\2\2%\u00b2\3\2\2\2\'\u00bd\3\2\2\2"+
		")\u00bf\3\2\2\2+\u00c1\3\2\2\2-\u00cb\3\2\2\2/\u00d4\3\2\2\2\61\u00d9"+
		"\3\2\2\2\63\u00e3\3\2\2\2\65\u00ef\3\2\2\2\67\u00f1\3\2\2\29\u00f3\3\2"+
		"\2\2;\u00f5\3\2\2\2=\u0106\3\2\2\2?@\7o\2\2@A\7c\2\2AB\7k\2\2BC\7p\2\2"+
		"C\4\3\2\2\2DE\7k\2\2EF\7p\2\2FG\7v\2\2GH\7g\2\2HI\7k\2\2IJ\7t\2\2JV\7"+
		"q\2\2KL\7t\2\2LM\7g\2\2MN\7c\2\2NV\7n\2\2OP\7u\2\2PQ\7v\2\2QR\7t\2\2R"+
		"S\7k\2\2ST\7p\2\2TV\7i\2\2UD\3\2\2\2UK\3\2\2\2UO\3\2\2\2V\6\3\2\2\2WX"+
		"\7*\2\2X\b\3\2\2\2YZ\7+\2\2Z\n\3\2\2\2[\\\t\2\2\2\\\f\3\2\2\2]^\t\3\2"+
		"\2^\16\3\2\2\2_`\7k\2\2`a\7p\2\2ab\7r\2\2bc\7w\2\2cd\7v\2\2d\20\3\2\2"+
		"\2ef\7q\2\2fg\7w\2\2gh\7v\2\2hi\7r\2\2ij\7w\2\2jk\7v\2\2k\22\3\2\2\2l"+
		"m\7q\2\2mn\7w\2\2no\7v\2\2op\7r\2\2pq\7w\2\2qr\7v\2\2rs\7s\2\2st\7n\2"+
		"\2t\24\3\2\2\2uv\7r\2\2vw\7c\2\2wx\7t\2\2xy\7c\2\2y\26\3\2\2\2z{\7h\2"+
		"\2{|\7w\2\2|}\7p\2\2}~\7e\2\2~\177\7c\2\2\177\u0080\7q\2\2\u0080\30\3"+
		"\2\2\2\u0081\u0082\7u\2\2\u0082\u0083\7g\2\2\u0083\32\3\2\2\2\u0084\u0085"+
		"\7u\2\2\u0085\u0086\7g\2\2\u0086\u0087\7p\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7q\2\2\u0089\u008a\7u\2\2\u008a\u008b\7g\2\2\u008b\34\3\2\2\2\u008c"+
		"\u008d\7p\2\2\u008d\u008e\7c\2\2\u008e\u008f\7q\2\2\u008f\u0090\7u\2\2"+
		"\u0090\u0091\7g\2\2\u0091\36\3\2\2\2\u0092\u0093\7t\2\2\u0093\u0094\7"+
		"g\2\2\u0094\u0095\7v\2\2\u0095\u0096\7q\2\2\u0096\u0097\7t\2\2\u0097\u0098"+
		"\7p\2\2\u0098\u0099\7c\2\2\u0099 \3\2\2\2\u009a\u009b\t\4\2\2\u009b\""+
		"\3\2\2\2\u009c\u009d\7x\2\2\u009d\u009e\7g\2\2\u009e\u009f\7t\2\2\u009f"+
		"\u00a0\7f\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a9\7g\2\2"+
		"\u00a3\u00a4\7h\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7"+
		"\7u\2\2\u00a7\u00a9\7q\2\2\u00a8\u009c\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9"+
		"$\3\2\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7p\2\2\u00ac\u00b3\7f\2\2\u00ad"+
		"\u00ae\7q\2\2\u00ae\u00b3\7t\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7q\2\2"+
		"\u00b1\u00b3\7v\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00af"+
		"\3\2\2\2\u00b3&\3\2\2\2\u00b4\u00be\t\5\2\2\u00b5\u00b6\7@\2\2\u00b6\u00be"+
		"\7?\2\2\u00b7\u00b8\7>\2\2\u00b8\u00be\7?\2\2\u00b9\u00ba\7?\2\2\u00ba"+
		"\u00be\7?\2\2\u00bb\u00bc\7#\2\2\u00bc\u00be\7?\2\2\u00bd\u00b4\3\2\2"+
		"\2\u00bd\u00b5\3\2\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00be(\3\2\2\2\u00bf\u00c0\7?\2\2\u00c0*\3\2\2\2\u00c1\u00c6"+
		"\7$\2\2\u00c2\u00c3\13\2\2\2\u00c3\u00c5\n\6\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7$\2\2\u00ca,\3\2\2\2\u00cb\u00d0"+
		"\5\13\6\2\u00cc\u00cf\5\r\7\2\u00cd\u00cf\5\13\6\2\u00ce\u00cc\3\2\2\2"+
		"\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1.\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\5\r\7\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\60\3\2\2\2\u00d8\u00da\5\r\7\2\u00d9\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00df\7\60\2\2\u00de\u00e0\5\r\7\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3"+
		"\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\62\3\2\2\2\u00e3"+
		"\u00ea\7$\2\2\u00e4\u00e9\t\7\2\2\u00e5\u00e6\7^\2\2\u00e6\u00e9\7$\2"+
		"\2\u00e7\u00e9\13\2\2\2\u00e8\u00e4\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00eb\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7$\2\2\u00ee"+
		"\64\3\2\2\2\u00ef\u00f0\7}\2\2\u00f0\66\3\2\2\2\u00f1\u00f2\7\177\2\2"+
		"\u00f28\3\2\2\2\u00f3\u00f4\7=\2\2\u00f4:\3\2\2\2\u00f5\u00f6\7%\2\2\u00f6"+
		"\u00f7\7%\2\2\u00f7\u00fb\3\2\2\2\u00f8\u00fa\13\2\2\2\u00f9\u00f8\3\2"+
		"\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0100\t\b\2\2\u00ff\u00fe\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0104\b\36\2\2\u0104<\3\2\2\2\u0105\u0107\t\t\2\2"+
		"\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\b\37\2\2\u010b>\3\2\2\2\22\2"+
		"U\u00a8\u00b2\u00bd\u00c6\u00ce\u00d0\u00d6\u00db\u00e1\u00e8\u00ea\u00fb"+
		"\u0101\u0108\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}