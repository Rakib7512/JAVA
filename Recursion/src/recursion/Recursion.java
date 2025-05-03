
package recursion;


public class Recursion {

    public static void main(String[] args) {

        System.out.println(fibonaci(7)); 
       
    }
    
    public  static long fibonaci(int n){
    
    if(n==0){
    return 0;
    }
    else if(n==1){
    return 1;
    }
    
    else {
    return fibonaci(n-1) + fibonaci(n-2) ;
    }
     
    }
    
}
