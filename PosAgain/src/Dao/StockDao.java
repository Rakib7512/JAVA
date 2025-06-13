
package Dao;

import Util.DatabaseUtil;
import entity.Stock;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class StockDao {
    DatabaseUtil du=new DatabaseUtil();
    PreparedStatement ps;
    String sql;
    ResultSet rs;
    
    public List<Stock> getProductByCategory(String categoryName){
    List<Stock> stockList =new java.util.ArrayList<>();
    sql="select *from stock where category=?";
        try {
            ps=du.getCon().prepareStatement(sql);
            ps.setString(1, categoryName);
            rs=ps.executeQuery();
                        while(rs.next()){
            Stock stock=new Stock(
                    rs.getInt("id"),
                    rs.getString("productName"),
                    rs.getFloat("quantity"),
                    rs.getString("category")
            );
            stockList.add(stock);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stockList;
    }
   public void saveStock(String productName, float quantity,String category) {
        sql = "insert into stock(productName,quantity,category)";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, productName);
            ps.setFloat(2, quantity);
            ps.setString(3, category);
            ps.executeUpdate();
            ps.close();
            du.getCon().close();
        
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   
   public void updateStockQuantityByProductName(String productName, float quantity){
   sql="update stock set quantity=quantity+? where productName=?";
        try {
            ps=du.getCon().prepareStatement(sql);
            ps.setString(1, productName);
            ps.setFloat(2, quantity);
            ps.executeUpdate();
            ps.close();
            du.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(StockDao.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   
   
   }
}
