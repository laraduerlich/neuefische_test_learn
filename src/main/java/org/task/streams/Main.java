package org.task.streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List <Integer> numbers = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);

        // Step 1: Filter für gerade Zahlen
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList(); // .collect(Collectors.toList());
        System.out.println("Gerade Zahlen: " + evenNumbers);

        // Step 2: Verdoppeln von jeder Zahl
        List<Integer> doubleNumbers = numbers.stream()
                .map(number -> number * 2)
                .toList();
        System.out.println("Verdoppelte Zahlen: " + doubleNumbers);

        // Step 3: Sortieren in aufsteigender Reihenfolge
        List<Integer> ascendingOrder = numbers.stream()
                .sorted()
                .toList();
        System.out.println("Zahlen in aufsteigender Reihenfolge: " + ascendingOrder);

        // Step 4: Summe aller Zahlen zusammen
        int sum = numbers.stream()
                .reduce(0, (Integer::sum)); // (number,b) -> number +b)
        System.out.println("Summe aller Zahlen: " + sum);

        // Step 5: alle verarbeiteten Nummern werden ausgegeben:
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .sorted()
                .forEach(System.out::println);

        // Step 6: Liste aller verarbeiten Zahlen
        List<Integer> collect = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .sorted()
                .toList();
        System.out.println("Alle verarbeiteten Zahlen: " + collect);
    }
}
