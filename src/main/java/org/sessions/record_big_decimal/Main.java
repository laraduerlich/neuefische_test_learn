package org.sessions.record_big_decimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BookRecord bookRecord = new BookRecord("1", "Test", 13.99);
        bookRecord.ISBN(); // Getter beim Record OHNE get
        bookRecord.title();

        // Setter beim Record NICHT vorhanden! - Daten müssen überschrieben werden
        System.out.println(bookRecord);
        bookRecord = bookRecord.withPrice(8.99).withTitle("Test2"); // Verkettung möglich
        System.out.println(bookRecord);

        System.out.println("-".repeat(40));
        double a = 0.1;
        double b = 0.2;
        System.out.println("a+b: " + a+b);
        System.out.println(a+b);

        BigDecimal c = new BigDecimal("0.1");
        BigDecimal d = new BigDecimal("0.2");
        System.out.println("c+d: " + c.add(d));
        System.out.println(c.subtract(d));
        System.out.println(c.multiply(d));
        System.out.println(c.divide(d, RoundingMode.HALF_UP));

        BigDecimal e = new BigDecimal("2.4");
        BigDecimal rounded = e.setScale(0, BigDecimal.ROUND_HALF_UP);
        System.out.println("Rounded: " + rounded);

        /**
         * BigDecimal.ROUND_UP = IMMER aufrunden!
         * BigDecimal.ROUND_DOWN = IMMER abrunden!
         * BigDecimal.ROUND_HALF_UP = Kfm. runden = ab x.5 = aufrunden!
         * BigDecimal.ROUND_HALF_DOWN = Kfm. runden = ab x.6 = aufrunden!
         *
         * BigDecimal.ROUND_CEILING = Positive Num = ROUND_UP | Negative Num = ROUND_DOWN
         * BigDecimal.ROUND_CEILING = Positive Num = ROUND_DOWN | Negative Num = ROUND_UP
         * BigDecimal.ROUND_HALF_EVEN = Jede Zahl bis x.4 = ROUND_DOWN |
         * x.5 oder höher = nächste num = gerade (2, 4, 6) = ROUND_UP sonst ROUND_DOWN
         */

    }
}
