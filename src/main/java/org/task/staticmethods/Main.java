package org.task.staticmethods;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Tiger");
        Animal animal2 = new Animal("Dog");
        Animal animal3 = new Animal("Monkey");
        Animal animal4 = new Animal("Duck");

        Animal.incrementTotalCount();
        Animal.incrementTotalCount();
        animal3.incrementInstanceCount();

        System.out.println(animal.toString());
        System.out.println(animal2.toString());
        System.out.println(animal3.toString());

        System.out.println(Calculator.add(2,3));
        System.out.println(Calculator.subtract(2,3));
        System.out.println(Calculator.multiply(2,3));
        System.out.println(Calculator.divide(2,3));


        Car car1 = new Car(4,4,true,true);
    }
}
