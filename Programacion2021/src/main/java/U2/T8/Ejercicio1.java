package U2.T8;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 1;
        while (numero != 0) {
            System.out.print("Introduce un numero: ");
            numero = teclado.nextInt();
            int numero2 = (int) Math.pow(numero,2);
            if (numero%2==0){
                System.out.print("Es par, ");
            } else {
                System.out.print("Es impar, ");
            }
            if (numero>=0){
                System.out.print("es positivo ");
            } else {
                System.out.print("es negativo ");
            }
            System.out.println("y el numero al cuadrado es: " + numero2);
        }
        System.out.println("Terminado");
    }
}
