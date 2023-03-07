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
		public FuncoesContext funcoes() {
			return getRuleContext(FuncoesContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
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
		enterRule(_localctx, 12, RULE_instrucoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << ENTR) | (1L << SAI) | (1L << SAIQL) | (1L << LOOP) | (1L << COND) | (1L << RETURN) | (1L << VAR))) != 0)) {
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

	public static class RetornaContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(GramaticaParser.RETURN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RetornaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorna; }
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

	public static class ControleContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controle; }
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AP) | (1L << ENTR) | (1L << SAI) | (1L << SAIQL) | (1L << OP_BOOL) | (1L << VAR) | (1L << NUMINT) | (1L << NUMREAL) | (1L << STRING))) != 0)) {
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

	public static class NomeFuncaoContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
		public TerminalNode ENTR() { return getToken(GramaticaParser.ENTR, 0); }
		public TerminalNode SAI() { return getToken(GramaticaParser.SAI, 0); }
		public TerminalNode SAIQL() { return getToken(GramaticaParser.SAIQL, 0); }
		public NomeFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeFuncao; }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTR) | (1L << SAI) | (1L << SAIQL) | (1L << VAR))) != 0)) ) {
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

	public static class ExpressaoVarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
		public ExpressaoVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoVar; }
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00c7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\7\3,\n\3\f\3\16\3/\13\3\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\66\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\7\6G\n\6\f\6\16\6J\13\6\3\6\3\6\3\7\3\7\3\7\3\b\7\bR\n\b\f\b"+
		"\16\bU\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\te\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13u\n\13\f\13\16\13x\13\13\3\13\3\13\5\13|\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\5\16\u008d\n\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\7\20\u0096\n\20\f\20\16\20\u0099\13\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00a1\n\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b2\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00c0\n\23"+
		"\f\23\16\23\u00c3\13\23\3\24\3\24\3\24\2\3$\25\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&\2\4\4\2\b\n\30\30\3\2\21\22\2\u00cc\2(\3\2\2\2\4"+
		"-\3\2\2\2\6=\3\2\2\2\b?\3\2\2\2\nH\3\2\2\2\fM\3\2\2\2\16S\3\2\2\2\20d"+
		"\3\2\2\2\22f\3\2\2\2\24i\3\2\2\2\26}\3\2\2\2\30\u0087\3\2\2\2\32\u0089"+
		"\3\2\2\2\34\u0090\3\2\2\2\36\u0097\3\2\2\2 \u009c\3\2\2\2\"\u00a2\3\2"+
		"\2\2$\u00b1\3\2\2\2&\u00c4\3\2\2\2()\5\4\3\2)\3\3\2\2\2*,\5\6\4\2+*\3"+
		"\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\5\3\2\2\2/-\3\2\2\2\60\61\7\f\2"+
		"\2\61\62\7\5\2\2\62\63\7\30\2\2\63\65\7\6\2\2\64\66\5\n\6\2\65\64\3\2"+
		"\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7\7\2\28>\5\b\5\29:\7\4\2\2:;\7\6"+
		"\2\2;<\7\7\2\2<>\5\b\5\2=\60\3\2\2\2=9\3\2\2\2>\7\3\2\2\2?@\7\34\2\2@"+
		"A\5\16\b\2AB\7\35\2\2B\t\3\2\2\2CD\5\f\7\2DE\7\3\2\2EG\3\2\2\2FC\3\2\2"+
		"\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\5\f\7\2L\13\3\2"+
		"\2\2MN\7\5\2\2NO\7\30\2\2O\r\3\2\2\2PR\5\20\t\2QP\3\2\2\2RU\3\2\2\2SQ"+
		"\3\2\2\2ST\3\2\2\2T\17\3\2\2\2US\3\2\2\2Ve\5\24\13\2We\5\26\f\2XY\5\32"+
		"\16\2YZ\7\36\2\2Ze\3\2\2\2[\\\5 \21\2\\]\7\36\2\2]e\3\2\2\2^_\5\"\22\2"+
		"_`\7\36\2\2`e\3\2\2\2ab\5\22\n\2bc\7\36\2\2ce\3\2\2\2dV\3\2\2\2dW\3\2"+
		"\2\2dX\3\2\2\2d[\3\2\2\2d^\3\2\2\2da\3\2\2\2e\21\3\2\2\2fg\7\20\2\2gh"+
		"\5$\23\2h\23\3\2\2\2ij\7\r\2\2jk\7\6\2\2kl\5$\23\2lm\7\7\2\2mv\5\b\5\2"+
		"no\7\16\2\2op\7\6\2\2pq\5$\23\2qr\7\7\2\2rs\5\b\5\2su\3\2\2\2tn\3\2\2"+
		"\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w{\3\2\2\2xv\3\2\2\2yz\7\17\2\2z|\5\b"+
		"\5\2{y\3\2\2\2{|\3\2\2\2|\25\3\2\2\2}~\7\13\2\2~\177\7\6\2\2\177\u0080"+
		"\5 \21\2\u0080\u0081\7\36\2\2\u0081\u0082\5\30\r\2\u0082\u0083\7\36\2"+
		"\2\u0083\u0084\5\"\22\2\u0084\u0085\7\7\2\2\u0085\u0086\5\b\5\2\u0086"+
		"\27\3\2\2\2\u0087\u0088\5$\23\2\u0088\31\3\2\2\2\u0089\u008a\5\34\17\2"+
		"\u008a\u008c\7\6\2\2\u008b\u008d\5\36\20\2\u008c\u008b\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\7\2\2\u008f\33\3\2\2\2\u0090"+
		"\u0091\t\2\2\2\u0091\35\3\2\2\2\u0092\u0093\5$\23\2\u0093\u0094\7\3\2"+
		"\2\u0094\u0096\3\2\2\2\u0095\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009b\5$\23\2\u009b\37\3\2\2\2\u009c\u009d\7\5\2\2\u009d\u00a0\7\30\2"+
		"\2\u009e\u009f\7\21\2\2\u009f\u00a1\5$\23\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1!\3\2\2\2\u00a2\u00a3\7\30\2\2\u00a3\u00a4\t\3\2\2"+
		"\u00a4\u00a5\5$\23\2\u00a5#\3\2\2\2\u00a6\u00a7\b\23\1\2\u00a7\u00b2\5"+
		"&\24\2\u00a8\u00b2\5\32\16\2\u00a9\u00b2\7\31\2\2\u00aa\u00b2\7\32\2\2"+
		"\u00ab\u00b2\7\33\2\2\u00ac\u00b2\7\25\2\2\u00ad\u00ae\7\6\2\2\u00ae\u00af"+
		"\5$\23\2\u00af\u00b0\7\7\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00a6\3\2\2\2\u00b1"+
		"\u00a8\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00aa\3\2\2\2\u00b1\u00ab\3\2"+
		"\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b2\u00c1\3\2\2\2\u00b3"+
		"\u00b4\f\6\2\2\u00b4\u00b5\7\24\2\2\u00b5\u00c0\5$\23\7\u00b6\u00b7\f"+
		"\5\2\2\u00b7\u00b8\7\23\2\2\u00b8\u00c0\5$\23\6\u00b9\u00ba\f\4\2\2\u00ba"+
		"\u00bb\7\27\2\2\u00bb\u00c0\5$\23\5\u00bc\u00bd\f\3\2\2\u00bd\u00be\7"+
		"\26\2\2\u00be\u00c0\5$\23\4\u00bf\u00b3\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf"+
		"\u00b9\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2%\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5"+
		"\7\30\2\2\u00c5\'\3\2\2\2\20-\65=HSdv{\u008c\u0097\u00a0\u00b1\u00bf\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}