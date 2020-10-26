package U2.T5;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double gravedad = 9.8;
        System.out.print("Introduzca tiempo: ");
        double tiempo = teclado.nextDouble();
        if (tiempo <= 0) {
            System.out.println("Tiempo incorrecto.");
        } else {
            System.out.println("La velocidad es: " + gravedad * tiempo);
        }
    }
}

