
package Dao;

import Util.DatabaseUtil;
import entity.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.List;



public class SupplierDao {
 
    DatabaseUtil du= new DatabaseUtil();
  PreparedStatement ps;
  CustomerDao customerDao=new CustomerDao();
    
     public void saveSupplier(String name, String cell, String email, String address,String contactPerson, JTable jt) {
        String sql = "insert into suppliers(name,cell,email,address,contactPerson)values(?,?,?,?,?)";
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
        
            JOptionPane.showMessageDialog(null, "Supplier Inserted Successfully");
  
            


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Supplier Insert Unsuccessful");
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     public void showSupplierDetails(JTable jt) {

        String[] colomName = {"Id", "Name", "Cell", "Email", "Address","contactPerson"};
        DefaultTableModel tableModel = new DefaultTableModel(colomName, 0);
        jt.setModel(tableModel);

        String sql = "select * from suppliers";
        try {
            ps = du.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String cell = rs.getString("cell");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String contactPerson = rs.getString("contactPerson");

                Object[] row = {id, name, cell, email, address,contactPerson};
                tableModel.addRow(row);
            }
            rs.close();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     public void EditSupplier(int id, String name, String cell, String email, String address,String contactPerson,JTable jt ) {

        String sql = "update suppliers set name=?, cell=?, email=?, address=?,contactPerson=? where id=?";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setString(5, contactPerson);
            ps.setInt(6, id);
            
            ps.executeUpdate();
            ps.close();
            du.getCon().close();
            JOptionPane.showMessageDialog(null, "Supplier Edit successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Supplioer Edit unsuccessfully");
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
     public void deleteSupplier(int id, JTable jt) {
      String sql = "delete from suppliers where id=?";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted successfully.");
            showSupplierDetails(jt);
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
     
     public List<Category> getAllProducts(){
         
         List<Category> categoryList = new ArrayList<>();
         
         String sql = "select * from category";
        try {
            ps = du.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
         while(rs.next()){
             int id = rs.getInt("id");
             String name = rs.getString("name");
             categoryList.add(new Category(id, name));
         }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         return categoryList;
     }
    
}
