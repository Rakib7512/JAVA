
package com.mycompany.constrentmethod.lclass;


public class Circle {
    
   double redious ;

    public Circle() {
    }

    public Circle(double redious) {
        this.redious = redious;
    }
    
   public double getArea(){
   
       double area=Math.PI*Math.pow(redious, 2);
       
       return area;
   
   }
   
   
   public double getPeramiter(){
   
   double peramiter=2*Math.PI*redious;
   return peramiter;
   
   }
   
   public void setRedious(double newResious){
   
   this.redious=newResious;
   
   
   }
     
}
