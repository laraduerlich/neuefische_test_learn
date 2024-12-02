package org.task.record;

import java.util.List;

public record Zoo(List<Animal> animals) {

    public void printAllAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public int foodPerDay () {
        int countFood = 0;
        for (Animal animal : animals) {
            countFood += animal.species().foodPerDay();
        }
        return countFood;
    }
}
