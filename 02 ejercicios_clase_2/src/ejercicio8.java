/*
Programa que lea dos números por teclado y muestre el
resultado de la división del primer número por el segundo Se
debe comprobar que el divisor no puede ser cero
*/
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);        
        System.out.print("Digita el numerador: ");
        var numerador = sc.nextFloat();
        System.out.print("Digita el denominador: ");
        var denominador = sc.nextFloat();
        if (denominador == 0) {
            System.out.print("Error el denominador no puede ser cero.");
        } else {
            System.out.format("%f / %f = %f", numerador, denominador, numerador / denominador);
        }
        sc.close();
    }
}