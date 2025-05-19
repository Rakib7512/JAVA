

package com.mycompany.filereadwrite2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReadWrite2 {

    public static void main(String[] args) {
    
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Your Text");
        String input=s.nextLine();
        
        File f= new File("C:\\Users\\RJ Power\\Desktop\\Rakib.txt");
        PrintWriter pw=null;
        try {
            pw=new PrintWriter(f);
            
         pw.write(input);
        pw.close();
        
        
        Scanner newS=new Scanner(f);
            System.out.println("Your Text is "+newS.nextLine());
        
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadWrite2.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
}
