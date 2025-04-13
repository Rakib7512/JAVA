
package arrays;

import java.util.Scanner;


public class Arrays {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("How namy times u want to push input");
        
            int usurinput=s.nextInt();
        
      String[] names=new String[usurinput];
      int[] marks = new int[usurinput];
   
        
        for(int index=0; index<usurinput; index++){
       
        System.out.println(" Enter Name");          
        String name=s.next();
        names[index]=name;
        
        
        System.out.println(" Enter Mark");          
        int mark=s.nextInt();
        marks[index]=mark;
           
        }
        
         
  
    
         for(int i=0;i<names.length; i++){
      System.out.println(names[i]+" Markes is "+marks[i]);
}
}
}