package javaapplication12;

import java.util.Scanner;

public class SwithAndBreak {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        int store = input.nextInt();

        while (store >= count){
            if (store % 5 == 0 && store % 10 == 0) {
                count++;
                continue;
            }
            System.out.println("" + count);
            count++;

        }

    }

}
