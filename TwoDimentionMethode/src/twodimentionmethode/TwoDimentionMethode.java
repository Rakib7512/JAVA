
package twodimentionmethode;

import java.util.Scanner;

public class TwoDimentionMethode {

    public static void main(String[] args) {
       
    }
    
    
    
    public static int(int s){
        
        String result;
        
        
        
    }
        
        
        {
     



{

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your row limit: ");
        int rowSize = scan.nextInt();

        System.out.print("Enter your column limit: ");
        int columnSize = scan.nextInt();

        int[][] myArrays = new int[rowSize][columnSize];

        for (int row = 0; row < myArrays.length; row++) {

            for (int column = 0; column < myArrays[row].length; column++) {
                System.out.print("Enter value for row " + (row + 1) + " x column " + (column + 1) + ": ");
                int userInput = scan.nextInt();
                myArrays[row][column] = userInput;
            }
        }

        System.out.println("Your array is: ");

        for (int row = 0; row < myArrays.length; row++) {

            for (int column = 0; column < myArrays[row].length; column++) {
                System.out.print(myArrays[row][column] + " ");
            }
    

    
}

        }
    
    
    
