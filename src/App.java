import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
public class App{
    public static void main(String[] args){
        String arquivo = "./src/programas/programaLexico2.txt";
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

            

            if(parser.getNumberOfSyntaxErrors() > 0){
                System.out.println("Ocorreu erros de compilacao: ");
            }else{
                System.out.println("Compilado com sucesso meu consagrado!!!");
            }

        }
        catch(IOException e){
            e.printStackTrace();
        }

      
    // ANTLRInputStream stream = new ANTLRInputStream();

    // CommonTokenStream tokenStream = new CommonTokenStream();

    // System.out.println("Sei la o que e isso = " + stream.toString());
    // System.out.println("Tambem nao sei ainda = " + tokenStream.toString());


       
    }


}
