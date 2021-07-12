/*
Programa que pase una velocidad en Km/h a m/s La velocidad se lee por
teclado
*/
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) throws Exception {
        var sca = new Scanner(System.in);
        
        System.out.println("Ingresa la velocida en km/h: ");
        var velocidadkmXh = sca.nextInt();
        sca.close();
        var velocidadmXs = (velocidadkmXh*1000)/3600; // Velocidad en m/s = (Velocidad (km/h) * 1000) / 3600

        System.out.println("La velocidad en m/s es " + velocidadmXs + "m/s");
    }
}