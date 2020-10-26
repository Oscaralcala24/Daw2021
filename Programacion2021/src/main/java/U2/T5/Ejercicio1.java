package U2.T5;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = teclado.nextInt();
        if (numero > 0) {
            System.out.println("El numero es mayor que 0.");
        }
        else {
            System.out.println("El numero es menor que 0");
        }
        }
    }


