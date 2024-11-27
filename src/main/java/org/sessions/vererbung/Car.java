package org.sessions.vererbung;

import java.util.Objects;

public class Car extends Vehicle {
    private int amountOfTires;

    public Car(String brand, String model, int horsePower, int amountOfTires) {
        super(brand, model, horsePower); // Muss immer als erstes erfolgen
        this.amountOfTires = amountOfTires;
    }

    public int getAmountOfTires() {
        return amountOfTires;
    }

    public void setAmountOfTires(int amountOfTires) {
        this.amountOfTires = amountOfTires;
    }

    @Override
    public String getBrand() {
        return "Car brand = " + super.getBrand();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return amountOfTires == car.amountOfTires;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amountOfTires);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + this.getBrand() + '\'' +
                "model='" + this.getModel() + '\'' +
                "horsePower='" + this.getHorsePower() + '\'' +
                "amountOfTires=" + amountOfTires +
                "}";
    }
}