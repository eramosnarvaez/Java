/*
Realizar un programa que calcule el sueldo de un trabajador, el programa
solicita el número de horas que has trabajado en un mes, las horas se
pagan a $30.000.
*/
import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) throws Exception {
        var sca = new Scanner(System.in);
        var horas = 0;
        int sueldo = 0;
        int valorHora = 30000;
        
        System.out.println("Digita el numero de horas laboradas en el mes: ");
        horas = sca.nextInt();
        sca.close();
        sueldo = horas * valorHora;

        System.out.println("El sueldo mensual del trabajaor con " + horas + " horas laboradas es: " + sueldo);
    }
}
