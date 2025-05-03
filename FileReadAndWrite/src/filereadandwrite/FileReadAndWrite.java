package filereadandwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReadAndWrite {

    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your text: ");
            String userInput = scan.nextLine();
            
            File f = new File("C:\\Users\\Admin\\Desktop\\Rakib2.txt");
            pw = new PrintWriter(f);
            pw.println(userInput);
            pw.close();
            
            Scanner s = new Scanner(f);
            System.out.println("Your text is:   " + s.nextLine());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadAndWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
