// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MAIN=2, TIPO=3, AP=4, FP=5, ENTR=6, SAI=7, SAIQL=8, LOOP=9, FUNC=10, 
		COND=11, SENAOSE=12, NAO=13, RETURN=14, ATRI=15, ATRIBUICOES=16, OP_SUM_SUB=17, 
		OP_MUL_DIV_MOD=18, OP_BOOL=19, OP_LOG=20, OP=21, VAR=22, NUMINT=23, NUMREAL=24, 
		STRING=25, AC=26, FC=27, DEL=28, COM=29, WS=30;
	public static final int
		RULE_prog = 0, RULE_funcoes = 1, RULE_funcao = 2, RULE_bloco = 3, RULE_argumentos = 4, 
		RULE_argumento = 5, RULE_instrucoes = 6, RULE_instrocao = 7, RULE_retorna = 8, 
		RULE_se = 9, RULE_para = 10, RULE_controle = 11, RULE_callFuncao = 12, 
		RULE_nomeFuncao = 13, RULE_parametros = 14, RULE_decVar = 15, RULE_atribuicao = 16, 
		RULE_expressao = 17, RULE_expressaoVar = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "funcoes", "funcao", "bloco", "argumentos", "argumento", "instrucoes", 
			"instrocao", "retorna", "se", "para", "controle", "callFuncao", "nomeFuncao", 
			"parametros", "decVar", "atribuicao", "expressao", "expressaoVar"
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
	public String getGrammarFileName() { return "java-escape"; }

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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public FuncoesContext funcoes() {
			return getRuleContext(FuncoesContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			funcoes();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncoesContext extends ParserRuleContext {
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public FuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFuncoes(this);
		}
	}

	public final FuncoesContext funcoes() throws RecognitionException {
		FuncoesContext _localctx = new FuncoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAIN || _la==FUNC) {
				{
				{
				setState(40);
				funcao();
				}
				}
				setState(45);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GramaticaParser.FUNC, 0); }
		public TerminalNode TIPO() { return getToken(GramaticaParser.TIPO, 0); }
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode MAIN() { return getToken(GramaticaParser.MAIN, 0); }
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcao);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(FUNC);
				setState(47);
				match(TIPO);
				setState(48);
				match(VAR);
				setState(49);
				match(AP);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TIPO) {
					{
					setState(50);
					argumentos();
					}
				}

				setState(53);
				match(FP);
				setState(54);
				bloco();
				}
				break;
			case MAIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(MAIN);
				setState(56);
				match(AP);
				setState(57);
				match(FP);
				setState(58);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(AC);
			setState(62);
			instrucoes();
			setState(63);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argumentos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					argumento();
					setState(66);
					match(T__0);
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(73);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(GramaticaParser.TIPO, 0); }
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitArgumento(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argumento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(TIPO);
			setState(76);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInstrucoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInstrucoes(this);
		}
	}

	public final InstrucoesContext instrucoes() throws RecognitionException {
		InstrucoesContext _localctx = new InstrucoesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instrucoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4213704L) != 0) {
				{
				{
				setState(78);
				instrocao();
				}
				}
				setState(83);
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

	@SuppressWarnings("CheckReturnValue")
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
		public RetornaContext retorna() {
			return getRuleContext(RetornaContext.class,0);
		}
		public InstrocaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrocao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInstrocao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInstrocao(this);
		}
	}

	public final InstrocaoContext instrocao() throws RecognitionException {
		InstrocaoContext _localctx = new InstrocaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instrocao);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				se();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				para();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				callFuncao();
				setState(87);
				match(DEL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				decVar();
				setState(90);
				match(DEL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				atribuicao();
				setState(93);
				match(DEL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				retorna();
				setState(96);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RetornaContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(GramaticaParser.RETURN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RetornaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRetorna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRetorna(this);
		}
	}

	public final RetornaContext retorna() throws RecognitionException {
		RetornaContext _localctx = new RetornaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_retorna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(RETURN);
			setState(101);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSe(this);
		}
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_se);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(COND);
			setState(104);
			match(AP);
			setState(105);
			expressao(0);
			setState(106);
			match(FP);
			setState(107);
			bloco();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SENAOSE) {
				{
				{
				setState(108);
				match(SENAOSE);
				setState(109);
				match(AP);
				setState(110);
				expressao(0);
				setState(111);
				match(FP);
				setState(112);
				bloco();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAO) {
				{
				setState(119);
				match(NAO);
				setState(120);
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

	@SuppressWarnings("CheckReturnValue")
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
		public ControleContext controle() {
			return getRuleContext(ControleContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPara(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(LOOP);
			setState(124);
			match(AP);
			setState(125);
			decVar();
			setState(126);
			match(DEL);
			setState(127);
			controle();
			setState(128);
			match(DEL);
			setState(129);
			atribuicao();
			setState(130);
			match(FP);
			setState(131);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ControleContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterControle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitControle(this);
		}
	}

	public final ControleContext controle() throws RecognitionException {
		ControleContext _localctx = new ControleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_controle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallFuncaoContext extends ParserRuleContext {
		public NomeFuncaoContext nomeFuncao() {
			return getRuleContext(NomeFuncaoContext.class,0);
		}
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public CallFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCallFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCallFuncao(this);
		}
	}

	public final CallFuncaoContext callFuncao() throws RecognitionException {
		CallFuncaoContext _localctx = new CallFuncaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			nomeFuncao();
			setState(136);
			match(AP);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 63439312L) != 0) {
				{
				setState(137);
				parametros();
				}
			}

			setState(140);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NomeFuncaoContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
		public TerminalNode ENTR() { return getToken(GramaticaParser.ENTR, 0); }
		public TerminalNode SAI() { return getToken(GramaticaParser.SAI, 0); }
		public TerminalNode SAIQL() { return getToken(GramaticaParser.SAIQL, 0); }
		public NomeFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNomeFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNomeFuncao(this);
		}
	}

	public final NomeFuncaoContext nomeFuncao() throws RecognitionException {
		NomeFuncaoContext _localctx = new NomeFuncaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nomeFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4194752L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametros);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(144);
					expressao(0);
					setState(145);
					match(T__0);
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(152);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDecVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDecVar(this);
		}
	}

	public final DecVarContext decVar() throws RecognitionException {
		DecVarContext _localctx = new DecVarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_decVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(TIPO);
			setState(155);
			match(VAR);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRI) {
				{
				setState(156);
				match(ATRI);
				setState(157);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(VAR);
			setState(161);
			_la = _input.LA(1);
			if ( !(_la==ATRI || _la==ATRIBUICOES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(162);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoVarContext expressaoVar() {
			return getRuleContext(ExpressaoVarContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(165);
				expressaoVar();
				}
				break;
			case 2:
				{
				setState(166);
				callFuncao();
				}
				break;
			case 3:
				{
				setState(167);
				match(NUMINT);
				}
				break;
			case 4:
				{
				setState(168);
				match(NUMREAL);
				}
				break;
			case 5:
				{
				setState(169);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(170);
				match(OP_BOOL);
				}
				break;
			case 7:
				{
				setState(171);
				match(AP);
				setState(172);
				expressao(0);
				setState(173);
				match(FP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(177);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(178);
						match(OP_MUL_DIV_MOD);
						setState(179);
						expressao(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(180);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(181);
						match(OP_SUM_SUB);
						setState(182);
						expressao(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(183);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(184);
						match(OP);
						setState(185);
						expressao(3);
						}
						break;
					case 4:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(186);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(187);
						match(OP_LOG);
						setState(188);
						expressao(2);
						}
						break;
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoVarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
		public ExpressaoVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressaoVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressaoVar(this);
		}
	}

	public final ExpressaoVarContext expressaoVar() throws RecognitionException {
		ExpressaoVarContext _localctx = new ExpressaoVarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressaoVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
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
		"\u0004\u0001\u001e\u00c5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001*\b\u0001\n\u0001"+
		"\f\u0001-\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u00024\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004E\b\u0004\n\u0004\f\u0004H\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0005\u0006P\b\u0006\n\u0006"+
		"\f\u0006S\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007c\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\ts\b\t\n\t\f\tv\t\t\u0001\t\u0001"+
		"\t\u0003\tz\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u008b\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0094\b\u000e\n\u000e\f\u000e\u0097\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u009f\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00b0\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u00be\b\u0011\n\u0011\f\u0011\u00c1\t\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0000\u0001\"\u0013\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000"+
		"\u0002\u0002\u0000\u0006\b\u0016\u0016\u0001\u0000\u000f\u0010\u00ca\u0000"+
		"&\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004;\u0001"+
		"\u0000\u0000\u0000\u0006=\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000"+
		"\u0000\nK\u0001\u0000\u0000\u0000\fQ\u0001\u0000\u0000\u0000\u000eb\u0001"+
		"\u0000\u0000\u0000\u0010d\u0001\u0000\u0000\u0000\u0012g\u0001\u0000\u0000"+
		"\u0000\u0014{\u0001\u0000\u0000\u0000\u0016\u0085\u0001\u0000\u0000\u0000"+
		"\u0018\u0087\u0001\u0000\u0000\u0000\u001a\u008e\u0001\u0000\u0000\u0000"+
		"\u001c\u0095\u0001\u0000\u0000\u0000\u001e\u009a\u0001\u0000\u0000\u0000"+
		" \u00a0\u0001\u0000\u0000\u0000\"\u00af\u0001\u0000\u0000\u0000$\u00c2"+
		"\u0001\u0000\u0000\u0000&\'\u0003\u0002\u0001\u0000\'\u0001\u0001\u0000"+
		"\u0000\u0000(*\u0003\u0004\u0002\u0000)(\u0001\u0000\u0000\u0000*-\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		",\u0003\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005\n\u0000"+
		"\u0000/0\u0005\u0003\u0000\u000001\u0005\u0016\u0000\u000013\u0005\u0004"+
		"\u0000\u000024\u0003\b\u0004\u000032\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000056\u0005\u0005\u0000\u00006<\u0003"+
		"\u0006\u0003\u000078\u0005\u0002\u0000\u000089\u0005\u0004\u0000\u0000"+
		"9:\u0005\u0005\u0000\u0000:<\u0003\u0006\u0003\u0000;.\u0001\u0000\u0000"+
		"\u0000;7\u0001\u0000\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=>\u0005"+
		"\u001a\u0000\u0000>?\u0003\f\u0006\u0000?@\u0005\u001b\u0000\u0000@\u0007"+
		"\u0001\u0000\u0000\u0000AB\u0003\n\u0005\u0000BC\u0005\u0001\u0000\u0000"+
		"CE\u0001\u0000\u0000\u0000DA\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0003\n\u0005\u0000J\t\u0001"+
		"\u0000\u0000\u0000KL\u0005\u0003\u0000\u0000LM\u0005\u0016\u0000\u0000"+
		"M\u000b\u0001\u0000\u0000\u0000NP\u0003\u000e\u0007\u0000ON\u0001\u0000"+
		"\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000R\r\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"Tc\u0003\u0012\t\u0000Uc\u0003\u0014\n\u0000VW\u0003\u0018\f\u0000WX\u0005"+
		"\u001c\u0000\u0000Xc\u0001\u0000\u0000\u0000YZ\u0003\u001e\u000f\u0000"+
		"Z[\u0005\u001c\u0000\u0000[c\u0001\u0000\u0000\u0000\\]\u0003 \u0010\u0000"+
		"]^\u0005\u001c\u0000\u0000^c\u0001\u0000\u0000\u0000_`\u0003\u0010\b\u0000"+
		"`a\u0005\u001c\u0000\u0000ac\u0001\u0000\u0000\u0000bT\u0001\u0000\u0000"+
		"\u0000bU\u0001\u0000\u0000\u0000bV\u0001\u0000\u0000\u0000bY\u0001\u0000"+
		"\u0000\u0000b\\\u0001\u0000\u0000\u0000b_\u0001\u0000\u0000\u0000c\u000f"+
		"\u0001\u0000\u0000\u0000de\u0005\u000e\u0000\u0000ef\u0003\"\u0011\u0000"+
		"f\u0011\u0001\u0000\u0000\u0000gh\u0005\u000b\u0000\u0000hi\u0005\u0004"+
		"\u0000\u0000ij\u0003\"\u0011\u0000jk\u0005\u0005\u0000\u0000kt\u0003\u0006"+
		"\u0003\u0000lm\u0005\f\u0000\u0000mn\u0005\u0004\u0000\u0000no\u0003\""+
		"\u0011\u0000op\u0005\u0005\u0000\u0000pq\u0003\u0006\u0003\u0000qs\u0001"+
		"\u0000\u0000\u0000rl\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uy\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000wx\u0005\r\u0000\u0000xz\u0003\u0006\u0003"+
		"\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0013\u0001"+
		"\u0000\u0000\u0000{|\u0005\t\u0000\u0000|}\u0005\u0004\u0000\u0000}~\u0003"+
		"\u001e\u000f\u0000~\u007f\u0005\u001c\u0000\u0000\u007f\u0080\u0003\u0016"+
		"\u000b\u0000\u0080\u0081\u0005\u001c\u0000\u0000\u0081\u0082\u0003 \u0010"+
		"\u0000\u0082\u0083\u0005\u0005\u0000\u0000\u0083\u0084\u0003\u0006\u0003"+
		"\u0000\u0084\u0015\u0001\u0000\u0000\u0000\u0085\u0086\u0003\"\u0011\u0000"+
		"\u0086\u0017\u0001\u0000\u0000\u0000\u0087\u0088\u0003\u001a\r\u0000\u0088"+
		"\u008a\u0005\u0004\u0000\u0000\u0089\u008b\u0003\u001c\u000e\u0000\u008a"+
		"\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0005\u0000\u0000\u008d"+
		"\u0019\u0001\u0000\u0000\u0000\u008e\u008f\u0007\u0000\u0000\u0000\u008f"+
		"\u001b\u0001\u0000\u0000\u0000\u0090\u0091\u0003\"\u0011\u0000\u0091\u0092"+
		"\u0005\u0001\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0090"+
		"\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098"+
		"\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0003\"\u0011\u0000\u0099\u001d\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"\u0003\u0000\u0000\u009b\u009e\u0005\u0016\u0000\u0000\u009c\u009d\u0005"+
		"\u000f\u0000\u0000\u009d\u009f\u0003\"\u0011\u0000\u009e\u009c\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u001f\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005\u0016\u0000\u0000\u00a1\u00a2\u0007\u0001"+
		"\u0000\u0000\u00a2\u00a3\u0003\"\u0011\u0000\u00a3!\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0006\u0011\uffff\uffff\u0000\u00a5\u00b0\u0003$\u0012"+
		"\u0000\u00a6\u00b0\u0003\u0018\f\u0000\u00a7\u00b0\u0005\u0017\u0000\u0000"+
		"\u00a8\u00b0\u0005\u0018\u0000\u0000\u00a9\u00b0\u0005\u0019\u0000\u0000"+
		"\u00aa\u00b0\u0005\u0013\u0000\u0000\u00ab\u00ac\u0005\u0004\u0000\u0000"+
		"\u00ac\u00ad\u0003\"\u0011\u0000\u00ad\u00ae\u0005\u0005\u0000\u0000\u00ae"+
		"\u00b0\u0001\u0000\u0000\u0000\u00af\u00a4\u0001\u0000\u0000\u0000\u00af"+
		"\u00a6\u0001\u0000\u0000\u0000\u00af\u00a7\u0001\u0000\u0000\u0000\u00af"+
		"\u00a8\u0001\u0000\u0000\u0000\u00af\u00a9\u0001\u0000\u0000\u0000\u00af"+
		"\u00aa\u0001\u0000\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00b0"+
		"\u00bf\u0001\u0000\u0000\u0000\u00b1\u00b2\n\u0004\u0000\u0000\u00b2\u00b3"+
		"\u0005\u0012\u0000\u0000\u00b3\u00be\u0003\"\u0011\u0005\u00b4\u00b5\n"+
		"\u0003\u0000\u0000\u00b5\u00b6\u0005\u0011\u0000\u0000\u00b6\u00be\u0003"+
		"\"\u0011\u0004\u00b7\u00b8\n\u0002\u0000\u0000\u00b8\u00b9\u0005\u0015"+
		"\u0000\u0000\u00b9\u00be\u0003\"\u0011\u0003\u00ba\u00bb\n\u0001\u0000"+
		"\u0000\u00bb\u00bc\u0005\u0014\u0000\u0000\u00bc\u00be\u0003\"\u0011\u0002"+
		"\u00bd\u00b1\u0001\u0000\u0000\u0000\u00bd\u00b4\u0001\u0000\u0000\u0000"+
		"\u00bd\u00b7\u0001\u0000\u0000\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000"+
		"\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0#\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0016\u0000\u0000\u00c3"+
		"%\u0001\u0000\u0000\u0000\u000e+3;FQbty\u008a\u0095\u009e\u00af\u00bd"+
		"\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}