package U2.T7;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Introduzca primer numero (a) a intercambiar: ");
        int a = teclado.nextInt();
        System.out.print(" Introduzca segundo numero (b) a intercambiar: ");
        int b = teclado.nextInt();
        System.out.println(" ");
        System.out.println("Intercambiamos valores de los numeros");
        System.out.println(" ");
        System.out.println("a = " + b );
        System.out.println("b = " + a );
        }

    }

