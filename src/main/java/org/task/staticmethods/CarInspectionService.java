package org.task.staticmethods;

public class CarInspectionService {

    public static boolean checkTires (Car car){
        if (car.getNumberOfTires() == 4){
            return true;
        }
        return false;
    }

    public static boolean checkAirbag(Car car) {
      return car.getAirbag();
    }

    public static boolean checkSeatbelt(Car car) {
        return car.isSeatBelt();
    }

    public static boolean checkDoors(Car car) {
        if (car.getNumberOfDoors() == 3){
            return true;
        } else if (car.getNumberOfDoors() == 5){
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkCar(Car car) {
        return checkTires(car) && checkAirbag(car) && checkSeatbelt(car) && checkDoors(car);
    }
}
