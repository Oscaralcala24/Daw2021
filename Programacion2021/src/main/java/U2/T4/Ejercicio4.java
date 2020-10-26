package U2.T4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca numero a redondear: ");
        double numero1 = teclado.nextDouble();
        System.out.println("El resultado es: " + Math.round(numero1));
    }
}
