package org.sessions.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = List.of("apple", "pear", "banana", "pineapple", "mango");

        System.out.println("Loop:");
        // dauert sehr lange und schlecht lesbar bei vielen Verschachtelungen
        for (String fruit : fruits) {
            if(fruit.contains("n")){
                if (fruit.length() >= 6){
                    System.out.println(fruit);
                }
            }
        }

        System.out.println("-".repeat(40));

        System.out.println("Stream:");
        // start = .stream()
        List<String> filteredFruits = fruits.stream()
        // beliebige Anzahl manipulierender Operationen
                // Übergabeparameter -> Returnwert
                .filter(fruit -> fruit.contains("n"))
                .filter(fruit -> fruit.length() >= 6)
        // Terminator -> beendet Stream
                //.forEach(System.out::println); // gleiche: fruit -> System.out.println(fruit)
                //.collect(Collectors.joining(", ")); // String wird ausgegben und an ", " getrennt
                .collect(Collectors.toList());

        System.out.println(filteredFruits);

        Stream.of("Anton", "Berta", "Cäsar")
                .peek(name -> System.out.println(name))
                .forEach(System.out::println);
    }
}
