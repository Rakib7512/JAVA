
package calculatorbyusingswith;

import java.util.Scanner;

public class CalculatorByUsingSwith {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter 1st Number");
        double  number1=input.nextDouble();
        
        System.out.println("Enter 2nd Number");
        double number2=input.nextDouble();
        
        System.out.println("Enter Your Choice sign like as +,-,*,/");
        String sign=input.next();
        double result=0;
        
        switch (sign) {
            case "+":
                result=number1+number2;
                break;
                
            case "-":
                result=number1-number2;
                break;
                
            case "/":
                result=number1/number2;
                break;
                
            case "*":
                result=number1*number2;
                break;
            default:
                System.out.println(" Envalied Your sign");
        }
        System.out.println(""+result);
        
    }
    
}
