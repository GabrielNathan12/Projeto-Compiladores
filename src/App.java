import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
public class App{
    public static void main(String[] args){
        String arquivo = "./src/programas/programaLexico2.txt";
        try{
            CharStream input = CharStreams.fromFileName(arquivo);
            GramaticaLexer lexer = new GramaticaLexer(input);
            while(!lexer._hitEOF){
                Token token = lexer.nextToken();
                System.out.println("Token: "+ token.toString());
                System.out.println("    Lexema: "+ token.getText());
                System.out.println("    Classe: "+lexer.getVocabulary().getDisplayName(token.getType()));
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
