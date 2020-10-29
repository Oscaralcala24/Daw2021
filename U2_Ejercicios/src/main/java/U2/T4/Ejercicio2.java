package U2.T4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca primer numero: ");
        double numero1 = teclado.nextDouble();
        System.out.print("Introduzca segundo numero: ");
        double numero2 = teclado.nextDouble();
        System.out.print("El resultado es: ");
        System.out.println((numero1 + numero2) / 2);
    }
}
