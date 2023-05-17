import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {


      String[] naipes = {"Espadas", "Paus", "Copas", "Ouros"};
      String[] valores = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Rainha", "Rei"};
      Random rand = new Random();
      int indexNaipe = rand.nextInt(naipes.length);
      int indexValor = rand.nextInt(valores.length);
      String naipe = naipes[indexNaipe];
      String valor = valores[indexValor];
      System.out.println("Carta aleatória: " + valor + " de " + naipe);




        // String [] cidades ={"Rivera", "Bage", "Maral", "Canela"};
        // int [] par = new int[5];
        // par[0] = 0;
        // par[1] = 1;
        // par[2] = 2;
        // par[3] = 3;
        // par[4] = 4;
        // int [] numeros = {1,2,3,4,5,6,7,8,9};
        // int[] impar = {1,3,5,7,9};

        // System.out.println(Arrays.toString(cidades));
        // Arrays.sort(cidades, 0, cidades.length);
        // System.out.println(Arrays.toString(cidades));
        
        // System.out.println(Arrays.binarySearch(cidades, "Maral"));
        
        // System.out.println(Arrays.toString(numeros));

        // ArrayList<String> cores = new ArrayList<>();
        // cores.add("Preto");
        // cores.add("Branco");
        // cores.add("Azul");
        // System.out.println(cores.toString());
        // cores.remove("Branco");
        // System.out.println(cores.toString());
        // System.out.println(cores.size());
        // System.out.println(cores.indexOf("Azul"));
        

        

        

        /*
        Trabajo: 23/05
        Opciones de JOptionPane
        Mostrar las possibilidades de configuracion;
        Apresentar modos de personalizacion de los paneles(frames)
        abneraraujo@ifsul.edu.br
        */
    }
}
