package classtest;

import java.util.Arrays;
import java.util.Scanner;

public class ClassTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        ...........Fibonacci.....
//        System.out.println("Enter Value for calculate fubonacci number");
//        int input=s.nextInt();
//        
//        int num1=0;
//        int num2=1;
//        int sum=0;
//        
//        System.out.println("----------");
//        System.out.println(num1);
//        System.out.println(num2);
//        for(int i=0; i<input; i++){
//            sum=num1+num2;
//        num1=num2;
//        num2=sum;
//                
//        
//             System.out.println(""+sum);
//        }
//.....................Prime Number.........
//
//        System.out.println("Enter value for check Prime or Not");
//        int input = s.nextInt();
//
//        int count = 0;
//
//        for (int i = 1; i <= input; i++) {
//
//            if (input % i == 0) {
//
//                count++;
//      
//            }
//
//        }
//        
//        if(count==2){
//            System.out.println(input+" Is a Prime Number");
//        
//        
//        }
//        
//        else{ System.out.println(input+" Is Not a Prime Number");
//        
//        }
//...........MaxMinNumber...,.,.,..,.
//        int size = 5;
//
//        int myArrays[] = new int[size];
//
//        int maxNum = 0;
//        int minNum = 999999;
//
//        for (int i = 0; i < size; i++) {
//
//            System.out.println("Enter value" + (i + 1));
//            int input = s.nextInt();
//            myArrays[i] = input;
//
//        }
//
//        System.out.println("My   Arrays is  " + Arrays.toString(myArrays));
//
//        for (int number : myArrays) {
//
//            if (number > maxNum) {
//
//                maxNum = number;
//            }
//
//            if (number < minNum) {
//                minNum = number;
//
//            }
//
//        }
//
//        System.out.println("Max Number is" + maxNum);
//        System.out.println("Min Number is" + minNum);
//.,.,.,.,.,.,.,..,.,.,,,.,Get Discount.,.,.,.,.,,
//        System.out.println("Enter your Price (More then 200 tk u gill get 5% discount)");
//        float price = s.nextFloat();
//
//        if (price > 200) {
//            float dis = price - (price * 0.05f);
//
//            System.out.println("You Have To Pay After Discount Price " + dis);
//        } else {
//            System.out.println("You Have Pay " + price + " You Didn't get discount");
//        }
        System.out.println("Enter how many time u want to give Array Value");
        int input = s.nextInt();
        int myArray[] = new int[input];

        for (int i = 0; i < myArray.length; i++) {

            System.out.println("Enter value " + (i + 1));
            int usureInput = s.nextInt();
            myArray[i] = usureInput;

        }
        
        System.out.println(Arrays.toString(myArray));
        

        for (int round = 0; round < myArray.length - 1; round++) {

            for (int step = 0; step < myArray.length - 1 - round; step++) {

                if (myArray[step] > myArray[step + 1]) {
                    int tanp = myArray[step];
                    myArray[step] = myArray[step + 1];
                    myArray[step + 1] = tanp;

                }

            }

        }
        System.out.println(""+Arrays.toString(myArray));

    }

}
