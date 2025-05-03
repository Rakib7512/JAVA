
package classfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassFile {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("How Many Numbers u want creat file");
        int size=s.nextInt();
        try {
  
            for(int i=0; i<size;i++){
                
                System.out.println("Enter File name"+(i+1));
                String Fname=s.next();
                PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Documents\\"+Fname+i+".txt"); {
                    pw.print("Welcome from java");
                }
            }
        }
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(ClassFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
