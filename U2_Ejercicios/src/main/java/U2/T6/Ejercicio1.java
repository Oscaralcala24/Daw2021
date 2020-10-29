package U2.T6;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe un numero entre 1 y 12: ");
        int numero = teclado.nextInt();
        switch (numero) {
            case 1: System.out.println("El mes correspondiente es Enero"); break;
            case 2: System.out.println("El mes correspondiente es Febrero"); break;
            case 3: System.out.println("El mes correspondiente es Marzo"); break;
            case 4: System.out.println("El mes correspondiente es Abril"); break;
            case 5: System.out.println("El mes correspondiente es Mayo"); break;
            case 6: System.out.println("El mes correspondiente es Junio"); break;
            case 7: System.out.println("El mes correspondiente es Julio"); break;
            case 8: System.out.println("El mes correspondiente es Agosto"); break;
            case 9: System.out.println("El mes correspondiente es Septiembre"); break;
            case 10: System.out.println("El mes correspondiente es Octubre"); break;
            case 11: System.out.println("El mes correspondiente es Noviembre"); break;
            case 12: System.out.println("El mes correspondiente es Diciembre"); break;
            default: System.out.println("No le corresponde ningun mes"); break;
        }
    }
}
