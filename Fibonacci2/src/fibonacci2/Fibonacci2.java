
package fibonacci2;

import java.util.Scanner;


public class Fibonacci2 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         System.out.println("Enter number");
        int input=s.nextInt();
        int number1=0;
       int number2=1;
        int sum=0;
      
        System.out.println("---------------");
        System.out.println(""+number1);
        System.out.println(""+number2);
       for(int i=3; i<=input; i++){
       
  
       sum=number1+number2;
       
       number1=number2;
       number2=sum;
               System.out.println(""+sum);
       }
       

    }
    
}
