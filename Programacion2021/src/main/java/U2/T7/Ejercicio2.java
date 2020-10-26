package U2.T7;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean jasp;
        System.out.print("Introduzca edad: ");
            int edad = teclado.nextInt();
        System.out.print("Introduzca nivel de estudios: ");
            int nivelDeEstudios = teclado.nextInt();
        System.out.print("Introduzca ingresos: ");
            int ingresos = teclado.nextInt();
        jasp = ((edad<=28) && (nivelDeEstudios>3) && (ingresos>28000));
        System.out.println(" ");
        System.out.println("El resultado es: " + " " + jasp);
    }
}
