package org.sessions.vererbung;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "M3", 200, 4);
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "1", 389);

        System.out.println(car.getBrand());
        System.out.println(motorcycle);
    }
}
