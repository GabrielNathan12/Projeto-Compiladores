// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GramaticaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GramaticaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void enterFuncoes(GramaticaParser.FuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void exitFuncoes(GramaticaParser.FuncoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(GramaticaParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(GramaticaParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(GramaticaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(GramaticaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(GramaticaParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(GramaticaParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#argumento}.
	 * @param ctx the parse tree
	 */
	void enterArgumento(GramaticaParser.ArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#argumento}.
	 * @param ctx the parse tree
	 */
	void exitArgumento(GramaticaParser.ArgumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instrucoes}.
	 * @param ctx the parse tree
	 */
	void enterInstrucoes(GramaticaParser.InstrucoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instrucoes}.
	 * @param ctx the parse tree
	 */
	void exitInstrucoes(GramaticaParser.InstrucoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instrocao}.
	 * @param ctx the parse tree
	 */
	void enterInstrocao(GramaticaParser.InstrocaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instrocao}.
	 * @param ctx the parse tree
	 */
	void exitInstrocao(GramaticaParser.InstrocaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#retorna}.
	 * @param ctx the parse tree
	 */
	void enterRetorna(GramaticaParser.RetornaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#retorna}.
	 * @param ctx the parse tree
	 */
	void exitRetorna(GramaticaParser.RetornaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#se}.
	 * @param ctx the parse tree
	 */
	void enterSe(GramaticaParser.SeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#se}.
	 * @param ctx the parse tree
	 */
	void exitSe(GramaticaParser.SeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(GramaticaParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(GramaticaParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#controle}.
	 * @param ctx the parse tree
	 */
	void enterControle(GramaticaParser.ControleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#controle}.
	 * @param ctx the parse tree
	 */
	void exitControle(GramaticaParser.ControleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#callFuncao}.
	 * @param ctx the parse tree
	 */
	void enterCallFuncao(GramaticaParser.CallFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#callFuncao}.
	 * @param ctx the parse tree
	 */
	void exitCallFuncao(GramaticaParser.CallFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#nomeFuncao}.
	 * @param ctx the parse tree
	 */
	void enterNomeFuncao(GramaticaParser.NomeFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#nomeFuncao}.
	 * @param ctx the parse tree
	 */
	void exitNomeFuncao(GramaticaParser.NomeFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(GramaticaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(GramaticaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#decVar}.
	 * @param ctx the parse tree
	 */
	void enterDecVar(GramaticaParser.DecVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#decVar}.
	 * @param ctx the parse tree
	 */
	void exitDecVar(GramaticaParser.DecVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(GramaticaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(GramaticaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressaoVar}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoVar(GramaticaParser.ExpressaoVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressaoVar}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoVar(GramaticaParser.ExpressaoVarContext ctx);
}