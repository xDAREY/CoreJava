package Localization;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class LocalExample {
    public static void main(String[] args) {

        long Money = 50000000;
        NumberFormat numberFormat = NumberFormat.
                getCurrencyInstance(new Locale("de","DE"));
        System.out.println(numberFormat.format(Money));

        NumberFormat numberFormatLocal = NumberFormat.
                getCurrencyInstance(Locale.CANADA);
        System.out.println(numberFormatLocal.format(Money));

        DateFormat dateFormat = DateFormat.getDateInstance
                (DateFormat.LONG, Locale.GERMANY);
        System.out.println(dateFormat.format(new Date()));

        DateFormat dateFormat1 = DateFormat.getTimeInstance
                (DateFormat.LONG, Locale.GERMANY);
        System.out.println(dateFormat1.format(new Date()));


        NumberFormat numberFormat2 = NumberFormat.
                getCurrencyInstance(Locale.CHINA);
        System.out.println(numberFormat2.getCurrency());

        NumberFormat numberFormat3 = NumberFormat.
                getCurrencyInstance(Locale.CHINA);
        System.out.println(numberFormat3.getCurrency().getDisplayName());


        System.out.println(Money + " is type of " + ((Object)Money).getClass().getSimpleName());
    }
}
