
package crud;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;



public class CRUD {
    static DbUtil du=new DbUtil();
    static PreparedStatement ps;
    static String sql="";

    public static void main(String[] args) {
        
  
        
  
    }
    public void saveEmp(String name,String email,float salary){
    
    sql="insert into emp(name,email,salary) values(?,?,?)";
        try {
            ps=du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, salary);
            ps.executeUpdate();
            ps.close();
            du.getCon().close();
            System.out.println("Data Save");
            System.out.println("-----------");
            
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
