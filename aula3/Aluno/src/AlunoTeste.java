public class AlunoTeste {
    public static void main(String[] args) {

        Aluno a = new Aluno();
        a.nome = "Joao";
        a.nota = 8.5;

        a.mostrarNota();

        a.aumentarNota(1.5);

        a.mostrarNota();

        a.reducirNota(2);

        a.mostrarNota();

        a.multiplicarNota(1.5);
        
        a.mostrarNota();
    }
}
