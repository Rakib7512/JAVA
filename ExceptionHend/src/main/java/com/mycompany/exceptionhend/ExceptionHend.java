
package com.mycompany.exceptionhend;

import java.util.Scanner;

public class ExceptionHend {

    public static void main(String[] args) {
     
           try{
               Scanner s= new Scanner(System.in);
               System.out.println("Enter 1st Value ");
               int num1=s.nextInt();
               System.out.println("Enter 2nd Value");
               int num2=s.nextInt();
               
               int result=num1/num2;
               System.out.println(""+result);
           
           
           }
           
           catch(Exception e){
               System.out.println("Please Enter Integer Number  "+e);
           
           
           }
        
    }
}
