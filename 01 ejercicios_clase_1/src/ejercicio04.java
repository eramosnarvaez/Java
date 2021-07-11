/*
Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
tabla y mostrar los datos.
*/
import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) throws Exception {
        var sca = new Scanner(System.in);
        var numero = 0;

        System.out.println("Digita el numero que deseas: ");
        numero = sca.nextInt();
        sca.close();

        System.out.println("\nTabla del " + numero);
        System.out.println("================\n");

        for (int i = 0; i <= 10; i++) {
            System.out.format("%d x %d = %d\n",numero, i, numero * i);
        }
    }
}
