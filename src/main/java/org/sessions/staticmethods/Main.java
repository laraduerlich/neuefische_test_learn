package org.sessions.staticmethods;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("bmw");
        Car car2 = new Car("ford");
        Car car3 = new Car("vw");

        System.out.println(car1.toString());
        System.out.println(Car.getCarCounter());
        System.out.println(Utility.PI);
        System.out.println(Car.calculateSum(2,4));
    }
}
