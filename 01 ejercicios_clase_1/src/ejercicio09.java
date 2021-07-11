/*
Pide por teclado el nombre, edad y salario y muestra el salario
○ Si es menor de 16 no tiene edad para trabajar
○ Entre 19 y 50 años el salario es un 5 por ciento más
○ Entre 51 y 60 años el salario es un 10 por ciento más
○ Si es mayor de 60 el salario es un 15 por ciento más
*/
import java.util.Scanner;

public class ejercicio09 {
    public static void main(String[] args) throws Exception {
        var sca = new Scanner(System.in);
        Double salario, salarioFinal;
        var edad = 0;
        var nombre = "";

        System.out.println("Digita el nombre: ");
        nombre = sca.nextLine();
        System.out.println("Digita la edad: ");
        edad = sca.nextInt();
        System.out.println("Digita el salario: ");
        salario = sca.nextDouble();
        sca.close();

        if (edad > 0 && edad < 16){
            System.out.println("No tiene edad para trabajar");
        }else if (edad >= 16 && edad < 19){
            System.out.println("El salario para " + nombre + "es $" + salario);
        }else if (edad >= 19 && edad <= 50){
            salarioFinal = salario + (salario*0.05);
            System.out.println("El salario para " + nombre + "es $" + salarioFinal);
        }else if (edad >= 51 && edad <= 60){
            salarioFinal = salario + (salario*0.1);
            System.out.println("El salario para " + nombre + "es $" + salarioFinal);
        }else if (edad >= 61 && edad <= 120){
            salarioFinal = salario + (salario*0.15);
            System.out.println("El salario para " + nombre + "es $" + salarioFinal);
        }else{
            System.out.println("Digite un numero de edad valido");
        }
    }
}
