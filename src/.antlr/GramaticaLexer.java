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
		T__0=1, MAIN=2, TIPO=3, AP=4, FP=5, ENTR=6, SAI=7, SAIQL=8, LOOP=9, FUNC=10, 
		COND=11, SENAOSE=12, NAO=13, RETURN=14, ATRI=15, ATRIBUICOES=16, OP_SUM_SUB=17, 
		OP_MUL_DIV_MOD=18, OP_BOOL=19, OP_LOG=20, OP=21, VAR=22, NUMINT=23, NUMREAL=24, 
		STRING=25, AC=26, FC=27, DEL=28, COM=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "MAIN", "TIPO", "AP", "FP", "LETRA", "DIGITO", "ENTR", "SAI", 
			"SAIQL", "LOOP", "FUNC", "COND", "SENAOSE", "NAO", "RETURN", "ATRI", 
			"ATRIBUICOES", "OP_SUM_SUB", "OP_MUL_DIV_MOD", "OP_BOOL", "OP_LOG", "OP", 
			"VAR", "NUMINT", "NUMREAL", "STRING", "AC", "FC", "DEL", "COM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'main'", null, "'('", "')'", "'input'", "'output'", "'outputql'", 
			"'para'", "'funcao'", "'se'", "'senaose'", "'naose'", "'retorna'", "'='", 
			null, null, null, null, null, null, null, null, null, null, "'{'", "'}'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "MAIN", "TIPO", "AP", "FP", "ENTR", "SAI", "SAIQL", "LOOP", 
			"FUNC", "COND", "SENAOSE", "NAO", "RETURN", "ATRI", "ATRIBUICOES", "OP_SUM_SUB", 
			"OP_MUL_DIV_MOD", "OP_BOOL", "OP_LOG", "OP", "VAR", "NUMINT", "NUMREAL", 
			"STRING", "AC", "FC", "DEL", "COM", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u0110\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\\\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\5\23\u00a7\n\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00b9\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00c3\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u00ce\n\30\3\31\3\31\3\31\7\31\u00d3\n"+
		"\31\f\31\16\31\u00d6\13\31\3\32\6\32\u00d9\n\32\r\32\16\32\u00da\3\33"+
		"\6\33\u00de\n\33\r\33\16\33\u00df\3\33\3\33\6\33\u00e4\n\33\r\33\16\33"+
		"\u00e5\3\34\3\34\3\34\3\34\3\34\7\34\u00ed\n\34\f\34\16\34\u00f0\13\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \7 \u00fe\n \f \16"+
		" \u0101\13 \3 \6 \u0104\n \r \16 \u0105\3 \3 \3!\6!\u010b\n!\r!\16!\u010c"+
		"\3!\3!\4\u00ee\u00ff\2\"\3\3\5\4\7\5\t\6\13\7\r\2\17\2\21\b\23\t\25\n"+
		"\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63"+
		"\31\65\32\67\339\34;\35=\36?\37A \3\2\n\4\2C\\c|\3\2\62;\4\2--//\5\2\'"+
		"\',,\61\61\4\2>>@@\4\2$$``\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0122\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\r"+
		"a\3\2\2\2\17c\3\2\2\2\21e\3\2\2\2\23k\3\2\2\2\25r\3\2\2\2\27{\3\2\2\2"+
		"\31\u0080\3\2\2\2\33\u0087\3\2\2\2\35\u008a\3\2\2\2\37\u0092\3\2\2\2!"+
		"\u0098\3\2\2\2#\u00a0\3\2\2\2%\u00a6\3\2\2\2\'\u00a8\3\2\2\2)\u00aa\3"+
		"\2\2\2+\u00b8\3\2\2\2-\u00c2\3\2\2\2/\u00cd\3\2\2\2\61\u00cf\3\2\2\2\63"+
		"\u00d8\3\2\2\2\65\u00dd\3\2\2\2\67\u00e7\3\2\2\29\u00f3\3\2\2\2;\u00f5"+
		"\3\2\2\2=\u00f7\3\2\2\2?\u00f9\3\2\2\2A\u010a\3\2\2\2CD\7.\2\2D\4\3\2"+
		"\2\2EF\7o\2\2FG\7c\2\2GH\7k\2\2HI\7p\2\2I\6\3\2\2\2JK\7k\2\2KL\7p\2\2"+
		"LM\7v\2\2MN\7g\2\2NO\7k\2\2OP\7t\2\2P\\\7q\2\2QR\7t\2\2RS\7g\2\2ST\7c"+
		"\2\2T\\\7n\2\2UV\7u\2\2VW\7v\2\2WX\7t\2\2XY\7k\2\2YZ\7p\2\2Z\\\7i\2\2"+
		"[J\3\2\2\2[Q\3\2\2\2[U\3\2\2\2\\\b\3\2\2\2]^\7*\2\2^\n\3\2\2\2_`\7+\2"+
		"\2`\f\3\2\2\2ab\t\2\2\2b\16\3\2\2\2cd\t\3\2\2d\20\3\2\2\2ef\7k\2\2fg\7"+
		"p\2\2gh\7r\2\2hi\7w\2\2ij\7v\2\2j\22\3\2\2\2kl\7q\2\2lm\7w\2\2mn\7v\2"+
		"\2no\7r\2\2op\7w\2\2pq\7v\2\2q\24\3\2\2\2rs\7q\2\2st\7w\2\2tu\7v\2\2u"+
		"v\7r\2\2vw\7w\2\2wx\7v\2\2xy\7s\2\2yz\7n\2\2z\26\3\2\2\2{|\7r\2\2|}\7"+
		"c\2\2}~\7t\2\2~\177\7c\2\2\177\30\3\2\2\2\u0080\u0081\7h\2\2\u0081\u0082"+
		"\7w\2\2\u0082\u0083\7p\2\2\u0083\u0084\7e\2\2\u0084\u0085\7c\2\2\u0085"+
		"\u0086\7q\2\2\u0086\32\3\2\2\2\u0087\u0088\7u\2\2\u0088\u0089\7g\2\2\u0089"+
		"\34\3\2\2\2\u008a\u008b\7u\2\2\u008b\u008c\7g\2\2\u008c\u008d\7p\2\2\u008d"+
		"\u008e\7c\2\2\u008e\u008f\7q\2\2\u008f\u0090\7u\2\2\u0090\u0091\7g\2\2"+
		"\u0091\36\3\2\2\2\u0092\u0093\7p\2\2\u0093\u0094\7c\2\2\u0094\u0095\7"+
		"q\2\2\u0095\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097 \3\2\2\2\u0098\u0099"+
		"\7t\2\2\u0099\u009a\7g\2\2\u009a\u009b\7v\2\2\u009b\u009c\7q\2\2\u009c"+
		"\u009d\7t\2\2\u009d\u009e\7p\2\2\u009e\u009f\7c\2\2\u009f\"\3\2\2\2\u00a0"+
		"\u00a1\7?\2\2\u00a1$\3\2\2\2\u00a2\u00a3\7-\2\2\u00a3\u00a7\7?\2\2\u00a4"+
		"\u00a5\7/\2\2\u00a5\u00a7\7?\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a4\3\2\2"+
		"\2\u00a7&\3\2\2\2\u00a8\u00a9\t\4\2\2\u00a9(\3\2\2\2\u00aa\u00ab\t\5\2"+
		"\2\u00ab*\3\2\2\2\u00ac\u00ad\7x\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7"+
		"t\2\2\u00af\u00b0\7f\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7f\2\2\u00b2\u00b9"+
		"\7g\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7n\2\2\u00b6"+
		"\u00b7\7u\2\2\u00b7\u00b9\7q\2\2\u00b8\u00ac\3\2\2\2\u00b8\u00b3\3\2\2"+
		"\2\u00b9,\3\2\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7p\2\2\u00bc\u00c3\7"+
		"f\2\2\u00bd\u00be\7q\2\2\u00be\u00c3\7t\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1"+
		"\7q\2\2\u00c1\u00c3\7v\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c2"+
		"\u00bf\3\2\2\2\u00c3.\3\2\2\2\u00c4\u00ce\t\6\2\2\u00c5\u00c6\7@\2\2\u00c6"+
		"\u00ce\7?\2\2\u00c7\u00c8\7>\2\2\u00c8\u00ce\7?\2\2\u00c9\u00ca\7?\2\2"+
		"\u00ca\u00ce\7?\2\2\u00cb\u00cc\7#\2\2\u00cc\u00ce\7?\2\2\u00cd\u00c4"+
		"\3\2\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\60\3\2\2\2\u00cf\u00d4\5\r\7\2\u00d0\u00d3\5\17\b"+
		"\2\u00d1\u00d3\5\r\7\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\62\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d9\5\17\b\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3"+
		"\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\64\3\2\2\2\u00dc"+
		"\u00de\5\17\b\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3"+
		"\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\7\60\2\2\u00e2"+
		"\u00e4\5\17\b\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3"+
		"\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\66\3\2\2\2\u00e7\u00ee\7$\2\2\u00e8\u00ed"+
		"\t\7\2\2\u00e9\u00ea\7^\2\2\u00ea\u00ed\7$\2\2\u00eb\u00ed\13\2\2\2\u00ec"+
		"\u00e8\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f2\7$\2\2\u00f28\3\2\2\2\u00f3\u00f4\7}\2\2\u00f4"+
		":\3\2\2\2\u00f5\u00f6\7\177\2\2\u00f6<\3\2\2\2\u00f7\u00f8\7=\2\2\u00f8"+
		">\3\2\2\2\u00f9\u00fa\7%\2\2\u00fa\u00fb\7%\2\2\u00fb\u00ff\3\2\2\2\u00fc"+
		"\u00fe\13\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u0100\3"+
		"\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u0104\t\b\2\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\b \2\2\u0108"+
		"@\3\2\2\2\u0109\u010b\t\t\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2"+
		"\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f"+
		"\b!\2\2\u010fB\3\2\2\2\22\2[\u00a6\u00b8\u00c2\u00cd\u00d2\u00d4\u00da"+
		"\u00df\u00e5\u00ec\u00ee\u00ff\u0105\u010c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}