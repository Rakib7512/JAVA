package com.mycompany.testpractise;

import java.util.Arrays;
import java.util.Scanner;

public class TestPractise {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many times u want to put value");
        int size = s.nextInt();

        int maxNumber = 0;
        int minNumber = 999999;

        int myArrays[] = new int[size];

        for (int index = 0; index <size; index++) {

            System.out.println(" Enter Number" + (index + 1));
            int imput = s.nextInt();
            myArrays[index] = imput;

        }
          System.out.println(Arrays.toString(myArrays));
          
          
          for(int number:myArrays){
              
              if(number>maxNumber){
              maxNumber=number;
              
              }
          if(number<minNumber){
              
          minNumber=number;
          
          }
          
          
          }
        System.out.println("Max number is "+maxNumber);
        System.out.println("Min number is "+minNumber);
    }
}
