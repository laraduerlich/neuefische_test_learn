package org.sessions;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Java is cool!");;
        int a = 2;
        int b = 3;

        int sum = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b;

        System.out.println("Sum: " + sum);
        System.out.println("Sub: " + sub);
        System.out.println("Mult: " + mult);
        System.out.println("Div: " + div);

        boolean greaterthan = a > b;
        boolean lessthan = b < a;
        boolean equals = a == b;

        System.out.println("greaterthan: " + greaterthan);
        System.out.println("lessthan: " + lessthan);
        System.out.println("equals: " + equals);



    }
}