
package threatsrakibvai;


public class ThreatsRakibvai {

   
    public static void main(String[] args) {
      
        Runnable r= new CharValuesTest("R", 10);
        Runnable r1= new CharValuesTest("S", 10);
        Runnable r2= new CharValuesTest("W", 10);
        
Thread t=new Thread(r);
Thread t1=new Thread(r1);
Thread t2=new Thread(r2);
        
t.start();
t1.start();
t2.start();
    }
    
}
