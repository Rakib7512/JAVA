
package Dao;

import Util.DatabaseUtil;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class SupplierDao {
 
    DatabaseUtil du= new DatabaseUtil();
  PreparedStatement ps;
    
     public void saveSupplier(String name, String cell, String email, String address,String contactPerson, JTable jt) {
        String sql = "insert into suppliers(name,cell,email,address)values(?,?,?,?,?)";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setString(5, contactPerson);
            ps.executeUpdate();
            ps.close();
            du.getCon().close();
        
            JOptionPane.showMessageDialog(null, "Customer Inserted Successfully");
//shoSu

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Customer Insert Unsuccessful");
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
