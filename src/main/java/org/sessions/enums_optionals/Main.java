package org.sessions.enums_optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Enum
        Weekdays day = Weekdays.SATURDAY;
        System.out.println(day);

        if (day.getValue().equals("Weekend")) {
            System.out.println("Yeah Weekend");
        }

        System.out.println("-".repeat(40));

        // Optional - Wert könnte auch null sein
        Optional<Cat> databaseCatOrNot = getCatByName("Felix");
        Cat cat = databaseCatOrNot.orElse(new Cat("UNKNOWN", 0));
        System.out.println(cat.age());
    }

    public static Optional<Cat> getCatByName (String name) {
        Cat temp = new Cat(name, 3);
        return Optional.ofNullable(null);
    }
}
