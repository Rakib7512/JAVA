
package multiplearray;

import java.util.Arrays;

public class MultipleArray {

    public static void main(String[] args) {
     int[][]myArray=new int[2][3];
     
        System.out.println(Arrays.deepToString(myArray));
        
        myArray[0][1]=5;
        myArray[1][1]=6;
        myArray[1][0]=8;
        System.out.println(Arrays.deepToString(myArray));
    }
    
}
