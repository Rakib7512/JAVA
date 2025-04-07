
package leapyear;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter Your Year: ");
        int year = number.nextInt();
        
        if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is a leap year");
        }
        
                 else if(year%400==0){
                System.out.println(year + " is a leap year");
                }
        
                 
        else{
            System.out.println(year + " isn't a leap year");
        }
    }
    
}
