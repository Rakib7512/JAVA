package com.mycompany.switch2;

import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        int store = input.nextInt();

        while (store >= count){
            if (count % 5 == 0 && count % 10 == 0) {
                count++;
                continue;
            }
            System.out.println("" + count);
            count++;

        }

    }

}
