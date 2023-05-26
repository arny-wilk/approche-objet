package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 05, 19, 23, 59, 30);
        Date date1 = cal.getTime();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println(f.format(date1));

        Date today = new Date();

        SimpleDateFormat f2 = new SimpleDateFormat("EEEE dd MMMM YYYY HH:mm:ss", Locale.FRANCE);
        System.out.println(f2.format(today));

        SimpleDateFormat f2RU = new SimpleDateFormat("EEEE dd MMMM YYYY HH:mm:ss", new Locale("ru","RU") );
        System.out.println(f2RU.format(today));
        SimpleDateFormat f2CH = new SimpleDateFormat("EEEE dd MMMM YYYY HH:mm:ss", Locale.CHINA);
        System.out.println(f2CH.format(today));
        SimpleDateFormat f2GE = new SimpleDateFormat("EEEE dd MMMM YYYY HH:mm:ss", Locale.GERMAN);
        System.out.println(f2GE.format(today));


    }
}
