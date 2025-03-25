
package calculate.circale;

import java.util.Scanner;

public class CalculateCircale {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter redious number");
            int number=input.nextInt();
         float result=(float) 3.1416*(number*number);
         System.out.println(result);
    }
    
}
