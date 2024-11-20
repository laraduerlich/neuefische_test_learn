package org.aufgaben;

public class Aufgabe_Array {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // Aufgabe 1
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // Aufagbe 2
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Summe: " + sum);

        // Aufgabe 3
        int bigNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] > bigNumber) {
               bigNumber = numbers[i];
           }
       }
        System.out.println("Größte Zahl: " + bigNumber);

        // Aufgabe 4
        int[] numbers2 = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers2[i] = i + 11;
    }
        System.out.println("Array 2: ");
        for (int num : numbers2) {
            System.out.print(num + " ");
        }

        // Aufgabe 5
        int[] resultArray = new int[10];
        for (int i = 0; i < 10; i++) {
            resultArray[i] = numbers[i] + numbers2[i];
        }
        System.out.println();
        // Ausgabe result array
        System.out.println("Result Array (Element-wise addition): ");
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }

    }


