/*
Programa que lea una variable entera mes y compruebe si el
valor corresponde a un mes de 30 días, de 31 o de 28
Supondremos que febrero tiene 28 días Se mostrará además el
nombre del mes Se debe comprobar que el valor introducido esté
comprendido entre 1 y 12
*/
import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);        
        var mes = 0;
        do {
            LimpiarPantalla();
            System.out.print("Digita un mes entre 1 y 12: ");
            mes = sc.nextInt();
        } while (mes <= 0 || mes > 12);
        sc.close();

        ValidarMes(mes);
    }

    private static void ValidarMes(int mes) {
        String[] nombres = new String[]{ "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }; 
        int[] dias = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.format("El mes %d es %s y tiene %d días", mes, nombres[mes-1], dias[mes-1]);
    }

    private static void LimpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}