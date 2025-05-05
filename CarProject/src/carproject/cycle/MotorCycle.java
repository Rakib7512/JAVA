
package carproject.cycle;

import carproject.vehicle.Vehicle;


public class MotorCycle extends Vehicle{
    String engineCapacity;

    public MotorCycle() {
    }

    public MotorCycle(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public MotorCycle(String engineCapacity, String brand, double speed) {
        super(brand, speed);
        this.engineCapacity = engineCapacity;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void getSpeedBrand() {
        super.getSpeedBrand(); 
        System.out.println("Engine Capasity: "+engineCapacity);
    }
    
            
    
    
}
