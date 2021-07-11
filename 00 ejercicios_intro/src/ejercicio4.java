/*
Escribe un programa que lea una cantidad de grados centígrados y la pase a
grados Fahrenheit La fórmula es F=32+(9*C/5).
*/
import javax.swing.JOptionPane;

public class ejercicio4 {

    public static void main(String[] args) throws Exception {
        
        double centigrados;
        double Fahrenheit;

        centigrados = Double.parseDouble(JOptionPane.showInputDialog("Digite la temperatura en centigrados: "));
        Fahrenheit = 32 + ((9 * centigrados)/5);
        JOptionPane.showMessageDialog(null, "La temperatura en grados Fahrenheit es : " + Fahrenheit);   
    }
}
