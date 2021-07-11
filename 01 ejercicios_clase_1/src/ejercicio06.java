/*
Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
que calcule el peso ideal.
○ peso ideal mujeres = altura - 120
○ peso ideal hombres = altura - 110
*/
import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) throws Exception {
        var sca = new Scanner(System.in);
        char genero;
        int peso = 0, altura = 0;

        System.out.println("Selecciona un genero:  [H: Hombres / M: Mujeres] ");
        genero = sca.next().toLowerCase().charAt(0);

        System.out.println("Digita tu altura: ");
        altura = sca.nextInt();
        sca.close();

        if (genero == 'h'){
            peso = altura - 110;
            System.out.println("Tu peso ideal es: " + peso);
        }else if (genero == 'm'){
            peso = altura - 120;
            System.out.println("Tu peso ideal es: " + peso);
        }else{
            System.out.println("Digita un genero valido");
        }
    }
}
