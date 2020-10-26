package U2.T6;

import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int numero1 = teclado.nextInt();
        System.out.println(numero1 % 2 == 0 ? "Es par" : "Es impar");

    }
}
