
package posagain;
import java.util.List;

import Dao.SupplierDao;
import entity.Category;

public class PosAgain {


    public static void main(String[] args) {

        SupplierDao sd = new SupplierDao();
        List<Category> catList = sd.getAllProducts();
        for(Category cat : catList){
            System.out.println(cat.getName());
        }
    }
    
}
