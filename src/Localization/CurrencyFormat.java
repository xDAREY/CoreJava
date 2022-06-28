package Localization;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormat {
    public static void main(String[] args) {

        double num = 1323.526;

        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        System.out.println("US: " + defaultFormat.format(num));

        Locale swedish = new Locale("en", "NG");
        NumberFormat swedishFormat = NumberFormat.getCurrencyInstance(swedish);
        System.out.println("Naira: " + swedishFormat.format(num));

    }
}
