package dateAndTime;

import java.time.LocalDate;
import java.util.*;

public class dateDemo {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        System.out.println(Long.MAX_VALUE);
        Date d = new Date();
        System.out.println(d.getMonth() );

        GregorianCalendar calder = new GregorianCalendar();
        System.out.println(calder.isLeapYear(2024));
        System.out.println(calder.get(Calendar.DAY_OF_YEAR));
        System.out.println(calder);
        calder.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        TimeZone tz = calder.getTimeZone();
        System.out.println(tz.getDisplayName());

    }
}
