
package insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
int[] numbers={5,12,41,20,10,5,5,21,41}; 
        for(int i=1; i<numbers.length; i++){
        int currentElement=numbers[i];
        int k;
        for(k=i-1; k>=0 && numbers[k]>currentElement; k-- ){
        
        numbers[k+1]=numbers[k];
        }
        numbers[k+1]=currentElement;
        
        
        }
            System.out.println(Arrays.toString(numbers));
    }
    
}
