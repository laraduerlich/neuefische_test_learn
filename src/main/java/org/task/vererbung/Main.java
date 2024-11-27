package org.task.vererbung;

public class Main {
    public static void main(String[] args) {
    Car car = new Car("BMW", "M3", 2024, 4);
    Vehicle bike = new Vehicle("Harley", "Schopper", 2024);

    System.out.println(car.toString());
    System.out.println(bike.toString());
    }
}
