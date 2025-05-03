package fileevent;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileEvent {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter value to find out Events number");
        int num = s.nextInt();

        try {
            PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Documents\\Events Number.txt");

            for (int i = 0; i <= num; i++) {

                if (i % 2 == 0) {
                    pw.println(i);
                }

            }

            pw.close();

        } catch (FileNotFoundException ex) {
            System.out.println("You get Wrong");
            Logger.getLogger(FileEvent.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
