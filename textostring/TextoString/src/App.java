public class App {
    public static void main(String[] args) throws Exception {
        String texto = "Em linguistica, a nocao de texto e ampla, ainda aberta,  a uma definicao mais precisa.";
        String[] tokens = texto.split(",");
        System.out.println(tokens.length + " tokens(s)");

        for(String seg : tokens){
            System.out.println(seg.trim());
        }
    }
}
