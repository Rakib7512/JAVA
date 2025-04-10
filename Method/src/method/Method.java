package method;

import java.util.Scanner;
import javax.naming.spi.DirStateFactory;

public class Method {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");

        int usurinput = s.nextInt();
        
        String result = factorialNumber(usurinput);
        
        System.out.println(result);

//        String prime = findPrime(usurinput);
//        double circle = CircleNumber(usurinput);
//        String odd = OddEvent(usurinput);
 int count2 = count(usurinput);
//
//        System.out.println("" + prime);
//        System.out.println("" + circle);
//        System.out.println("" + odd);
 System.out.println("" + count2);
    }

    public static String findPrime(int usurinput) {
        int count = 0;
        String result = "";

        for (int i = 1; i <= usurinput; i++) {
            if (usurinput % i == 0) {

                count++;
            }
        }

        if (count == 2) {

            result = usurinput + " Is prime number";
        } else {

            result = usurinput + " Is not prime number";
        }

        return result;
    }

    public static double CircleNumber(int usurinput) {

        float result = (float) (Math.PI * usurinput * Math.pow(usurinput, 2));

        return result;
    }

    public static String OddEvent(int usurinput) {
        String result = "";
        if (usurinput % 2 == 0) {
            result = usurinput + " Odd Number";
        } else {
            result = usurinput + " Event Number";
        }

        return result;

    }

    public static String factorialNumber(int usurinput) {
        String result;
        
        int fact = 1;        

        for (int i = 1; i <= usurinput; i++) {

            fact *= i;            
            
        }
        result = fact + " is a factorial number of "+ usurinput;
        
        return result;

    }
  public static int count(int usurinput) {
        
       int result;
          int count=0;

        for (int i = 1; i <= usurinput; i++) {

           count++;            
            
        }
        result = count;
        
        return result;
}
}