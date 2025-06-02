package Dao;

import Util.DatabaseUtil;
import entity.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProductDao {

    DatabaseUtil du = new DatabaseUtil();
    PreparedStatement ps;
    String sql;
    ResultSet rs;
    CategoryDao categoryDao = new CategoryDao();

    public void loadCategoryToProductCombo(JComboBox<String> catList) {
        catList.removeAllItems();
        List<Category> categories = new java.util.ArrayList<>();
        categories = categoryDao.getAllCategory();
        for (Category c : categories) {
            catList.addItem(c.getName());

        }

    }

    public void saveProduct(String category, String productName) {
        sql = "insert into product(category,productName)";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, category);
            ps.setString(2, productName);
            ps.executeUpdate();
            ps.close();
            du.getCon().close();
            JOptionPane.showMessageDialog(null, "Product Added Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Product Not Added");
        }

    }
    public void showAllProduct(JTable jt) {

        String[] colomName = {"Id", "Product Name", "Category"};
        DefaultTableModel tableModel = new DefaultTableModel(colomName, 0);
        jt.setModel(tableModel);

        String sql = "select * from product";
        try {
            ps = du.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ProductName = rs.getString("ProductName");
                String category = rs.getString("category");
                

                Object[] row = {id, ProductName, category};
                tableModel.addRow(row);
            }
            rs.close();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
