
package count;

import java.util.Scanner;

public class Count {

    
    public static void main(String[] args) {
   
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Input");
        int usurinput=input.nextInt();
        
        System.out.println("Enter Text");
        String name=input.next();
                
          int count=0;

        for (int i = 1; i <= usurinput; i++) {

           count++;            
            System.out.println(name);
        }
    
        
       
    }
    
}
