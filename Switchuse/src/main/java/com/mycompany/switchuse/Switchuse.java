
package com.mycompany.switchuse;

import java.util.Scanner;

public class Switchuse {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Year");
        int year=input.nextInt();
        
        
        String result="";
        System.out.println("Enter Month");
        int month=input.nextInt();
        
        System.out.println("Enter Date");
        String date=input.next();
       
        
        switch (month) {
            case 1:
                result="January";
                break;
            case 2:
                result="February";
                
                break;
            case 3:
                result="March";
                break;
            case 4:
                result="April";
                break;
            case 5:
                result="May";
                break;
            case 6:
                result="June";
                break;
            case 7:
                result="July";
                break;
            case 8:
                result="Agust";
                break;
            case 9:
                result="Septambar";
                break;
            case 10:
                result="October";
                break;
            case 11:
                result="Novenber";
                break;
            case 12:
                result="December";
                break;
            default:
                throw new AssertionError();
        }
     
        System.out.println(""+result+" "+date+" "+year);
        
    }
}
