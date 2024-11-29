package org.task.staticmethods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {
    @Test
    void checkTires_expectedTrue_when4tires() {
        // GIVEN
        Car car = new Car(4,4,true,true);
        // WHEN
        boolean checkTires = CarInspectionService.checkTires(car);
        // THEN
        Assertions.assertTrue(checkTires);
    }
    @Test
    void checkAirbag_expectedTrue_whenAirbag() {
        // GIVEN
        Car car = new Car(4,4,true,true);
        // WHEN
        boolean checkAirbag = CarInspectionService.checkAirbag(car);
        // THEN
        Assertions.assertTrue(checkAirbag);
    }
    @Test
    void checkSeatbelt_expectedTrue_whenSeatbelt() {
        // GIVEN
        Car car = new Car(4,4,true,true);
        // WHEN
        boolean checkSeatbelt = CarInspectionService.checkSeatbelt(car);
        // THEN
        Assertions.assertTrue(checkSeatbelt);
    }
    @Test
    void checkDoors_expectedTrue_when3Or5Doors() {
        // GIVEN
        Car car = new Car(4,5,true,true);
        // WHEN
        boolean checkDoors = CarInspectionService.checkDoors(car);
        // THEN
        Assertions.assertTrue(checkDoors);
    }
    @Test
    void checkCar_expectedTrue_whenAllTrue() {
        // GIVEN
        Car car = new Car(4,5,true,true);
        // WHEN
        boolean checkCar = CarInspectionService.checkCar(car);
        // THEN
        Assertions.assertTrue(checkCar);
    }

}