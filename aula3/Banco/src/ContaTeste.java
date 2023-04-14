public class ContaTeste {
    public static void main(String[] args) {
        Conta c =new Conta();
        c.cliente = "Jose";
        c.saldo = 10_000.00;

        c.exibirSaldo();
        
        //c.depositar(3000);
        c.exibirSaldo();


        Conta s = new Conta();
        s.cliente = "Maria";
        s.exibirSaldo();

        c.transferirPara(s, 5800);
        s.exibirSaldo();
    }
}
