package learndatabaseconnection.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbUtil {
    
    
    private Connection con=null;
    private final String url="jdbc:mysql://localhost:3306/mysql";
    private final String user="root";
    private final String password="1234";
    private final String Driver="com.mysql.cj.jdbc.Driver";
     
    public Connection getCon(){
        
        try {
            Class.forName(Driver);
                con = DriverManager.getConnection(url, user, password);
            }
        catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return con;
    }
}
