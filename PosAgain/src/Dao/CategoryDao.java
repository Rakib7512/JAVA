
package Dao;

import Util.DatabaseUtil;
import entity.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CategoryDao {
    
    
    DatabaseUtil du = new DatabaseUtil();
    PreparedStatement ps;
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




