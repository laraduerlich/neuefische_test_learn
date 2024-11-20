package org.task;

public class task_IfElse {
    public static void main(String[] args) {
        double result = add(3.5, 5.6);
        System.out.println(result);

        int result4 = add(3,5);
        System.out.println(result4);

        int result2 = subtract(3, 5);
        System.out.println(result2);

        int result3 = makePositive(8);
        System.out.println(result3);
    }
//overloading: 2 Methoden mit unterschiedlichen Variablen schreiben
    public static double add (double a, double b) {
        return a + b;
    }
    public static int add (int a, int b) {
        return a + b;
    }

    public static int subtract (int a, int b) {
        return a - b;
    }
    public static int makePositive (int a) {
        if (a >= 0) {
            return a;
        } else {
            return -a;
        }
    }

}
