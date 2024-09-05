package JavaEight;

import java.time.*;

public class DataTimeAPIJavaEight {
    // two class have date package
    // java.util and java.sql
    //to format date we need to java.text package
    // old date time api was nto thread safe
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now(ZoneId.of("GMT"));
        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(localTime);

        // Machine readable time
        Instant instant = Instant.now();
        System.out.println(instant);

    }
}
