package org.task.class_objects;

public class task_Car {
    String brand;
    String model;
    String color;
    int year;
    int speed = 0;

    public task_Car(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public void start (){
        System.out.println("Start of the car");
        System.out.println("The Speed is " + speed + " km/h");
    }
    public void accelerate(int add){
        int change = add + this.speed;
        System.out.println("The Speed is now " + change + "km/h");
    }

}
