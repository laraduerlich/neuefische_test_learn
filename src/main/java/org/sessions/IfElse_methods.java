package org.sessions;

public class IfElse_methods {
    public static void main(String[] args) {

        int age = 17;
        int age2 = 39;
        int age3 = 18;

        boolean result = ageCheck(age);
        System.out.println(result);
        boolean result2 = ageCheck(age2);
        System.out.println(result2);
        boolean result3 = ageCheck(age3);
        System.out.println(result3);
    }

    public static boolean ageCheck(int age) {
        if (age > 18) {
            System.out.println("Ja, die Person ist über 18");
            return true;
        } else if (age == 18) {
            System.out.println("Die Person ist genau 18");
            return true;
        } else {
            System.out.println("Nein, die Person ist nicht über 18");
            return false;
        }
    }

}
