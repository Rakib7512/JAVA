
package primenumber;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int usurinput=input.nextInt();
       
        int count = 0;
       
       for(int i=1; i<=usurinput; i++){
       if(usurinput%i==0){
           count++;
       }
       }
       
       if(count==2){
       
           System.out.println("Is Prime Number");
       }
    
       else{
              System.out.println("Is not Prime Number");
       }
    }
    
}
