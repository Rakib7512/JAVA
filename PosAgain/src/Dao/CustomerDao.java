
package Dao;

import Util.DatabaseUtil;
import entity.Category;
import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CustomerDao {
    DatabaseUtil du= new DatabaseUtil();
  PreparedStatement ps;
    
  
  
     public void saveCustomer(String name, String cell, String email, String address,JTable jt) {
        String sql = "insert into customer(name,cell,email,address)values(?,?,?,?)";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.executeUpdate();
            ps.close();
            du.getCon().close();
        
            JOptionPane.showMessageDialog(null, "Customer Inserted Successfully");
            showCustomerDetails(jt);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Customer Insert Unsuccessful");
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
     public void showCustomerDetails(JTable jt) {

        String[] colomName = {"Id", "Name", "Cell", "Email", "Address"};
        DefaultTableModel tableModel = new DefaultTableModel(colomName, 0);
        jt.setModel(tableModel);

        String sql = "select * from customer";
        try {
            ps = du.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String cell = rs.getString("cell");
                String email = rs.getString("email");
                String address = rs.getString("address");

                Object[] row = {id, name, cell, email, address};
                tableModel.addRow(row);
            }
            rs.close();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
      public void showCustomerDetailsByID(JTable jt, int id) {

        String[] colomName = {"Id", "Name", "Cell", "Email", "Address"};
        DefaultTableModel tableModel = new DefaultTableModel(colomName, 0);
        jt.setModel(tableModel);

        String sql = "select * from customer where id=?";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String cell = rs.getString("cell");
                String email = rs.getString("email");
                String address = rs.getString("address");

                Object[] row = {id, name, cell, email, address};
                tableModel.addRow(row);
            }
            rs.close();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public void updateCustomer(int id, String name, String cell, String email, String address) {

        String sql = "update customer set name=?, cell=?, email=?, address=? where id=?";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setInt(5, id);
            ps.executeUpdate();
            ps.close();
            du.getCon().close();
            JOptionPane.showMessageDialog(null, "Customer updated successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Customer updated unsuccessfully");
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
       public void deleteCustomer(int id, JTable jt) {
      String sql = "delete from customer where id=?";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted successfully.");
            showCustomerDetails(jt);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
       
       public List<Category>getAllCategory(){
           
           List<Category>categoryList= new Arr
       
     String sql="select *from category";
        try {
            ps=du.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
}
