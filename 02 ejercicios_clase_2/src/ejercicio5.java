/*
Programa que lea la longitud de los catetos de un triángulo rectángulo y
calcule la longitud de la hipotenusa según el teorema de Pitágoras
*/
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) throws Exception {
        var sca = new Scanner(System.in);
        System.out.print("Longitud cateto X: ");
        var x = sca.nextFloat();
        System.out.print("Longitud cateto Y: ");
        var y = sca.nextFloat();
        sca.close();

        var h = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); // La hipotenusa de un triángulo rectángulo es igual 
        //a la raiz cuadrada de la suma del cuadrado de los catetos

        System.out.format("La hipotenusa es: %.2f", h);
    }
}