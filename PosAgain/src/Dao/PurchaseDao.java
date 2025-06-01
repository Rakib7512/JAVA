package Dao;

import Util.DatabaseUtil;
import entity.Category;
import entity.Stock;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class PurchaseDao {

    DatabaseUtil du = new DatabaseUtil();
    PreparedStatement ps;
    String sql;
    CategoryDao categoryDao = new CategoryDao();
    StockDao stockDao = new StockDao();

    public void loadProduct(JComboBox<String> comboProductList, String category) {

        comboProductList.removeAllItems();
        List<Stock> stoctList2 = stockDao.getProductByCategory(category);
        if (stoctList2.isEmpty()) {
            System.out.println("No Product is Found!");
            return;
        }
        for (Stock s : stoctList2) {
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
    public void savePurchase(String productName,float unitePrice, float quantity,float totalPrice,String category,String supplier){
    
    sql="insert into purchase (productName,unitePrice,quantity,totalPrice,category,supplier,date) Values(?,?,?,?,?,?,now())";
        try {
            ps=du.getCon().prepareStatement(sql);
            ps.setString(1, productName);
            ps.setFloat(2, unitePrice);
            ps.setFloat(3, quantity);
            ps.setFloat(4, totalPrice);
            ps.setString(5, category);
            ps.setString(6, supplier);
            ps.executeUpdate();
            ps.close();
            du.getCon().close();
          JOptionPane.showMessageDialog(null, "Purchase Save successfully");
            
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Customer Not Save");
        }
    
    
    
    }
}
