
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


public class CategoryDao {
    
    
    DatabaseUtil du = new DatabaseUtil();
    PreparedStatement ps;
    
    
    
    public void saveCategory(String name, JTable jt) {
        String sql = "insert into customer(name)values(?)";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, name);
       
            ps.executeUpdate();
            ps.close();
            du.getCon().close();

            JOptionPane.showMessageDialog(null, "Customer Inserted Successfully");
            showCustomerDetails(jt);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Customer Insert Unsuccessful");
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




