package U2.T5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el numero 12: ");
        int numero = teclado.nextInt();
        if (numero==12) {
            System.out.print("Has introducido el numero correctamente");
        } else {
            System.out.println("Has fallado en la introduccion del numero");
        }
    }
}
