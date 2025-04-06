
package radiauscalculate;

import java.util.Scanner;

public class RadiausCalculate {

    public static void main(String[] args) {
     
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Redious Number");
        float number1= input.nextFloat();
        if(number1<=0){
            System.out.println("Enter Possitive Number");
            float number2=input.nextFloat();
            double result1=Math.PI*Math.pow(number2, 2);
            System.out.println(""+result1);
            }
        
        else{
            double result2=Math.PI*Math.pow(number1, 2);
            System.out.println(""+result2);
            
        }
            
        
    }
    
}
