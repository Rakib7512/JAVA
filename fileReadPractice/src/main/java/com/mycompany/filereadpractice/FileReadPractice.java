package com.mycompany.filereadpractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReadPractice {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        File f = new File("C:\\Users\\RJ Power\\Desktop\\lin.txt");

        try {
            PrintWriter pw = new PrintWriter(f);
            Scanner s = new Scanner(System.in);
            String input = s.nextLine();
            pw.write(input);
            pw.close();

            Scanner newS = new Scanner(f);

            System.out.println("Yout text is" + newS.nextLine());

    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadPractice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
