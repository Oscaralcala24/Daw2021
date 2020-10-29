package U2.T7;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = (int) (Math.random() * 25 + 97);
        char letra_aleatoria = (char) numero;
        System.out.println("El numero es: " + numero + " y la letra correspondiente es: " + letra_aleatoria);
    }
}
