/*
Realizar un programa que permita controlar el juego de piedra, papel, tijera
introduciendo P para piedra, L para papel y T para tijera por cada jugador.
El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
de cada ronda preguntar si desea volver a jugar.
*/
import java.util.Scanner;

public class ejercicio08 {
    public static void main(String[] args) throws Exception {
        var sca = new Scanner(System.in);
        String jugador1, jugador2;
        char opcion, jugada1, jugada2;

        System.out.println("Digita el nombre de jugador 1: ");
        jugador1 = sca.nextLine();

        System.out.println("Digita el nombre de jugador 2: ");
        jugador2 = sca.nextLine();

        do{
            System.out.println(jugador1 + " elige una opcion: [P: Piedra, L: Papepl, T: Tijera]");
            jugada1 = sca.next().toLowerCase().charAt(0);

            System.out.println(jugador2 + " elige una opcion: [P: Piedra, L: Papepl, T: Tijera]");
            jugada2 = sca.next().toLowerCase().charAt(0);

            if ((jugada1 == 'p' && jugada2 == 't') | (jugada1 == 't' && jugada2 == 'l') | (jugada1 == 'l' && jugada2 == 'p')){
                System.out.println("El ganador es " + jugador1);
            }else if ((jugada2 == 'p' && jugada1 == 't') | (jugada2 == 't' && jugada1 == 'l') | (jugada2 == 'l' && jugada1 == 'p')){
                System.out.println("El ganador es " + jugador2);
            }else{
                System.out.println("Empate!!!");
            }
            System.out.print("\n¿Iniciar nueva partida? S/N: ");
            opcion = sca.next().toLowerCase().charAt(0);
        } while (opcion =='s');
        sca.close();
    }
}
