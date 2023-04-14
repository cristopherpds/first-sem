import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o primeiro numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o outro numero"));
        

        JOptionPane.showConfirmDialog(null, "Soma: " + (num1+num2), "Resultado", JOptionPane.YES_NO_OPTION); 
        int res = num1+num2;

        if (res ==JOptionPane.YES_NO_OPTION && res >=20){
                JOptionPane.showMessageDialog(null, "Resultado: "+ (num1+num2) + "Soma é alta", "Informacao", JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Resultado: "+ (num1+num2) + " Soma é baixa", "Informacao", JOptionPane.PLAIN_MESSAGE);
            }

        // String time = JOptionPane.showInputDialog(null," Quem vai ser campero gaucho 2023?");
        // int res =JOptionPane.showConfirmDialog(null, time, "Resultado", JOptionPane.YES_NO_OPTION);

        //     if (res == JOptionPane.YES_NO_OPTION){
        //         JOptionPane.showMessageDialog(null, time + "Campeao do Gauchao 20023", "Gauchao 2023", JOptionPane.PLAIN_MESSAGE);
        //     }else{
        //         JOptionPane.showMessageDialog(null, time + " vai ser igual mesmo Campeao do Gauchao 20023", "Gauchao 2023", JOptionPane.PLAIN_MESSAGE);
        //     }
    }
}
