
package overloadingmethod;

import java.util.Arrays;
import java.util.Scanner;

public class OverLoadingMethod {

    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        System.out.println(" Enyer how many time u want input ");
        int n=s.nextInt();
        
        
        int[] myArray=new int[n];
        
      for (int i=0; i<n; i++){
          
          
          System.out.println("Enter the Number ");
          int userInput=s.nextInt();
          
          myArray[i]=userInput;
      }  
      
      sum(myArray);
      
    }
      
      
      public static int sum(){
      
      return 10+20;
      }
      public static int sum(int a){
      
      return 10+a;
      
      
      }
      public static int sum(int a,int b){
      
      return a+b;
      }
      public static void sum(int...a){
      
          
          int sum=0;
 
         for(int item:a){
             
             sum+=item;
         }       
           System.out.println(Arrays.toString(a)); 
           System.out.println(sum);
      }
    }


