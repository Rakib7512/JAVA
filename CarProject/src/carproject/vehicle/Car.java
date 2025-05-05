
package carproject.vehicle;

public class Car extends Vehicle{
    
    private int numberOfDoors;

    public Car() {
    }

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void getSpeedBrand() {
        super.getSpeedBrand();
        System.out.println("Doors: "+numberOfDoors);
    }
    
    
    
    
    
}
