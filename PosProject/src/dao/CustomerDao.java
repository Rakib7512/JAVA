package dao;

import Util.DatabeseUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CustomerDao {

    DatabeseUtil du = new DatabeseUtil();
    PreparedStatement ps;

    public void saveCustomer(String name, String cell, String email, String address) {

        String sql = "insert into customer(name,cell,email,address)values(?,?,?,?)";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.executeUpdate();
            ps.close();
            du.getCon().close();
            
            JOptionPane.showMessageDialog(null, "Customer Inserted Successfully");
         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Customer Insert Unsuccessful");
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    }
    
    public void showCustomerDetails(JTable jt){
    
   String[] colomName={"Id","Name","Cell","Email","Address"};
        DefaultTableModel tableModel=new DefaultTableModel(colomName, 0);
        jt.setModel(tableModel);
        
        String sql="select * from customer";
        try{
        
            PreparedStatement ps=du.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
            
            int id=rs.getInt("id");
            String name=rs.getString("name");
            String cell=rs.getString("cell");
            String email=rs.getString("email");
            String address=rs.getString("address");
            
            Object[]rowData={id,name,cell,email,address};
            tableModel.addRow(rowData);
            
            rs.close();
            ps.close();
            du.getCon().close();
            
            
            }
        
        
        }
        
        
        
        catch(){
        
        
        }
        
    
    
    }
}
