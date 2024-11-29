package org.task.staticmethods;

import java.util.Objects;

public class Animal {
    private String name;
    static int totalCount = 0;
    int instanceCount = 0;

    public Animal(String name) {
        this.name = name;
    }

    public static int incrementTotalCount() {
        totalCount++;
        return totalCount;
    }
    public int incrementInstanceCount() {
        instanceCount++;
        return instanceCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public static void setTotalCount(int totalCount) {
        Animal.totalCount = totalCount;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return instanceCount == animal.instanceCount && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, instanceCount);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", instanceCount=" + instanceCount +  '\'' +
                ", totalCount=" + totalCount +  '\'' +
                '}';
    }
}
