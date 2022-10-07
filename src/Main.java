import entidades.AlguelCarro;
import servicos.BrasilTaxas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.MINUTES;

public class Main {
    public static void main(String[] args) {
        LocalDateTime currentTime=LocalDateTime.of(2018, 06,25,14,40,00);
        LocalDateTime oldTime= LocalDateTime.of(2018, 06, 25,10,30,00);
      double d =  Duration.between(oldTime,currentTime).toMinutes();
      double f = d/60;

        System.out.println(Math.ceil(f));
    }
}