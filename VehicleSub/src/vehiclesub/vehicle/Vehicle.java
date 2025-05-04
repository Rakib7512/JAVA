
package vehiclesub.vehicle;

public class Vehicle {
    String brand;
    double speed;

    public Vehicle() {
    }

    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void getBrandSpeed(){
    
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed);
    
    }
    
}
