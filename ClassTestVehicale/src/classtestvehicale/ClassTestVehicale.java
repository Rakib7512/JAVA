
package classtestvehicale;

import classtestvehicale.truck.Truck;


public class ClassTestVehicale {

    public static void main(String[] args) {
     Truck t=new Truck();
        
     t.setRedularPrice(100);
        t.setWeight(20001);
        
        System.out.println(t.getPrice());
    }
    
}
