package Dao;

import Util.DatabaseUtil;
import entity.Category;
import entity.Stock;


import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.JComboBox;

public class PurchaseDao {

    DatabaseUtil du = new DatabaseUtil();
    PreparedStatement ps;
    String sql;
    CategoryDao categoryDao = new CategoryDao();
    StockDao stockDao=new StockDao(); 
    
    
    
    public void loadProduct(JComboBox<String> comboProductList, String category){
    
    comboProductList.removeAllItems();
    List<Stock> stoctList2=stockDao.getProductByCategory(category);
    if(stoctList2.isEmpty()){
        System.out.println("No Product is Found!");
        return;
        }
    for(Stock s:stoctList2){
        comboProductList.addItem(s.getProductName());
       
    
    
    
    }
    
    }

    public void loadCategory(JComboBox<String> comboCategoryBox) {
        comboCategoryBox.removeAllItems();
        List<Category> catList = categoryDao.getAllCategory();
        if (catList.isEmpty()) {
            System.out.println("No Category Found");
            return;
        }

        for (Category cat : catList) {
            comboCategoryBox.addItem(cat.getName());
        }
    }
}
