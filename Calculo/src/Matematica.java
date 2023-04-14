
public class Matematica {
  
    double soma(double x, double y){
        System.out.println("soma(double x, double y)");
        return x + y;
    }
    
    double soma(double ... numeros){
        System.out.println("soma(double ... numeros)");
        double total = 0;
        for(double n : numeros){
            total +=n;
        }
        return total;
    }

    double media(double x, double y){
        System.out.println("media(double x, double y)");
        return soma(x, y) / 2;
    }
    

    double media(double ... numeros){
        System.out.println("media(double ... numeros)");
        double total = 0;
        double media = 0;
        for(double n : numeros){
            total +=n;
            media = total / numeros.length;
        }
        return media;
    }

    int dividir(int x, int y){
        return x/y;
    }
}
