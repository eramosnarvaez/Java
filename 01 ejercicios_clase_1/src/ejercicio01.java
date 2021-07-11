/*
Realizar la suma, la resta, la división y la multiplicación de dos números
leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
y <número 2> es igual a <resultado> ”.
*/
import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) throws Exception {
        var sca = new Scanner(System.in);
        int numero1, numero2, suma, resta, division, multi;

        System.out.println("Ingresa el primero numero: ");
        numero1 = sca.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        numero2 = sca.nextInt();
        sca.close();
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        division = numero1 / numero2;
        multi = numero1 * numero2;
        
        System.out.println("La suma de " + numero1 + " + " + numero2 + " es " + suma);
        System.out.println("La resta de " + numero1 + " - " + numero2 + " es " + resta);
        System.out.println("La division de " + numero1 + " / " + numero2 + " es " + division);
        System.out.println("La multiplicacion de " + numero1 + " X " + numero2 + " es " + multi);
    }
}