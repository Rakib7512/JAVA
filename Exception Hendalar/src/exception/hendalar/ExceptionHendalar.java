
package exception.hendalar;

import java.util.Scanner;




public class ExceptionHendalar {


    public static void main(String[] args) {
        
        try{
            Scanner s=new Scanner(System.in);
            System.out.println("Enter 1st Number");
            int num1=s.nextInt();
            int num2=0;
            
         int result= num1/num2;
            
            System.out.println(""+result);
            
        }
        
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
    
}
