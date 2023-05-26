package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDates {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today);
        SimpleDateFormat d = new SimpleDateFormat("dd/MM/YYYY");
        String format = d.format(today);
        System.out.println(format);

        Calendar cal = Calendar.getInstance();
        cal.set(2016, 5, 19, 23, 59, 30);

        Date newDate = cal.getTime();

        SimpleDateFormat d2 = new SimpleDateFormat("YYY/MM/dd HH:mm:ss");
        String format2 = d2.format(newDate);
        System.out.println(format2);


        SimpleDateFormat d3 = new SimpleDateFormat("YYY/MM/dd HH:mm:ss", new Locale("fr", "FR"));
        System.out.println(d3.format(today));


        // Exemple de format
        ZonedDateTime zonedDateTime = today.toInstant().atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime);

        String format1 = zonedDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(format1);


    }
}
