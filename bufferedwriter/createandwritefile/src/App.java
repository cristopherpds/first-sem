import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;


public class App {
    public static void main(String[] args){

        Path path = Paths.get("./arquivos/texto.txt");

        Charset utf8 = StandardCharsets.UTF_8;

        //BufferedWriter  bw = null; 

        // try {
        //     bw = Files.newBufferedWriter(path, utf8);
        //     bw.write("Hoje estammos trabalhando com Stream.\n");
        //     bw.write("Podemos adicinar varios textos.\n");
        //     bw.write("Sem perder a informacao.\n");
        //     bw.flush();
            
        //     bw.close();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // java8+
        // try (BufferedWriter bw = Files.newBufferedWriter(path, utf8)) {
        //         bw.write("Hoje estammos trabalhando com Stream.\n");
        //         bw.write("Podemos adicinar varios textos.\n");
        //         bw.write("Sem perder a informacao.\n");
        //         bw.write("teste.\n");
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        try (BufferedReader br = Files.newBufferedReader(path, utf8)) {

            String line = null;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
