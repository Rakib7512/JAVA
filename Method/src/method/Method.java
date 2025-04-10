package method;

import java.util.Scanner;

public class Method {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");

        int usurinput = s.nextInt();

        String prime = findPrime(usurinput);

        double circle = CircleNumber(usurinput);

        String odd = OddEvent(usurinput);

        System.out.println("" + prime);
        System.out.println("" + circle);
        System.out.println("" + odd);

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

        float result2 = (float) (Math.PI * usurinput * Math.pow(usurinput, 2));

        return result2;
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

}
