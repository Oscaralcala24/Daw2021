package U2.T2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca numero de millas: ");
        int numeroMillas = teclado.nextInt();
        System.out.print("El resultado en metros es: ");
        System.out.println(numeroMillas*1609 );

    }
}
