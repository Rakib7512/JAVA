
package com.mycompany.checkvowelandconsonent;

import java.util.Scanner;

public class CheckVowelAndConsonent {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" Check Vowel And Consonent ");
        
        char letter=input.next().toUpperCase().charAt(0);
        
        
        if(letter=='A'||letter=='E'||letter=='I'||letter=='U'||letter=='U'){
             System.out.println(letter+" is a Vowel");
        }
        
        else{
            System.out.println( letter+" is a conspnent");
        }
    }
}
