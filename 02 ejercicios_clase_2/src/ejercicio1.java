/*
Programa que pida por teclado la fecha de nacimiento de una persona
(día, mes, año) y calcule su número de la
El número de la suerte se calcula sumando el día, mes y año de la fecha
de nacimiento y a continuación sumando las cifras obtenidas en la suma.
Por ejemplo:
Si la fecha de nacimiento es 12/07/1980
Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 =
28
Número de la suerte: 28
*/
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        System.out.print("Digita tu fecha de nacimiento en formato DD/MM/AAAA: ");
        var fecha = sc.nextLine();
        sc.close();
        
        var numeroSuerte = CalcularNumeroSuerte(fecha);
        System.out.print("Tu número de la suerte es el: " + numeroSuerte);
    }

    private static int CalcularNumeroSuerte(String fecha) {
        int dia = Integer.parseInt(fecha.substring(0,2));
        int mes = Integer.parseInt(fecha.substring(3,5));
        int anio = Integer.parseInt(fecha.substring(6,10));
        int suma = dia + mes + anio; 
        int resultado = 0;

        while (suma != 0) {
            resultado += suma%10;
            suma /= 10;
        }
        return resultado;
    }
}