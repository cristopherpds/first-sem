public class App {
    /*formas de declaracao */
    public static void main(String[] args) {


        String z = "6";
        int x = 4;
        int y = 5;
        String frase = "Novo mundo novo! ";
        System.out.println(frase.length());
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println(frase.trim());
        int w = Integer.parseInt(z);
        System.out.println(x + y + w);


        String palavra = new String("Java");
        String termo = "JAVA";
        System.out.println(palavra.equals(termo));
        System.out.println(palavra.equalsIgnoreCase(termo));

        
        String numInt = "6";
        String numDouble = "7.3";
        String nada = null;
        char[] letras = {'a', 'b', 'c'};
        String alfa = new String(letras);
        System.out.println(alfa);

        int pos = 0;
        for(char letra: frase.toCharArray()){
            System.out.println("char["+pos+"]:" + letra);
            pos++;
        }

        for(byte b : frase.getBytes()){
            System.out.println("ASCII: " + b);
        }

        System.out.println(frase.charAt(5));
        System.out.println(frase.replace("o", "0"));
        System.out.println(frase.replaceFirst("o", "0"));
  
        System.out.println(frase.isEmpty());
    }
}
