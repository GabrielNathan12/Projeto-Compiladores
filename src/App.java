import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
public class App{
    public static void main(String[] args){
        String arquivo = "./src/programas/programaErroLexico.txt";
        try{
            CharStream input = CharStreams.fromFileName(arquivo);
            GramaticaLexer lexer = new GramaticaLexer(input);
            // while(!lexer._hitEOF){
            //     Token token = lexer.nextToken();
            //     System.out.println("Token: "+ token.toString());
            //     System.out.println("    Lexema: "+ token.getText());
            //     System.out.println("    Classe: "+lexer.getVocabulary().getDisplayName(token.getType()));
                
            // }
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            GramaticaParser parser = new GramaticaParser(tokenStream);

            ParseTree ast = parser.prog();
            Semantica listener = new Semantica();
            
            ParseTreeWalker parseTreeWalker = new ParseTreeWalker();

            

            if(parser.getNumberOfSyntaxErrors() > 0){
                System.out.println("Arvore Sintatica nao construido ");
            }else{
                parseTreeWalker.walk(listener, ast);
                System.out.println("Arvore Sintatica construida com sucesso!!!");
            }

        }
        catch(IOException e){
            e.printStackTrace();
        }
       
    }


}
