package U2.T3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero real: ");
        double numero1 = teclado.nextDouble();
        System.out.print("Introduzca un numero real: ");
        double numero2 = teclado.nextDouble();
        System.out.print("El resultado es: ");
        System.out.println(numero1+numero2);
    }
}
