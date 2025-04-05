package convertminutes;

import java.util.Scanner;

public class ConvertMinutes {

    public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
        System.out.println("enter second: ");
        int totalsecond=input.nextInt();
            int remaindingSecond= totalsecond%3600;
            int hours=totalsecond/3600;
            int minutes = remaindingSecond/60;
            int second=remaindingSecond%60;
        System.out.println( hours+" Hours "+minutes+" minutes "+second+" second.");
   
       
        

        
    }
    
}
