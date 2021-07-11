/*
Escribe un programa Java que lee un número entero por teclado y obtiene y
muestra por pantalla el doble y el triple de ese número
*/
import java.util.Scanner;

public class ejercicio3 {
    
    public static void main(String[] args) throws Exception {
        var sca = new Scanner(System.in);

        System.out.println("Ingresa un número entero: ");
        var numero = sca.nextInt();

        var doble = duplicar(numero);
        System.out.println("El doble del número " + numero + " es " + doble);

        var triple = triplicar(numero);
        System.out.println("El triple del número " + numero + " es " + triple);
        sca.close();
    }

    public static int duplicar(int numero){
        var duplicado = 0;
        duplicado = numero + numero;
        return duplicado;
    }

    public static int triplicar(int numero){
        var triplicado = 0;
        triplicado = numero + numero + numero;
        return triplicado;
    }
}
