import java.util.HashMap;
import java.util.Map;

public class Semantica extends GramaticaBaseListener{
     private Map<String, String> Variaveis;
     private Map<String, String> Funcoes;
     private String funcaoAtual;
     
     public Semantica(){
        Variaveis = new HashMap<>();
        Funcoes = new HashMap<>();
     }
     /** Verifica se a mais esta declarada */
     @Override
     public void exitFuncoes(GramaticaParser.FuncoesContext ctx) {
        
        if(!Funcoes.containsKey("main")){
            System.out.println("Funcao main nao declarada");
        }
     }

     /**Verifica o tipo de retorno e o mesmo da funcao */
     @Override
     public void enterRetorna(GramaticaParser.RetornaContext ctx) {
        
        if(!verificaTipo(Funcoes.get(funcaoAtual), ctx.expressao())){
            System.out.println("Tipo de retorno diferente do experado");
        }
     }

     /** Verifica o controle do para */
     @Override
     public void enterControle(GramaticaParser.ControleContext ctx) {
        if(!verificaTipo("booleano", ctx.expressao())){
            System.out.println("Condicao do para nao e booleano");
        }
     }
     /** Verifica o booleano do se */
     @Override
     public void enterSe(GramaticaParser.SeContext ctx) {

        for(GramaticaParser.ExpressaoContext exp: ctx.expressao()){    
            if(!verificaTipo("booleano", exp)){
                System.out.println("Condicao do se nao e booleano");
            }
        }
     }
     /**Declaracao de variavel */
     @Override
     public void enterArgumento(GramaticaParser.ArgumentoContext ctx) {
        String nome = ctx.VAR().getText();
        String tipo = ctx.TIPO().getText();
        Variaveis.put(nome, tipo);
     }
     /**Verifica se o tipo da variavel ja existe */
     @Override
     public void enterExpressaoVar(GramaticaParser.ExpressaoVarContext ctx) {
        String nome = ctx.VAR().getText();

        if(!Variaveis.containsKey(nome)){
            System.out.println("Variavel nao existe " + nome);
        }
     }
     /** declaracao da main obrigatoria 
      * Se nao e uma funcao nova
      * Se caso essa funcao ja tenha sido declarada e um erro 
     */
     @Override
     public void enterFuncao(GramaticaParser.FuncaoContext ctx) {
         String nome;
         String tipo;
         
         if(ctx.MAIN() != null){
            nome = "main";
            tipo = null;
         }else {
            nome = ctx.VAR().getText();
            tipo = ctx.TIPO().getText();
         }

         Variaveis = new HashMap<>();

         if(Funcoes.containsKey(nome)){
            System.out.println("Funcao ja declarada "+ nome);
            return;
         }
         Funcoes.put(nome, tipo);
         funcaoAtual = nome;
     }

     /**Verifica se a variavel ja foi declarada
      * se nao insere ele no Map
      * O if verifica se o tipo da variavel e o mesmo tipo que ela ta sendo atribuida
      */
     @Override
     public void enterDecVar(GramaticaParser.DecVarContext ctx) {
         String nome = ctx.VAR().getText();
         String tipo = ctx.TIPO().getText();

         if(Variaveis.containsKey(nome)){
            System.out.println("Variavel ja declarada "+ nome);
            return;
         }

         Variaveis.put(nome, tipo);

         if(ctx.expressao() != null){
            if(!verificaTipo(tipo, ctx.expressao())){
                System.out.println("Inicializacao invalida para a variavel " + nome);
            }
         }
     }

     /** Verifica se a varivel foi declarada, depois verifica se a atribuicao e valida */
    @Override
    public void enterAtribuicao(GramaticaParser.AtribuicaoContext ctx) {
        String nome = ctx.VAR().getText();

        if(!Variaveis.containsKey(nome)){
            System.out.println("Variavel nao declarada " + nome);
            return ;
        } 
        if(!verificaTipo(Variaveis.get(nome), ctx.expressao())){
            System.out.println("Atribuicao invalida para a varivel " + nome);
        }
    }

    public boolean verificaTipo(String tipo, GramaticaParser.ExpressaoContext ctx){

        /**Verifica se a variavel esta duplicada no codigo */        
        if(ctx.expressaoVar() != null){
            return Variaveis.get(ctx.expressaoVar().getText()).equals(tipo);
        }
        /**Verifica se o abre parenteses foi fechado */
        else if(ctx.AP() != null){
            return verificaTipo(tipo, ctx.expressao(0));
        }
        /**Verifica se o nome da funcao esta duplicada */
        else if(ctx.callFuncao() != null){
            return Funcoes.get(ctx.callFuncao().nomeFuncao().getText()).equals(tipo);
        }
        /**Verifica se a variavel e uma string */
        else if(tipo.equals("string")){
            if(ctx.STRING() != null){
                return true;
            }else{
                return false;
            }
            /**Verifica se a variavel e um inteiro */
        }else if(tipo.equals("inteiro")){
            if(ctx.NUMINT() != null){
                return true;
            }else if(ctx.OP_SUM_SUB() != null){
                /**Verifica na parte esquerda e direita se o numero e inteiro para realizar a operacao */
                return verificaTipo(tipo, ctx.expressao(1)) && verificaTipo(tipo, ctx.expressao(0));
            }else if(ctx.OP_MUL_DIV_MOD() != null){
                /**Verifica na parte esquerda e direita se o numero e inteiro para realizar a operacao */
                return verificaTipo(tipo, ctx.expressao(1)) && verificaTipo(tipo, ctx.expressao(0));
            }else {
                /**Se nao retorna falso */
                return false;
            }
        }else if(tipo.equals("real")){
            if(ctx.NUMREAL() != null){
                return true;
            }else if(ctx.OP_SUM_SUB() != null){
                /**Verifica na parte esquerda e direita se o numero e real para realizar a operacao */
                return verificaTipo(tipo, ctx.expressao(1)) && verificaTipo(tipo, ctx.expressao(0));
            }else if(ctx.OP_MUL_DIV_MOD() != null){
                /**Verifica na parte esquerda e direita se o numero e real para realizar a operacao */
                return verificaTipo(tipo, ctx.expressao(1)) && verificaTipo(tipo, ctx.expressao(0));
            }else {
                /**Se nao ele retorna falso */
                return false;
            }
        }else if(tipo.equals("booleano")){
            if(ctx.OP_BOOL() != null){
                return true;
            }else if(ctx.OP_LOG() != null){
                /**Verifica na parte esquerda e direita se sao compativeis para realizar a operacao */
                return verificaTipo(tipo, ctx.expressao(1)) && verificaTipo(tipo, ctx.expressao(0));
            }else if(ctx.OP() != null){
                /**Verifica no lado direito se e um numero inteiro para realizar operacao com o numero real */
                boolean ladoDir = verificaTipo("inteiro", ctx.expressao(0)) || verificaTipo("real", ctx.expressao(0));
                /**Verifica no lado esquerdo se e um numero inteiro para realizar operacao com o numero real */
                boolean ladoEsq = verificaTipo("inteiro", ctx.expressao(1)) || verificaTipo("real", ctx.expressao(1));
                /**retorna esses dois lados */
                return ladoDir && ladoEsq;
            }
            else{
                /**Se nao retorna falso */
                return false;
            }
        }
        return false;
    }
}
