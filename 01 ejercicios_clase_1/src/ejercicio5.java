/*
Escribe un programa java que lea una variable de tipo entero y asígnale un valor
A continuación muestra un mensaje indicando si la variable es par o impar
Utiliza el operador condicional ( ?  :  ) para resolverlo
Ej "14 es par" o "15 es impar".
*/
import javax.swing.JOptionPane;

public class ejercicio5 {
    
    public static void main(String[] args) throws Exception {
        int entero = 0;
        String ParImpar;

        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entero: "));
        ParImpar = (entero % 2) == 0 ? "un número par" : "un número impar.";
        JOptionPane.showMessageDialog(null, entero + " es " + ParImpar);
    }
}
