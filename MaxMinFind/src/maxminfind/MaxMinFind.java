
package maxminfind;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinFind {


    public static void main(String[] args) {
  
        
        Scanner s=new Scanner(System.in);
        
        int size= 5;
        
        int[] numbers=new int[size];
        
        int maxNumber=0;
        int minNumber=999999;
        
        for(int i=0; i<size; i++){
        
            System.out.println(" Enter number"+ (i+1));
            
            int userInput=s.nextInt();
            numbers[i]=userInput;
        
        }
        System.out.println("My Number are"+ Arrays.toString(numbers));
        
        for(int number:numbers){
        
        if(number>maxNumber){
        maxNumber=number;
        }
       
        if(number<minNumber){
        minNumber=number;
        }
        
        
     
        
    }
             System.out.println("Max Number is " + maxNumber);
        System.out.println("Min Number is " + minNumber);
}
}

    
