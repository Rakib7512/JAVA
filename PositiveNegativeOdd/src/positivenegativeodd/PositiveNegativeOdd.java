
package positivenegativeodd;

import java.util.Scanner;

public class PositiveNegativeOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        float number = input.nextFloat();

        if (number > 0) {
            System.out.println("You Have Entered A Positive Number");
        } else if (number == 0) {
            System.out.println("You Have Entered Zero Number");
        } else {
            System.out.println("You Have Entered A Negetive Number");
        }
    }
    
}
