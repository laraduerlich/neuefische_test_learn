package org.task.class_objects;

public class task_Car_Main {
    public static void main(String[] args) {
        task_Car car1 = new task_Car("Mercedes", "GLB", "schwarz", 2022);
        task_Car car2 = new task_Car("Audi", "A4", "schwarz", 2020);

        car1.start();
        car1.accelerate(50);

        car2.start();
        car2.accelerate(100);
    }
}
