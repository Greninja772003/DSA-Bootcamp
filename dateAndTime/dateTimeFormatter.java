package dateAndTime;

import java.time.LocalDate;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class dateTimeFormatter {
    public static void main(String[] args) {
        ZonedDateTime ldt = ZonedDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" hh:mm:ss dd/MM/yyyy z");
        System.out.println(dtf.format(ldt));

        System.out.println(ldt.get(ChronoField.HOUR_OF_DAY));
    }
}
