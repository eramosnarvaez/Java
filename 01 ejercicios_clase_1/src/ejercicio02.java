/*
Realizar un programa que realice el promedio de las notas de un alumno,
para ello el programa va a tener que solicitar el nombre del alumno y las
notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
“Reprobado” . Requisitos: Las notas que se ingresan pueden tener
decimales.
*/
import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) throws Exception {
        String nombre;
        double nota1, nota2, nota3, promedio;
        var sca = new Scanner(System.in);
        
        System.out.println("Digita el nombre: ");
        nombre = sca.nextLine();

        System.out.println("Digita la primer nota: [0.0 - 5.0] ");
        nota1 = sca.nextDouble();
        System.out.println("Digita la segunda nota: [0.0 - 5.0]");
        nota2 = sca.nextDouble();
        System.out.println("Digita la tercera nota: [0.0 - 5.0]");
        nota3 = sca.nextDouble();
        sca.close();

        promedio = Math.round(nota1 + nota2 + nota3)/3;

        if (promedio >= 3.0){
            System.out.println("El alumno " + nombre + " Aprobó con un promedio de " + promedio);
        }else{
            System.out.println("El alumno " + nombre + " Reprobó con un promedio de " + promedio);
        }
    }
}
