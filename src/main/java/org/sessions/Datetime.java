package org.sessions;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Datetime {
    public static void main(String[] args) {

        //LocalDate = Nur Datum
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate =  " + localDate);

        //LocalDateTime = Datum & Uhrzeit
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime =  " + localDateTime);

        //ZonedDateTime = Datum & Uhrzeit & Zeitzone
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("ZonedDateTime =  " + zonedDateTime);

        //Instant = Zulu Zeitpunkt
        Instant instant = Instant.now();
        System.out.println("Instant = " + instant);

        //Instant in LocalDateTime umrechnen
        ZoneId zoneId = ZoneId.of("America/Argentina/Buenos_Aires");
        LocalDateTime convertedDateTime = instant.atZone(zoneId).toLocalDateTime();
        System.out.println("convertedDateTime = " + convertedDateTime);

        //LocalDateTime in Instant
        ZoneId zoneId2 = ZoneId.systemDefault();
        Instant convertedLocalDateTime = localDateTime.atZone(zoneId2).toInstant();
        System.out.println("convertedLocalDateTime = " + convertedLocalDateTime);

        //Format der Zeitangabe anpassen
        //E = Wochentag / d = Tag / M = Monat / y = Jahr / H = Stunde / m = Minute / s = Sekunde / n = nano
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd.MMMM yyyy : HH:mm:ss");
        System.out.println("formatter = " + formatter.format(localDateTime) + " Uhr");

        //String in LocalDateTime umwandeln
        String time = "12.08.2025 : 15:33:25";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy : HH:mm:ss");
        LocalDateTime convertedFromString = LocalDateTime.parse(time, formatter2);
        System.out.println("convertedFromString = " + convertedFromString);

        //Differenz zwischen zwei Zeitpunkten errechnen
        LocalDateTime start = LocalDateTime.of(2024, 12, 1, 9, 30);
        LocalDateTime end = LocalDateTime.of(2024, 12, 8, 9, 55);
        long hoursBetween = ChronoUnit.HOURS.between(start, end);
        System.out.println("hoursBetween = " + hoursBetween);
        long secondsBetween = ChronoUnit.SECONDS.between(start, end);
        System.out.println("secondsBetween = " + secondsBetween);
    }

}
