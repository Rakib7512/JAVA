package classtestvehicale;

public class Vehicle {

    int speed;
    public double redularPrice;
    String color;

    public Vehicle() {
    }

    public Vehicle(int speed, double redularPrice, String color) {
        this.speed = speed;
        this.redularPrice = redularPrice;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRedularPrice() {
        return redularPrice;
    }

    public void setRedularPrice(double redularPrice) {
        this.redularPrice = redularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getPrice(){
        return redularPrice;
    }

}
