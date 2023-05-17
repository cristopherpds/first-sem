import java.util.StringTokenizer;

import java.util.*;
public class App {
    public static void main(String[] args)   {

        String clinetes = "Ana dos Santos; Paulo Ramos; Rui Robaina; Maria Cunha; Laura Arntunes; Marcelo Ceolin";

        String [] registros = clinetes.split("; ");

        System.out.println(registros.length +" registos");

        for (String string : registros) {
            System.out.println("Cliente... " + string);    
        }

        StringTokenizer parte = new StringTokenizer(clinetes, "; ");
        System.out.println(parte.countTokens());
        while(parte.hasMoreTokens()){
            System.out.println(parte.nextToken(";").trim());
        }
    }
}
