
package readweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadWeb {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter web address(Example: www.example.com)");
            String userInput = scan.next();
            
            System.out.println("Enter file name");
            String fileName = scan.next();
            
            URL url= new URL("https://" + userInput);
            Scanner s=new Scanner(url.openStream());
            String result = "";
            
            while(s.hasNext()){
                 result += s.nextLine();
            }
            
            PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\"+fileName+".html");
            pw.println(result);
            pw.close();
       
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(ReadWeb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadWeb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
