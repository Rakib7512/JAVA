
package Dao;

import Util.DatabaseUtil;
import entity.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CategoryDao {
    
    
    DatabaseUtil du = new DatabaseUtil();
    PreparedStatement ps;
    
    
    
    public void saveCategory(String name, JTable jt) {
        String sql = "insert into category(name)values(?)";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, name);
              ps.executeUpdate();
            ps.close();
            du.getCon().close();
            JOptionPane.showMessageDialog(null, "category Inserted Successfully");
            showAllCategorys(jt);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "category Insert Unsuccessful");
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
     public void showAllCategorys(JTable jt) {

        String[] colomName = {"Id", "Name"};
        DefaultTableModel tableModel = new DefaultTableModel(colomName, 0);
        jt.setModel(tableModel);

        String sql = "select * from category";
        try {
            ps = du.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                   Object[] row = {id, name};
                tableModel.addRow(row);
            }
            rs.close();
            ps.close();
            du.getCon().close();
            } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
      public void updateCustomer(int id, String name) {

        String sql = "update category set name=? where id=?";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(5, id);
            ps.executeUpdate();
            ps.close();
            du.getCon().close();
            JOptionPane.showMessageDialog(null, "Category updated successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Category updated unsuccessfully");
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
      public void deleteCateory(int id, JTable jt) {
      String sql = "delete from category where id=?";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted successfully.");
            showAllCategorys(jt);
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
      public List<Category>getAllCategory(){
    List<Category>categoryList=new java.util.ArrayList<>();
   String sql="select *from category";
        try {
            ps=du.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
            int id=rs.getInt("id");
            String name=rs.getString("name");
            categoryList.add(new Category(id, name));
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    return categoryList;
    }
    
}




