
package com.mycompany.baboolshot;

import java.util.Arrays;
import java.util.Scanner;

public class BaboolShot {

    public static void main(String[] args) {
       
        
      
        Scanner s = new Scanner(System.in);
        System.out.println("How many times u want to give value");
        int input = s.nextInt();
        int myArrays[] = new int[input];

        for (int index = 0; index < input; index++) {
            System.out.println("Enter Value" + (index + 1));
            int usureInput = s.nextInt();
            myArrays[index] = usureInput;

        }
        
        System.out.println("My Arrays Number is "+ Arrays.toString(myArrays));
        
        for(int round=0; round<myArrays.length-1;round++){
            
            for(int step=0; step<myArrays.length-1-round; step++){
                
                if (myArrays[step] > myArrays[step + 1]) {
                    int tamp = myArrays[step];
                    myArrays[step] = myArrays[step + 1];
                    myArrays[step + 1] = tamp;

                }
            
            }
        
          
        
        }
          System.out.println(""+Arrays.toString(myArrays));
    }
}

        
        
        
    

