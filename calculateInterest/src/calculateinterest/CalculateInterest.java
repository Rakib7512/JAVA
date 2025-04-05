
package calculateinterest;

import java.util.Scanner;

public class CalculateInterest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Interest Rate like as 12.5% ");
        double interstRate= s.nextDouble();
        
        
        double monthlyIntrest=interstRate/1200;
        
        System.out.println("Enter Number Of Year");
        int numberOfYear=s.nextInt();
        
        System.out.println("Enter Lone Amount");
        double loanAmount=s.nextDouble();
        
        double monthlyPayment=loanAmount*monthlyIntrest/(1-1/ Math.pow(1 + monthlyIntrest, numberOfYear * 12));
        double totalPayment = monthlyPayment*numberOfYear*12;
        
        System.out.println("The Monthly Payment is " + monthlyPayment);
        System.out.println(" The Total Payment is "+ totalPayment);

    }
    
}
