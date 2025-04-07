
package minigame;

import java.util.Scanner;

public class Minigame {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your guase Number");
        double number=input.nextDouble();
        
        int randomNumber=(int)(Math.random()*10);
        System.out.println(""+randomNumber);
        
        if(number==randomNumber){
            System.out.println("You Winn");
        }
        else{
            System.out.println("You loss");}
    }
    
}
