/*
Pedir un número, comprobar si es primo y preguntar si quiere introducir más
(S/N) y volver a pensar.
*/
import java.util.Scanner;

public class ejercicio07 {
    public static void main(String[] args) throws Exception {
        var sca = new Scanner(System.in);
        int numero = 0;
        char opcion;

        do{
            System.out.print("Digita un número: ");
            numero = sca.nextInt();
            var contador = 0;
            
            for (int i = 1; i < numero; i++){
                if ((numero % i) == 0){
                    contador = contador + 1;
                }
            }
            if(contador <= 2){
                System.out.println("El numero es primo");
            }else{
                System.out.println("El numero no es primo");
            }
            System.out.print("\n¿Ingresar otro valor? S/N: ");
            opcion = sca.next().toLowerCase().charAt(0);
        } while (opcion =='s');
        sca.close();
    }
}
