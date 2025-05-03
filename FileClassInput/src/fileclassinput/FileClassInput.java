
package fileclassinput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileClassInput {

  
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("How Many times u want to create Folder");
        int num=s.nextInt();
        
        
        try {
            
            for(int i=0;i<=num;i++){
             PrintWriter pw=new PrintWriter("C:\\Users\\Admin\\Desktop\\File Class\\Rakib.txt");
            pw.write("java");}
           
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileClassInput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
