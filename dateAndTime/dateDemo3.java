package dateAndTime;

import java.time.*;

public class dateDemo3 {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        OffsetDateTime dt = OffsetDateTime.now();
        System.out.println(dt);

        MonthDay md = MonthDay.now();
        System.out.println(md);

        Period p = Period.of(2,2,15);
        System.out.println(p.addTo(LocalDate.now()));

        Instant i = Instant.now();
        System.out.println(i);
    }
}
