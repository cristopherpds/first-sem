import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./arquivos/texto.txt");
        Files.createDirectories(path.getParent());

        String texto = "Mollit dolor aliqua consequat ea. Eiusmod laborum aliqua nostrud incididunt ex consequat officia sit mollit culpa. Duis ad id sunt excepteur quis laboris ad laboris pariatur officia ullamco consectetur. Et ex in ut cillum excepteur enim.";
        byte[] bytes = texto.getBytes();
        Files.write(path, bytes);
    
    }
}
