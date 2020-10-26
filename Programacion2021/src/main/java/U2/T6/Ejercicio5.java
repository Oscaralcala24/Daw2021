package U2.T6;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el radio: ");
        double radio = teclado.nextDouble();
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Introduzca (1) para calcular diametro");
        System.out.println("Introduzca (2) para calcular perímetro.");
        System.out.println("Introduzca (3) para calcular área.");
        System.out.println(" ");
        System.out.print("¿Que desea calcular?: ");
        double opciones = teclado2.nextDouble();
        if (opciones==1) {
            System.out.println("El diametro del circulo es:" + " " + radio*2 );
        }
        if (opciones==2) {
            System.out.println("El perímetro del circulo es:" + " " + Math.PI*radio*2 );
        }
        if (opciones==3) {
            System.out.println("El área del circulo es:" + " " + radio * radio * 2);
        }
    }
}
