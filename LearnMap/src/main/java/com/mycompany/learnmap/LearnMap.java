
package com.mycompany.learnmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class LearnMap {

    public static void main(String[] args) {
        
        try{
            Scanner s= new Scanner(System.in);
            System.out.println("Enter Id Number");
            int id=s.nextInt();
            
        Map<Integer,StudentDetails> stuList=new HashMap<>();
       stuList.put(1287675, new StudentDetails(1287675, "Rakib", "JEE", "rakib@gmail.com"));
        stuList.put(1287670, new StudentDetails(1287670, "Atiq", "JEE", "hyuzgtds"));
            System.out.println(stuList.get(id).toString());
        }
        catch(Exception e){
            System.out.println("Data Can Not Found");
        
        }
    }
}
