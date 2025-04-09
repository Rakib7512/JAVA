package com.mycompany.threetimesgames;

import java.util.Scanner;

public class ThreeTimesGames {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int random = (int) (Math.random() * 10);
   
        System.out.println("Guess the number");

        int usurNumber = s.nextInt();

        int count = 1;

        while (count < 4) {
            if (random == usurNumber) {

                System.out.println("you win");
                break;
            } else if (usurNumber > random && count<3) {
                System.out.println("You guess high number");
                usurNumber = s.nextInt();
                
                
            } else if (usurNumber < random  && count<3) {
                System.out.println(" You Guess lower number");
                usurNumber = s.nextInt();

            } else if (usurNumber == random  && count<3) {
                System.out.println("You win");
            }

            if (count == 3) {
                System.out.println("Better Luck next time");
            }
            count++;
        }

    }

}
