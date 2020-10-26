package U2.T6;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca primer numero: ");
        byte numero1 = teclado.nextByte();
        System.out.print("Introduzca segundo numero: ");
        byte numero2 = teclado.nextByte();
        if (numero1>numero2) {
            System.out.println(numero2 + " es el numero menor");
        }
        else {
            System.out.println(numero1 + " es el numero menor");
        }

    }
}
