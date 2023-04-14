import java.util.InputMismatchException;
import java.util.Scanner;
public class MatematicaTeste {
    
    public static void main(String[] args) {
         Matematica func = new Matematica();
        // System.out.println(func.soma(5,5));
        // System.out.println(func.soma(5,5,5));
        // System.out.println(func.media(6,5));
        // System.out.println(func.media(5,5,10));
        
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("ingrese  o primeiro numero");
            int x = scan.nextInt();
            System.out.println("ingrese  outro numero");
            int y = scan.nextInt();
            scan.close();
            System.out.println(func.dividir(x,y));
        } catch (InputMismatchException erro1) {
            System.err.println("Erro entrada de dados invalidos!");
        }catch(ArithmeticException erro2){
            System.err.println("Erro de divisao por zero!");
        }finally{
            System.out.println("Divisao");
        }
    }
}
