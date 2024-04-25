package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
    LocalDateTime aniversario = LocalDateTime.of(1986, Month.DECEMBER, 14, 12, 0,0);
    LocalDateTime now = LocalDateTime.now();
        System.out.println("Tenho "+ ChronoUnit.DAYS.between(aniversario, now) + " Dias");
        System.out.println("Tenho "+ ChronoUnit.WEEKS.between(aniversario, now) + " Semanas");
        System.out.println("Tenho "+ ChronoUnit.MONTHS.between(aniversario, now) + " Meses");
        System.out.println("Tenho "+ ChronoUnit.YEARS.between(aniversario, now) + " Anos");

    }
}
