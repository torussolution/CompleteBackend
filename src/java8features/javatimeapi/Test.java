package java8features.javatimeapi;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Locale;

public class Test {

    public static void main(String[] args) {

        /*
        * not thread safe --->
         * less functions
         * Local
         * Zoned
         *
         * */


//        LocalDate localDate = LocalDate.now();
//        LocalTime localTime = LocalTime.now();
//        System.out.println(localDate+" "+localTime);



        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.now();

        //System.out.println(localDateTime2);
        localDateTime2 = localDateTime2.plusMonths(2);
       // System.out.println(localDateTime2);

       // System.out.println(localDateTime2.isAfter(localDateTime));
       // System.out.println(localDateTime.isBefore(localDateTime2));

        if(localDateTime.isAfter(localDateTime2))
        {
            System.out.println("New year.. New day... New month");
        }
        else
        {
            System.out.println("previous year.. previous day... previous month");
        }


//        System.out.println(localDateTime);
//
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-yy-dd", Locale.FRANCE);
//        System.out.println(localDateTime.format(dateTimeFormatter));
//
//        //12/dec/2022===> format
//
//        System.out.println(localDateTime.isAfter())
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        ZoneId zoneId = ZoneId.of("Asia/Singapore");

        ZonedDateTime singaporeTime = zonedDateTime.withZoneSameInstant(zoneId);

        System.out.println("Singapore : "+singaporeTime);

        System.out.println("India : "+zonedDateTime);
    }
}
