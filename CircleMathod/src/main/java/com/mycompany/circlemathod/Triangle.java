
package com.mycompany.circlemathod;

public class Triangle extends Shape{
    private double base;
    private double hight;

    public Triangle() {
    }

    public Triangle(double base, double hight) {
        this.base = base;
        this.hight = hight;
    }

    public Triangle(double base, double hight, double area) {
        super(area);
        this.base = base;
        this.hight = hight;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public double getArea() {
        return 0.5*base*hight;
    }
    
    
}
