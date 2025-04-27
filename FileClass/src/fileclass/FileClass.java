
package fileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileClass {

 

    public static void main(String[] args) {
           File f= new File("C:\\Users\\Admin\\Desktop\\Ja.txt");
        try {
            PrintWriter pw= new PrintWriter(f);
            pw.print("Hello ");
            
            pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("You Get Wrong");
//            Logger.getLogger(FileClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
