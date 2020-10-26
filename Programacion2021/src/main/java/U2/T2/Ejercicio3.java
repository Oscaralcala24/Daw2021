package U2.T2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca primer numero: ");
        int numero1 = teclado.nextInt();
        System.out.print("Introduzca segundo numero: ");
        int numero2 = teclado.nextInt();

        System.out.print("El resultado es: ");
        System.out.println(numero1+numero2);

    }
}
