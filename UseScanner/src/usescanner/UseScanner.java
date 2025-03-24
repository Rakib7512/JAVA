package usescanner;

import java.util.Scanner;

public class UseScanner {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int number1=input.nextInt();
        System.out.println("Enter 2nd number");
        int number2=input.nextInt();
        float result=(float)number1/number2;
        System.out.println("Result is"+ result);
                
        
    }
    
}
