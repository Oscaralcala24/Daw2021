package U2.T3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca año de nacimiento: ");
        short fechadeNacimiento = teclado.nextShort();
        System.out.print("Introduzca año actual: ");
        short fechaActual = teclado.nextShort();
        System.out.print("El resultado es: ");
        System.out.println(fechaActual-fechadeNacimiento);
    }
}
