
package dowhile;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter value");
        
        
     int input=s.nextInt();
   int count=1;
   long factorial=1;
     
        
        if(input<0){
            System.out.println("Enter Possiive number");
        }
        
        
        else{
        
            do{
            
           factorial*=count;
           count++;
            }
            
            while(count<=input);
            System.out.println("factorial  "+factorial);
        
        
        }
    }
    
}
