/*
Programa que lea por teclado tres números enteros H, M, S
correspondientes a hora, minutos y segundos respectivamente, y
comprueba si la hora que indican es una hora válida
*/
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) throws Exception {
        final String ERROR = "La hora no es válida";
        final String VALIDA = "La hora es válida";

        var sc = new Scanner(System.in);        
        System.out.print("Digita la Hora: ");
        var h = sc.nextInt();
        System.out.print("Digita los Minutos: ");
        var m = sc.nextInt();
        System.out.print("Digita los Segundos: ");
        var s = sc.nextInt();
        sc.close();

        var esValido = false;
        esValido = ValidarHora(h, m, s);
        if (esValido) {
            System.out.format("%d:%d:%d - %s", h, m , s, VALIDA);
        } else {
            System.out.format("%d:%d:%d - %s", h, m , s, ERROR);
        }
    }

    private static boolean ValidarHora(int h, int m, int s) {
        final int MAX24 = 24;
        final int MAX60 = 60;
        return (h >= 0 && h < MAX24 && m >= 0 && m < MAX60 && s >= 0 && s < MAX60);
    }
}