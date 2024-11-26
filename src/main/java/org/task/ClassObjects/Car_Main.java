package org.task.ClassObjects;

public class Car_Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", "GLB", "schwarz", 2022);
        Car car2 = new Car("Audi", "A4", "schwarz", 2020);

        car1.start();
        car1.accelerate(50);

        car2.start();
        car2.accelerate(100);
    }
}
