package org.task.vererbung;

import java.util.Objects;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String manufacturer, String model, int year, int numberOfDoors) {
        super(manufacturer, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return numberOfDoors == car.numberOfDoors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfDoors);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + getManufacturer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() + '\'' +
                "numberOfDoors=" + numberOfDoors +
                '}';
    }
}
