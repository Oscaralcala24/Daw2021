package U2.T5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca primer numero: ");
            long numero1 = teclado.nextLong();
        System.out.print("Introduzca segundo numero: ");
            long numero2 = teclado.nextLong();
        System.out.print("Introduzca tercer numero: ");
            long numero3 = teclado.nextLong();
        if ((numero1>numero2) && (numero1>numero3)) {
            System.out.println("El numero mas grande es: " + numero1);
        }
        if ((numero2>numero1) && (numero2>numero3)) {
            System.out.println("El numero mas grande es: " + numero2);
        }
        if ((numero3>numero2) && (numero3>numero1)) {
            System.out.println("El numero mas grande es: " + numero3);
        }
        }

    }

