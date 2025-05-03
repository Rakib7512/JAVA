
package com.mycompany.red;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Red {

    public static void main(String[] args) {
      File f=new File("C:\\Users\\RJ Power\\Desktop\\Test.txt");
        PrintWriter pw;
        try {
            Scanner s= new Scanner(System.in);
            System.out.println("Enter Your comments");
            String com=s.nextLine();
            
            
            pw = new PrintWriter(f);
             pw.print(com);
             pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Red.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
        
  
              
    }
}
