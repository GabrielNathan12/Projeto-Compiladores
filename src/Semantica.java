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
     @Override
     public void exitFuncoes(GramaticaParser.FuncoesContext ctx) {
        
        if(!Funcoes.containsKey("main")){
            System.out.println("Funcao main nao declarada");
        }
     }

     @Override
     public void enterRetorna(GramaticaParser.RetornaContext ctx) {
        
        if(!verificaTipo(Funcoes.get(funcaoAtual), ctx.expressao())){
            System.out.println("Tipo de retorno diferente do experado");
        }
     }

     @Override
     public void enterControle(GramaticaParser.ControleContext ctx) {
        if(!verificaTipo("booleano", ctx.expressao())){
            System.out.println("Condicao do para nao e booleano");
        }
     }
     @Override
     public void enterSe(GramaticaParser.SeContext ctx) {

        for(GramaticaParser.ExpressaoContext exp: ctx.expressao()){    
            if(!verificaTipo("booleano", exp)){
                System.out.println("Condicao do se nao e booleano");
            }
        }
     }
     
     @Override
     public void enterArgumento(GramaticaParser.ArgumentoContext ctx) {
        String nome = ctx.VAR().getText();
        String tipo = ctx.TIPO().getText();
        Variaveis.put(nome, tipo);
     }
     
     @Override
     public void enterExpressaoVar(GramaticaParser.ExpressaoVarContext ctx) {
        String nome = ctx.VAR().getText();

        if(!Variaveis.containsKey(nome)){
            System.out.println("Variavel nao existe " + nome);
        }
     }
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
        
        if(ctx.expressaoVar() != null){
            return Variaveis.get(ctx.expressaoVar().getText()).equals(tipo);
        }
        else if(ctx.AP() != null){
            return verificaTipo(tipo, ctx.expressao(0));
        }
        else if(ctx.callFuncao() != null){
            return Funcoes.get(ctx.callFuncao().nomeFuncao().getText()).equals(tipo);
        }
        else if(tipo.equals("string")){
            if(ctx.STRING() != null){
                return true;
            }else{
                return false;
            }
        }else if(tipo.equals("inteiro")){
            if(ctx.NUMINT() != null){
                return true;
            }else if(ctx.OP_SUM_SUB() != null){
                return verificaTipo(tipo, ctx.expressao(1)) && verificaTipo(tipo, ctx.expressao(0));
            }else if(ctx.OP_MUL_DIV_MOD() != null){
                return verificaTipo(tipo, ctx.expressao(1)) && verificaTipo(tipo, ctx.expressao(0));
            }else {
                return false;
            }
        }else if(tipo.equals("real")){
            if(ctx.NUMREAL() != null){
                return true;
            }else if(ctx.OP_SUM_SUB() != null){
                return verificaTipo(tipo, ctx.expressao(1)) && verificaTipo(tipo, ctx.expressao(0));
            }else if(ctx.OP_MUL_DIV_MOD() != null){
                return verificaTipo(tipo, ctx.expressao(1)) && verificaTipo(tipo, ctx.expressao(0));
            }else {
                return false;
            }
        }else if(tipo.equals("booleano")){
            if(ctx.OP_BOOL() != null){
                return true;
            }else if(ctx.OP_LOG() != null){
                return verificaTipo(tipo, ctx.expressao(1)) && verificaTipo(tipo, ctx.expressao(0));
            }else if(ctx.OP() != null){
                boolean ladoDir = verificaTipo("inteiro", ctx.expressao(0)) || verificaTipo("real", ctx.expressao(0));
                boolean ladoEsq = verificaTipo("inteiro", ctx.expressao(1)) || verificaTipo("real", ctx.expressao(1));
                return ladoDir && ladoEsq;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
