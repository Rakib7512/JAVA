
package com.mycompany.circlemathod;

public class Rectangler extends Shape{
    private double hight;
    private double wight;

    public Rectangler() {
    }

    public Rectangler(double hight, double wight) {
        this.hight = hight;
        this.wight = wight;
    }

    public Rectangler(double hight, double wight, double area) {
        super(area);
        this.hight = hight;
        this.wight = wight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    @Override
    public double getArea() {
        return hight*wight;
    }
    
    
}
