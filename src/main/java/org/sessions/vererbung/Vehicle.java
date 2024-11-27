package org.sessions.vererbung;

import java.util.Objects;

public class Vehicle {
    private String brand;
    private String model;
    private int horsePower;

    public Vehicle(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return horsePower == vehicle.horsePower && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, horsePower);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
