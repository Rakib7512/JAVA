
package Util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseUtil {
    
    private Connection con = null;
    private String url="jdbc:mysql://localhost:3306/posAgain";
    private String usre="root";
    private String password="1234";
    private String driver="com.mysql.cj.jdbc.Driver";
    
    public Connection getCon(){
    
         try {
             Class.forName(driver);
             con=(Connection) DriverManager.getConnection(url, usre, password);
         } catch (ClassNotFoundException |SQLException ex) {
             Logger.getLogger(DatabaseUtil.class.getName()).log(Level.SEVERE, null, ex);
         }
  return con;
    }
}
