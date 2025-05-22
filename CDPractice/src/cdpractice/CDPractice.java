package cdpractice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Util;

public class CDPractice {

    static Util u = new Util();
    static PreparedStatement ps;
    static String sql = "";

    public static void main(String[] args) {

        System.out.println("Save");
        saveStuInfo("Imran", "JEE");
        showAllStu();

        System.out.println("-----After Edit---");
        updateStu("Imran Hossain", "JEE", 1);
        showAllStu();

        System.out.println("After delete");
        deleteStu(1);
        showAllStu();

    }

    public static void saveStuInfo(String name, String subject) {

        sql = "insert into student(name,subject) values(?,?)";

        try {
            ps = u.getCon().prepareCall(sql);
            ps.setString(1, name);
            ps.setString(2, subject);
            ps.executeUpdate();
            ps.close();
            u.getCon().close();
            System.out.println("Data Save");
            System.out.println("-----------");

        } catch (SQLException ex) {
            Logger.getLogger(CDPractice.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showAllStu() {

        sql = "select *from student";

        try {
            ps = u.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int roll = rs.getInt("roll");
                String name = rs.getString("name");
                String subject = rs.getString("subject");
                System.out.println("Roll: " + roll
                +"\n Name: " + name
                +"\nSubject: " + subject
                +"\n----------");
            }
            ps.close();
            rs.close();
            u.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CDPractice.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteStu(int roll) {
        sql = "delete from student where roll=?";

        try {
            ps = u.getCon().prepareStatement(sql);

            ps.setInt(1, roll);
            ps.close();
            u.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CDPractice.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateStu(String name, String subject, int roll) {
        sql = "update student set name=?, subject=? where roll=?";
        try {
            ps = u.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, subject);
            ps.setInt(3, roll);

            ps.cancel();
            u.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CDPractice.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
