package org.task;

public class task_JUnitTest {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int sum = summe(5,5);
        System.out.println(sum);
    }
    public static int summe(int a, int b){
        return a+b;
    }
    public static boolean isEven (int a){
        return a%2 == 0;
    }
    public static int product (int a, int b){
        return a*b;
    }
    public static String upperCase (String s){
        return s.toUpperCase();
    }
    public static boolean numberPositive (int a){
        return a > 0;
    }
}

