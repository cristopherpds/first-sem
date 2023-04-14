public class Conta {
    String cliente;
    double saldo;


    int maior(int um, int dois){
        if(um > dois){
            return um;
        }else{
            return dois;
        }
    }

     void exibirSaldo() {
        System.out.println(cliente + " tem o saldo de: " + saldo +" reais.");    
    }

    void sacar(double valor){
        saldo -= valor;
    }

    void depositar(double valor){
        saldo += valor;
    }

    void transferirPara(Conta destino, double valor){
        
        this.sacar(valor);
        destino.depositar(valor);

    }

}
