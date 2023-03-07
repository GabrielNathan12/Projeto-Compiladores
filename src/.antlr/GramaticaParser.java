// Generated from c:\Users\gabri\OneDrive - estudante.ufla.br\Área de Trabalho\Projeto-Compiladores\src\Gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MAIN=2, TIPO=3, AP=4, FP=5, ENTR=6, SAI=7, SAIQL=8, LOOP=9, FUNC=10, 
		COND=11, SENAOSE=12, NAO=13, RETURN=14, ATRI=15, ATRIBUICOES=16, OP_SUM_SUB=17, 
		OP_MUL_DIV_MOD=18, OP_BOOL=19, OP_LOG=20, OP=21, VAR=22, NUMINT=23, NUMREAL=24, 
		STRING=25, AC=26, FC=27, DEL=28, COM=29, WS=30;
	public static final int
		RULE_prog = 0, RULE_funcao = 1, RULE_bloco = 2, RULE_argumentos = 3, RULE_argumento = 4, 
		RULE_instrucoes = 5, RULE_instrocao = 6, RULE_se = 7, RULE_para = 8, RULE_callFuncao = 9, 
		RULE_parametros = 10, RULE_decVar = 11, RULE_atribuicao = 12, RULE_expressao = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "funcao", "bloco", "argumentos", "argumento", "instrucoes", "instrocao", 
			"se", "para", "callFuncao", "parametros", "decVar", "atribuicao", "expressao"
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

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAIN || _la==FUNC) {
				{
				{
				setState(28);
				funcao();
				}
				}
				setState(33);
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

	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GramaticaParser.FUNC, 0); }
		public TerminalNode TIPO() { return getToken(GramaticaParser.TIPO, 0); }
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode MAIN() { return getToken(GramaticaParser.MAIN, 0); }
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcao);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(FUNC);
				setState(35);
				match(TIPO);
				setState(36);
				match(VAR);
				setState(37);
				match(AP);
				setState(38);
				argumentos();
				setState(39);
				match(FP);
				setState(40);
				bloco();
				}
				break;
			case MAIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(MAIN);
				setState(43);
				match(AP);
				setState(44);
				match(FP);
				setState(45);
				bloco();
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

	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(GramaticaParser.AC, 0); }
		public InstrucoesContext instrucoes() {
			return getRuleContext(InstrucoesContext.class,0);
		}
		public TerminalNode FC() { return getToken(GramaticaParser.FC, 0); }
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(AC);
			setState(49);
			instrucoes();
			setState(50);
			match(FC);
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

	public static class ArgumentosContext extends ParserRuleContext {
		public List<ArgumentoContext> argumento() {
			return getRuleContexts(ArgumentoContext.class);
		}
		public ArgumentoContext argumento(int i) {
			return getRuleContext(ArgumentoContext.class,i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argumentos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					argumento();
					setState(53);
					match(T__0);
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(60);
			argumento();
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

	public static class ArgumentoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(GramaticaParser.TIPO, 0); }
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argumento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(TIPO);
			setState(63);
			match(VAR);
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

	public static class InstrucoesContext extends ParserRuleContext {
		public List<InstrocaoContext> instrocao() {
			return getRuleContexts(InstrocaoContext.class);
		}
		public InstrocaoContext instrocao(int i) {
			return getRuleContext(InstrocaoContext.class,i);
		}
		public InstrucoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucoes; }
	}

	public final InstrucoesContext instrucoes() throws RecognitionException {
		InstrucoesContext _localctx = new InstrucoesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instrucoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << ENTR) | (1L << SAI) | (1L << SAIQL) | (1L << LOOP) | (1L << COND) | (1L << RETURN) | (1L << VAR))) != 0)) {
				{
				{
				setState(65);
				instrocao();
				}
				}
				setState(70);
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

	public static class InstrocaoContext extends ParserRuleContext {
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public CallFuncaoContext callFuncao() {
			return getRuleContext(CallFuncaoContext.class,0);
		}
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public DecVarContext decVar() {
			return getRuleContext(DecVarContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(GramaticaParser.RETURN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public InstrocaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrocao; }
	}

	public final InstrocaoContext instrocao() throws RecognitionException {
		InstrocaoContext _localctx = new InstrocaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instrocao);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				se();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				para();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				callFuncao();
				setState(74);
				match(DEL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				decVar();
				setState(77);
				match(DEL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				atribuicao();
				setState(80);
				match(DEL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				match(RETURN);
				setState(83);
				expressao(0);
				setState(84);
				match(DEL);
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

	public static class SeContext extends ParserRuleContext {
		public TerminalNode COND() { return getToken(GramaticaParser.COND, 0); }
		public List<TerminalNode> AP() { return getTokens(GramaticaParser.AP); }
		public TerminalNode AP(int i) {
			return getToken(GramaticaParser.AP, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> FP() { return getTokens(GramaticaParser.FP); }
		public TerminalNode FP(int i) {
			return getToken(GramaticaParser.FP, i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<TerminalNode> SENAOSE() { return getTokens(GramaticaParser.SENAOSE); }
		public TerminalNode SENAOSE(int i) {
			return getToken(GramaticaParser.SENAOSE, i);
		}
		public TerminalNode NAO() { return getToken(GramaticaParser.NAO, 0); }
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_se);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(COND);
			setState(89);
			match(AP);
			setState(90);
			expressao(0);
			setState(91);
			match(FP);
			setState(92);
			bloco();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SENAOSE) {
				{
				{
				setState(93);
				match(SENAOSE);
				setState(94);
				match(AP);
				setState(95);
				expressao(0);
				setState(96);
				match(FP);
				setState(97);
				bloco();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAO) {
				{
				setState(104);
				match(NAO);
				setState(105);
				bloco();
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

	public static class ParaContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(GramaticaParser.LOOP, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public DecVarContext decVar() {
			return getRuleContext(DecVarContext.class,0);
		}
		public List<TerminalNode> DEL() { return getTokens(GramaticaParser.DEL); }
		public TerminalNode DEL(int i) {
			return getToken(GramaticaParser.DEL, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(LOOP);
			setState(109);
			match(AP);
			setState(110);
			decVar();
			setState(111);
			match(DEL);
			setState(112);
			expressao(0);
			setState(113);
			match(DEL);
			setState(114);
			atribuicao();
			setState(115);
			match(FP);
			setState(116);
			bloco();
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

	public static class CallFuncaoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
		public TerminalNode ENTR() { return getToken(GramaticaParser.ENTR, 0); }
		public TerminalNode SAI() { return getToken(GramaticaParser.SAI, 0); }
		public TerminalNode SAIQL() { return getToken(GramaticaParser.SAIQL, 0); }
		public CallFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFuncao; }
	}

	public final CallFuncaoContext callFuncao() throws RecognitionException {
		CallFuncaoContext _localctx = new CallFuncaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_callFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTR) | (1L << SAI) | (1L << SAIQL) | (1L << VAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(119);
			match(AP);
			setState(120);
			parametros();
			setState(121);
			match(FP);
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

	public static class ParametrosContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parametros);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					expressao(0);
					setState(124);
					match(T__0);
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(131);
			expressao(0);
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

	public static class DecVarContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(GramaticaParser.TIPO, 0); }
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
		public TerminalNode ATRI() { return getToken(GramaticaParser.ATRI, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DecVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decVar; }
	}

	public final DecVarContext decVar() throws RecognitionException {
		DecVarContext _localctx = new DecVarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_decVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(TIPO);
			setState(134);
			match(VAR);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRI) {
				{
				setState(135);
				match(ATRI);
				setState(136);
				expressao(0);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ATRI() { return getToken(GramaticaParser.ATRI, 0); }
		public TerminalNode ATRIBUICOES() { return getToken(GramaticaParser.ATRIBUICOES, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(VAR);
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==ATRI || _la==ATRIBUICOES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(141);
			expressao(0);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
		public CallFuncaoContext callFuncao() {
			return getRuleContext(CallFuncaoContext.class,0);
		}
		public TerminalNode NUMINT() { return getToken(GramaticaParser.NUMINT, 0); }
		public TerminalNode NUMREAL() { return getToken(GramaticaParser.NUMREAL, 0); }
		public TerminalNode STRING() { return getToken(GramaticaParser.STRING, 0); }
		public TerminalNode OP_BOOL() { return getToken(GramaticaParser.OP_BOOL, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public TerminalNode OP_MUL_DIV_MOD() { return getToken(GramaticaParser.OP_MUL_DIV_MOD, 0); }
		public TerminalNode OP_SUM_SUB() { return getToken(GramaticaParser.OP_SUM_SUB, 0); }
		public TerminalNode OP() { return getToken(GramaticaParser.OP, 0); }
		public TerminalNode OP_LOG() { return getToken(GramaticaParser.OP_LOG, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(144);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(145);
				callFuncao();
				}
				break;
			case 3:
				{
				setState(146);
				match(NUMINT);
				}
				break;
			case 4:
				{
				setState(147);
				match(NUMREAL);
				}
				break;
			case 5:
				{
				setState(148);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(149);
				match(OP_BOOL);
				}
				break;
			case 7:
				{
				setState(150);
				match(AP);
				setState(151);
				expressao(0);
				setState(152);
				match(FP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(156);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(157);
						match(OP_MUL_DIV_MOD);
						setState(158);
						expressao(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(159);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(160);
						match(OP_SUM_SUB);
						setState(161);
						expressao(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(162);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(163);
						match(OP);
						setState(164);
						expressao(3);
						}
						break;
					case 4:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(165);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(166);
						match(OP_LOG);
						setState(167);
						expressao(2);
						}
						break;
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00b0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\7\5:\n\5\f\5\16\5=\13\5\3\5\3\5\3\6\3\6\3\6\3\7\7\7E"+
		"\n\7\f\7\16\7H\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\bY\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tf\n"+
		"\t\f\t\16\ti\13\t\3\t\3\t\5\tm\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u0081\n\f\f\f\16\f\u0084"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u008c\n\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009d\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ab\n\17"+
		"\f\17\16\17\u00ae\13\17\3\17\2\3\34\20\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\2\4\4\2\b\n\30\30\3\2\21\22\2\u00b8\2!\3\2\2\2\4\60\3\2\2\2\6\62\3"+
		"\2\2\2\b;\3\2\2\2\n@\3\2\2\2\fF\3\2\2\2\16X\3\2\2\2\20Z\3\2\2\2\22n\3"+
		"\2\2\2\24x\3\2\2\2\26\u0082\3\2\2\2\30\u0087\3\2\2\2\32\u008d\3\2\2\2"+
		"\34\u009c\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3"+
		"\2\2\2\"\3\3\2\2\2#!\3\2\2\2$%\7\f\2\2%&\7\5\2\2&\'\7\30\2\2\'(\7\6\2"+
		"\2()\5\b\5\2)*\7\7\2\2*+\5\6\4\2+\61\3\2\2\2,-\7\4\2\2-.\7\6\2\2./\7\7"+
		"\2\2/\61\5\6\4\2\60$\3\2\2\2\60,\3\2\2\2\61\5\3\2\2\2\62\63\7\34\2\2\63"+
		"\64\5\f\7\2\64\65\7\35\2\2\65\7\3\2\2\2\66\67\5\n\6\2\678\7\3\2\28:\3"+
		"\2\2\29\66\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>"+
		"?\5\n\6\2?\t\3\2\2\2@A\7\5\2\2AB\7\30\2\2B\13\3\2\2\2CE\5\16\b\2DC\3\2"+
		"\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\r\3\2\2\2HF\3\2\2\2IY\5\20\t\2JY\5"+
		"\22\n\2KL\5\24\13\2LM\7\36\2\2MY\3\2\2\2NO\5\30\r\2OP\7\36\2\2PY\3\2\2"+
		"\2QR\5\32\16\2RS\7\36\2\2SY\3\2\2\2TU\7\20\2\2UV\5\34\17\2VW\7\36\2\2"+
		"WY\3\2\2\2XI\3\2\2\2XJ\3\2\2\2XK\3\2\2\2XN\3\2\2\2XQ\3\2\2\2XT\3\2\2\2"+
		"Y\17\3\2\2\2Z[\7\r\2\2[\\\7\6\2\2\\]\5\34\17\2]^\7\7\2\2^g\5\6\4\2_`\7"+
		"\16\2\2`a\7\6\2\2ab\5\34\17\2bc\7\7\2\2cd\5\6\4\2df\3\2\2\2e_\3\2\2\2"+
		"fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hl\3\2\2\2ig\3\2\2\2jk\7\17\2\2km\5\6\4"+
		"\2lj\3\2\2\2lm\3\2\2\2m\21\3\2\2\2no\7\13\2\2op\7\6\2\2pq\5\30\r\2qr\7"+
		"\36\2\2rs\5\34\17\2st\7\36\2\2tu\5\32\16\2uv\7\7\2\2vw\5\6\4\2w\23\3\2"+
		"\2\2xy\t\2\2\2yz\7\6\2\2z{\5\26\f\2{|\7\7\2\2|\25\3\2\2\2}~\5\34\17\2"+
		"~\177\7\3\2\2\177\u0081\3\2\2\2\u0080}\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085\u0086\5\34\17\2\u0086\27\3\2\2\2\u0087\u0088\7\5\2\2\u0088"+
		"\u008b\7\30\2\2\u0089\u008a\7\21\2\2\u008a\u008c\5\34\17\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\31\3\2\2\2\u008d\u008e\7\30\2\2\u008e"+
		"\u008f\t\3\2\2\u008f\u0090\5\34\17\2\u0090\33\3\2\2\2\u0091\u0092\b\17"+
		"\1\2\u0092\u009d\7\30\2\2\u0093\u009d\5\24\13\2\u0094\u009d\7\31\2\2\u0095"+
		"\u009d\7\32\2\2\u0096\u009d\7\33\2\2\u0097\u009d\7\25\2\2\u0098\u0099"+
		"\7\6\2\2\u0099\u009a\5\34\17\2\u009a\u009b\7\7\2\2\u009b\u009d\3\2\2\2"+
		"\u009c\u0091\3\2\2\2\u009c\u0093\3\2\2\2\u009c\u0094\3\2\2\2\u009c\u0095"+
		"\3\2\2\2\u009c\u0096\3\2\2\2\u009c\u0097\3\2\2\2\u009c\u0098\3\2\2\2\u009d"+
		"\u00ac\3\2\2\2\u009e\u009f\f\6\2\2\u009f\u00a0\7\24\2\2\u00a0\u00ab\5"+
		"\34\17\7\u00a1\u00a2\f\5\2\2\u00a2\u00a3\7\23\2\2\u00a3\u00ab\5\34\17"+
		"\6\u00a4\u00a5\f\4\2\2\u00a5\u00a6\7\27\2\2\u00a6\u00ab\5\34\17\5\u00a7"+
		"\u00a8\f\3\2\2\u00a8\u00a9\7\26\2\2\u00a9\u00ab\5\34\17\4\u00aa\u009e"+
		"\3\2\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\35\3\2\2"+
		"\2\u00ae\u00ac\3\2\2\2\16!\60;FXgl\u0082\u008b\u009c\u00aa\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}