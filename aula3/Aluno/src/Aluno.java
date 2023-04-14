import java.util.function.Function;

public class Aluno {
    String nome;
    double nota;


    void mostrarNota(){
        System.out.println("O aluno: " + nome + " tem a nota de: " + nota);
    }

    void aumentarNota(double valor){
        nota += valor;
    }

    void reducirNota(double valor){
        nota -= valor;
    }

    void multiplicarNota(double valor){
        nota *= valor;
    }

    
}
