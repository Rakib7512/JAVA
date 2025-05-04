
package redwritewhile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RedWriteWhile {

    public static void main(String[] args) {
     
        File f=new File("C:\\Users\\Admin\\Desktop\\While.txt");
        try {
            PrintWriter pw = new PrintWriter(f);
            Scanner s= new Scanner(f);
            pw.print("hello");
            pw.close();
            while(s.hasNext()){
                System.out.println(pw);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RedWriteWhile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
