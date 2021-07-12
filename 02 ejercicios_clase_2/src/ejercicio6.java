/*
Programa que lea un número entero y muestre si el número es
múltiplo de 10
*/
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);        
        System.out.print("Digita un número: ");
        var x = sc.nextInt();
        sc.close();

        if (x % 10 == 0) {
            System.out.print(x + " => es múltiplo de 10");    
        } else {
            System.out.print(x + " => no es múltiplo de 10");    
        }
    }
}