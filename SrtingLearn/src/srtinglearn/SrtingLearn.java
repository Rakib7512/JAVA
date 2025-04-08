
package srtinglearn;

import java.util.Scanner;

public class SrtingLearn {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println(" Enter your commend");
       String message=input.nextLine();
       
        System.out.println("Lenth = "+message.length());
        System.out.println("trim = "+message.trim());
        System.out.println("Lenth = "+message.toLowerCase());
        System.out.println("Lenth = "+message.toUpperCase());
   
    
    }
    
}
