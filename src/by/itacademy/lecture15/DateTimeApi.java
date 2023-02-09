package by.itacademy.lecture15;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;

public class DateTimeApi {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.ofYearDay(2017, 256);
        System.out.println(localDate);

        Instant inst = Instant.now();
        System.out.println(inst);
        System.out.println(inst.toEpochMilli());

        //Duration duration = Duration.
    }
}
