package org.task.record;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Owner tim = new Owner("Tim", 35, "Teststraße 1");
        Owner phil = new Owner("Phil", 35, "Musterstraße 2");
        Owner max = new Owner("Max", 38, "Hallostr 3");

        Species tiger = new Species("Tiger", 3000);
        Species lion = new Species("Lion", 4000);
        Species wolf = new Species("Wolf", 1500);

        Animal tigger = new Animal(1,"Tigger", tiger, 3, tim);
        Animal simba = new Animal(2,"Simba", lion, 5, phil);
        Animal wolfy = new Animal(3,"Wolfy", wolf, 4, max);
        Animal scar = new Animal(4,"Scar", lion, 5, phil);

        System.out.println(tigger.toString());
        System.out.println(simba.equals(wolfy));

        Zoo zoo = new Zoo(List.of(simba, tigger, wolfy, scar));
        System.out.println("Im Zoo sind folgende Tiere:");
        zoo.printAllAnimals();
        System.out.println("Food per Day in Grams: " + zoo.foodPerDay());



    }
}
