
package Dao;

import Util.DtabaseUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class SupplierDao {

    DtabaseUtil du= new DtabaseUtil();
    PreparedStatement ps;
    public void saveSupplier(String name, String cell, String email, String address,String contactPerson,JTable jt ){
    
   String sql="insert into suppliers (name,cell,email,address,contactPerson) values(?,?,?,?,?)";
        try {
            ps=du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setString(5, contactPerson);
            
            ps.close();
            du.getCon().close();
            JOptionPane.showMessageDialog(null, "Supplier Save Successfully");
            
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Customer Insert Unsuccessful");
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
    public void showCustomerDetailsByAddress(JTable jt, String address) {

        String[] colomName = {"Id", "Name", "Cell", "Email", "Address","contactPerson"};
        DefaultTableModel tableModel = new DefaultTableModel(colomName, 0);
        jt.setModel(tableModel);

        String sql = "select * from customer where address=?";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, address);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String cell = rs.getString("cell");
                String email = rs.getString("email");
                String addressl = rs.getString("address");
                String contactPerson = rs.getString("contactPerson");

                Object[] row = {id, name, cell, email, addressl};
                tableModel.addRow(row);
            }
            rs.close();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
