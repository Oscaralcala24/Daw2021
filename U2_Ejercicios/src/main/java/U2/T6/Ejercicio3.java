package U2.T6;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int numero1 = teclado.nextInt();
        if (numero1%2==0){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }

    }
}
