package U2.T3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca primer numero: ");
        byte numero1 = teclado.nextByte();
        System.out.print("Introduzca segundo numero: ");
        byte numero2 =teclado.nextByte();
        System.out.print("El resultado es: ");
        System.out.println(numero1+numero2);
    }
}
