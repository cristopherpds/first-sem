
import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o seu peso"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira sua altura"));

        float IMC = peso / (altura * altura);
        System.out.println(IMC);

        if (IMC < 18.5) {
            JOptionPane.showMessageDialog(null, "Abaixo do peso", "Informacao", JOptionPane.INFORMATION_MESSAGE);
        }else if( IMC >= 18.6 && IMC <= 24.9) {
            JOptionPane.showMessageDialog(null, "Peso ideal parabens", "Informacao", JOptionPane.INFORMATION_MESSAGE);
        }else if(IMC >= 25.0 &&  IMC <= 29.9){
            JOptionPane.showMessageDialog(null, "Levemente acima do peso", "Informacao", JOptionPane.INFORMATION_MESSAGE); 
        }else if(IMC >= 30.0 &&  IMC <= 34.9){
            JOptionPane.showMessageDialog(null, "Obesidade grau I", "Informacao", JOptionPane.INFORMATION_MESSAGE);
        }else if(IMC >= 35.0 &&  IMC <= 39.9){
            JOptionPane.showMessageDialog(null, "Obesidade grau II", "Informacao", JOptionPane.INFORMATION_MESSAGE);
        }else if(IMC >= 40){
            JOptionPane.showMessageDialog(null, "Obesidade grau III", "Informacao", JOptionPane.INFORMATION_MESSAGE);
        }
      
    }
}
