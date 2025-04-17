
package maxandminbymethod;

import java.util.Scanner;

public class MaxAndMinByMethod {

    public static void main(String[] args) {
      
        
        
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Your Limite");
        
        int size=s.nextInt();
        int[] numbers=new int[size];
         for(int i=0; i<size; i++){
        
            System.out.println(" Enter number"+ (i+1));
            
            int userInput=s.nextInt();
            numbers[i]=userInput;
        
        }
        
    }
    
   

}
