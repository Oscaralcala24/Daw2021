package U2.T2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca grados centigrados: ");
        int numeroGradosCentigrados = teclado.nextInt();
        System.out.print("El resultado en grados Fahrenheit es: ");
        System.out.println(9*numeroGradosCentigrados/5+32);
    }
}
