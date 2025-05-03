package classtestvehicale.truck;

import classtestvehicale.Vehicle;

public class Truck extends Vehicle {

    int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double redularPrice, String color) {
        super(speed, redularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        if (weight > 2000) {
            return redularPrice - (redularPrice * .10);
        } else {
            return redularPrice;
        }

    }

}
