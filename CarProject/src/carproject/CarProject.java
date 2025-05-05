package carproject;

import carproject.cycle.MotorCycle;
import carproject.vehicle.Car;

public class CarProject {

    public static void main(String[] args) {
        Car c = new Car();
        c.setBrand("tata");
        c.setNumberOfDoors(4);
        c.setSpeed(125);

        MotorCycle mo = new MotorCycle("5000HR", "Suzuki", 350);
        System.out.println("(Details Of Motor Cycle)");
        mo.getSpeedBrand();
        
        
        
        System.out.println("------------------");
        System.out.println("(Details Of Car)");
        c.getSpeedBrand();
    }

}
