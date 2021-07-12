/*
Programa que muestre en líneas separadas lo siguiente:
ZYWXVUTSRQPONMLKJIHGFEDCBA
YWXVUTSRQPONMLKJIHGFEDCBA
WXVUTSRQPONMLKJIHGFEDCBA
....
DCBA
CBA
BA
A
*/

public class ejercicio16 {
    public static void main(String[] args) throws Exception {
        final String ABC = "ZYWXVUTSRQPONMLKJIHGFEDCBA";
        
        for (int i = 0; i < ABC.length(); i++) {
            System.out.println(ABC.substring(i));
        }
    }
}