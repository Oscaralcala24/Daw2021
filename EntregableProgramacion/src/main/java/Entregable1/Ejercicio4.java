package Entregable1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero positivo: ");
        int numeroPedido = teclado.nextInt();
        int numeroPedido1 = numeroPedido + 1;
        int numeroPedido2 = numeroPedido1 + 1;
        int numeroPedido3 = numeroPedido2 + 1;
        int numeroPedido4 = numeroPedido3 + 1;
        int numeroPedido5 = numeroPedido4 + 1;
        String par;
        String par1;
        String par2;
        String par3;
        String par4;
        String par5;

        if (numeroPedido >= 0) {
            par = numeroPedido % 2 == 0 ? "es par" : "es impar";
            par1 = numeroPedido1 % 2 == 0 ? "es par" : "es impar";
            par2 = numeroPedido2 % 2 == 0 ? "es par" : "es impar";
            par3 = numeroPedido3 % 2 == 0 ? "es par" : "es impar";
            par4 = numeroPedido4 % 2 == 0 ? "es par" : "es impar";
            par5 = numeroPedido5 % 2 == 0 ? "es par" : "es impar";

            System.out.println(numeroPedido + " " + par);
            System.out.println(numeroPedido + 1 + " " + par1);
            System.out.println(numeroPedido + 2 + " " + par2);
            System.out.println(numeroPedido + 3 + " " + par3);
            System.out.println(numeroPedido + 4 + " " + par4);
            System.out.println(numeroPedido + 5 + " " + par5);
        } else {
            System.out.println("El numero introducido es negativo.");
        }
    }

}

