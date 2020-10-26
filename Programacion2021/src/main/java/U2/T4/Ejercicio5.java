package U2.T4;

import java.time.LocalDateTime;

public class Ejercicio5 {
    public static void main(String[] args) {
        LocalDateTime horaLocal = LocalDateTime.now();
        int horas = horaLocal.getHour();
        int minutos = horaLocal.getMinute();
        int segundos = horaLocal.getSecond();
        System.out.println("La hora actual es: "+ horas + ":" +minutos+ ":" +segundos);
    }
}
