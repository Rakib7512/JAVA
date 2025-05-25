package crud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class CRUD {

    static DbUtil du = new DbUtil();
    static PreparedStatement ps;
    static String sql = "";

    public static void main(String[] args) {

        System.out.println("------After Save----");
        saveEmp("Rakib", "Programar", 3000f);
        showAllEmp();

        System.out.println("-------After Edit-----");
        updateEmp("Rakib Islam", "Senior Programar", 40000f, 1);
        showAllEmp();
        System.out.println("-------After Delete-------");
        deleteEmp(1);
        showAllEmp();

    }

    public static void saveEmp(String name, String designstion, float salary) {

        sql = "insert into emp(name,designstion,salary) values(?,?,?)";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, designstion);
            ps.setFloat(3, salary);
            ps.executeUpdate();
            ps.close();
            du.getCon().close();
            System.out.println("     Data Save");
            System.out.println("   ---------------");

        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showAllEmp() {
        sql = "select * from emp";
        try {
            ps = du.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String designstion = rs.getString("designstion");
                float salary = rs.getFloat("salary");
                System.out.println(" ID: " + id + "\n Name: " + name + "\n designstion: " + designstion + "\n Salary: " + salary+"\n ---------------------");

            }
            rs.close();
            ps.close();
            du.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteEmp(int id) {
        sql = "delete from emp where id=?";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateEmp(String name, String designstion, float salary, int id) {
        sql = "update emp set name=?, designstion=?,salary=? where id=?";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, designstion);
            ps.setFloat(3, salary);
            ps.setInt(4, id);

            ps.executeUpdate();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
