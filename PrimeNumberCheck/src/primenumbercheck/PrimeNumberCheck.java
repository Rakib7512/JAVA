
package primenumbercheck;

import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Number for Check Prime Or Not");
        int input =s.nextInt();
        
       int count=0;
        
      for(int i=1;i<=input;i++){
          
          
          if(input%i==0){
           count++;
          
          }
          
        
      
      }
      
      if(count==2){
      
      
          System.out.println(input+" Is a prime number");
      }
      
      else{System.out.println(input+" Is not a Prime Number");};
    }
    
}
