
package com.mycompany.circlemathod;


public class Circle extends Shape{
    private double redious;

    public Circle() {
    }

    public Circle(double redious) {
        this.redious = redious;
    }

    public Circle(double redious, int area) {
        super(area);
        this.redious = redious;
    }

    public double getRedious() {
        return redious;
    }

    public void setRedious(double redious) {
        this.redious = redious;
    }

    @Override
    public double getArea() {
       return Math.PI*Math.pow(redious, 2);
    }

   
    
}
