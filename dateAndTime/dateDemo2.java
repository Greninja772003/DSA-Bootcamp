package dateAndTime;

import java.time.*;

public class dateDemo2 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2003, Month.JULY,7);
        System.out.println(ld.plusYears(21));

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ltd = LocalDateTime.now();
        System.out.println(ltd );
    }
}

