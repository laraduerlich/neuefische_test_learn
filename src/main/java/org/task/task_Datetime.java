package org.task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class task_Datetime {
    public static void main(String[] args) {
        // Step 1: Write code to output the current date and time.
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current date & time: " + localDateTime);

        // Step 2: Add a timespan of 2 weeks to the current date and output the new date.
        LocalDateTime inTwoWeeks = localDateTime.plusDays(14);
        System.out.println("In 2 weeks: " + inTwoWeeks);

        // Step 3: Compare the current date with a specified future date and output whether the
        // current date is before or after the specified date.
        LocalDateTime futureDate = LocalDateTime.of(2025, 3,1, 10,0);
        System.out.println("Current date is after future date: " + localDateTime.isAfter(futureDate));
        System.out.println("Current date is before future date: " + localDateTime.isBefore(futureDate));


        // Step 4: Calculate the difference in days between two arbitrary dates and output the result.
        LocalDateTime date1 = LocalDateTime.of(2025, 5, 1, 10, 0);
        LocalDateTime date2 = LocalDateTime.of(2026, 3, 1, 10, 0);
        long between = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Between days: " + between);

        // birthday
        LocalDateTime mybirthday = LocalDateTime.of(2025, 7, 3, 10, 0);
        birthdayCalculator(mybirthday);
    }

    public static void birthdayCalculator (LocalDateTime Birthday){
        LocalDateTime now = LocalDateTime.now();
        long between = ChronoUnit.DAYS.between(now, Birthday);
        System.out.println("Days until your birthday: " + between);
    }
}
