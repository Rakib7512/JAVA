
package com.mycompany.constrentmethod;

import com.mycompany.constrentmethod.lclass.Circle;
import java.awt.geom.Area;

public class ConstrentMethod {

    public static void main(String[] args) {
     
        Circle c=new Circle(5);
        
        System.out.println(c.getArea());
        System.out.println(c.getPeramiter()+" Peramiter");
        System.out.println(c.getArea());
        
        
    }
}
