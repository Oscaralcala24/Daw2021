package U2.T4;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] aSrgs) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca primer numero: ");
        double numero1 = teclado.nextDouble();
        int numeroEntero1 = (int) numero1;
        System.out.print("Introduzca segundo numero: ");
        double numero2 = teclado.nextDouble();
        int numeroEntero2 = (int) numero2;
        System.out.print("Introduzca tercer numero: ");
        double numero3 = teclado.nextDouble();
        int numeroEntero3 = (int) numero3;
        System.out.print("El resultado es: ");
        System.out.println((numeroEntero1+numeroEntero2+numeroEntero3)/3);


    }
}
