
package Dao;

import Util.DatabaseUtil;
import entity.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JComboBox;


public class ProductDao {
    DatabaseUtil du=new DatabaseUtil();
    PreparedStatement ps;
    String sql;
    ResultSet rs;
  CategoryDao categoryDao=new CategoryDao();
    public void loadCategoryToProductCombo(JComboBox<String>catList){
  catList.removeAllItems();
        List<Category> categories=new java.util.ArrayList<>();
        categories=categoryDao.getAllCategory();
        
    
    
    
    }
    
}
