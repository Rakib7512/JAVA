
package com.mycompany.stacktest;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<String> nameStack=new Stack<>();
        nameStack.push("Rakib");
        nameStack.push("Parvez");
        nameStack.push("Eiasin");
        System.out.println(nameStack);
//        System.out.println(nameStack.peek());
        nameStack.pop();
        System.out.println(nameStack);
        
    }
}
