package U2.T5;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca primer numero: ");
        int numero1 = teclado.nextInt();
        System.out.print("Introduzca segundo numero: ");
        int numero2 = teclado.nextInt();
        if ((numero1%2==0) && (numero2%2==0)) {
            System.out.println("Ambos son pares.");
        }
        if ((numero1%2!=0) && (numero2%2!=0)){
            System.out.println("Ambos son impares");
        }
        if (((numero1%2==0) && (numero2%2!=0)) || ((numero1%2!=0) && (numero2%2==0))) {
            System.out.println("Uno es par y otro impar.");
        }
    }
}
