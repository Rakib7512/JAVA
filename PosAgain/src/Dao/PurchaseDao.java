package Dao;

import Util.DatabaseUtil;
import entity.Category;

import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.JComboBox;

public class PurchaseDao {

    DatabaseUtil du = new DatabaseUtil();
    PreparedStatement ps;
    String sql;
    CategoryDao categoryDao = new CategoryDao();

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
