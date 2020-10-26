package U2.T3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca numero de millas: ");
        float numeroMillas = teclado.nextFloat();
        System.out.print("El resultado en kilometros es: ");
        System.out.println(numeroMillas*1.609);

    }
}
