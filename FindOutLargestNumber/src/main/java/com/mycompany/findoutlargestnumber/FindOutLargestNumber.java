
package com.mycompany.findoutlargestnumber;

import java.util.Scanner;


public class FindOutLargestNumber {

    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        
        System.out.println("Enter 1st Number");
        double number1=number.nextDouble();
        
        System.out.println("Enter 2nd number");
        double number2=number.nextDouble();
        if(number1>number2){
            System.out.println(number1+" 1st Number is Larg");
        }
        else{
            System.out.println(number2+" 2nd Number is Larg");
        }
                
    }
}
