package U2.T6;

import java.util.Scanner;

public class Ejercicio4_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca primer numero: ");
        byte numero1 = teclado.nextByte();
        System.out.print("Introduzca segundo numero: ");
        byte numero2 = teclado.nextByte();
        byte mayor;
        mayor = numero1 > numero2 ? numero2 : numero1;
        System.out.println(mayor + " " + "es el numero menor.");
    }
}
