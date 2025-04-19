
package com.mycompany.constract2.Squire;


public class Squire {

    double lenth;
    double with;
    
    
    public Squire() {
    }

    public Squire(double lenth, double dith) {
        this.lenth = lenth;
        this.with = dith;
    }

    public Squire(double lenth) {
        this.lenth = lenth;
    }
    
    
    
    public double getSquireArea(){
    
    double result=Math.pow(lenth, 2);
    
    return result;
    
    
    }
    
    
    
    
}
