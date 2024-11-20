package org.sessions;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] numbers2 = new int[5];
        numbers2[0] = 6;
        numbers2[1] = 7;
        numbers2[2] = 8;
        numbers2[3] = 9;
        numbers2[4] = 10;

        // für große Arrays zu aufwendig
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);


        for(int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        // for each Schleife, kann nicht beeinflusst werden
        for(int number : numbers) {
            System.out.println(number);
        }
    }
}
