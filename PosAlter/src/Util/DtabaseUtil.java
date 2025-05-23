
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;





public class DtabaseUtil {
    
    
private Connection con=null;
   private String url="jdbc:musql://localhost:3306/pos2";
   private String usre="";
   private String password="1234";
   private String driver="com.mysql.cj.jdbc.Driver";
   
   
   public Connection getCon(){
   
    try {
        Class.forName(driver);
        
        con=DriverManager.getConnection(url, usre, password);
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(DtabaseUtil.class.getName()).log(Level.SEVERE, null, ex);
    }
   
   return con;
   
   }
}
