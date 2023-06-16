/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khang
 */
public class SachModify {
   public static List<Sach> findAll() {
        List<Sach> sachList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
            //querry
            String sql = "select * from sach";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                 Sach std = new Sach(resultSet.getInt("id"),
                                           resultSet.getString("tensach"),
                                            resultSet.getString("tacgia"),
                                             resultSet.getString("theloai"),
                                              resultSet.getInt("soluong"));
                 sachList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ketthuc
        return sachList;
    
    }
    
    public static void insert(Sach std){
           
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
            //querry
            String sql = "insert into sach(tensach,tacgia,theloai,soluong) values(?,?,?,?)";

            statement = connection.prepareCall(sql);
            
            statement.setString(1,std.getTensach());
             statement.setString(2,std.getTacgia());
              statement.setString(3,std.getTheloai());
               statement.setInt(4,std.getSoluong());
               
                    statement.execute();
            }
        catch (SQLException ex) {
            Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ketthuc
    }
    
    
    public static void update(Sach std){
           
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
            //querry
            String sql = "update sach set tensach=?,tacgia=?,theloai=?,soluong=? where id=?";

            statement = connection.prepareCall(sql);
            
            statement.setString(1,std.getTensach());
             statement.setString(2,std.getTacgia());
              statement.setString(3,std.getTheloai());
               statement.setInt(4,std.getSoluong());
                statement.setInt(5,std.getId());
                    statement.execute();
            }
        catch (SQLException ex) {
            Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ketthuc
    }
    
     public static void delete(int id){
           
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
            //querry
            String sql = "delete from sach where id = ?";
            statement = connection.prepareCall(sql);
                statement.setInt(1,id);
                    statement.execute();
            }
        catch (SQLException ex) {
            Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ketthuc
    }
     
      public static List<Sach> findByFullname(String tensach) {
        List<Sach> sachList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
            //querry
            String sql = "select * from sach where tensach like ? ";
            statement = connection.prepareCall(sql);
            statement.setString(1,"%"+tensach+"%");
            
           ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                 Sach std = new Sach(resultSet.getInt("id"),
                                           resultSet.getString("tensach"),
                                            resultSet.getString("tacgia"),
                                             resultSet.getString("theloai"),
                                              resultSet.getInt("soluong"));
                 sachList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ketthuc
        return sachList;
    
    }
      
      public static Sach findSachById(int id) {
    Connection connection = null;
    PreparedStatement statement = null;
    Sach sach = null;
    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
        String sql = "SELECT * FROM sach WHERE id = ?";
        statement = connection.prepareCall(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            sach = new Sach(
                resultSet.getInt("id"),
                resultSet.getString("tensach"),
                resultSet.getString("tacgia"),
                resultSet.getString("theloai"),
                resultSet.getInt("soluong")
            );
        }
    } catch (SQLException ex) {
        Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    return sach;
}
     
      
public static void decreaseQuantity(int id_sach) {
    Connection connection = null;
    PreparedStatement statement = null;
    try {
        // Thiết lập kết nối database
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");

        // Lấy thông tin số lượng sách hiện tại
        Sach sach = SachModify.findSachById(id_sach);
        int currentQuantity = sach.getSoluong();

        // Giảm số lượng sách đi 1
        int newQuantity = currentQuantity - 1;

        // Cập nhật số lượng sách mới vào database
        String sql = "UPDATE sach SET soluong = ? WHERE id = ?";
        statement = connection.prepareStatement(sql);
        statement.setInt(1, newQuantity);
        statement.setInt(2, id_sach);
        statement.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        // Đóng statement và connection
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

public static void increaseQuantity(int id_sach) {
    Connection connection = null;
    PreparedStatement statement = null;
    try {
        // Thiết lập kết nối database
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");

        // Lấy thông tin số lượng sách hiện tại
        Sach sach = SachModify.findSachById(id_sach);
        int currentQuantity = sach.getSoluong();

        // Tăng số lượng sách lên 1
        int newQuantity = currentQuantity + 1;

        // Cập nhật số lượng sách mới vào database
        String sql = "UPDATE sach SET soluong = ? WHERE id = ?";
        statement = connection.prepareStatement(sql);
        statement.setInt(1, newQuantity);
        statement.setInt(2, id_sach);
        statement.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        // Đóng statement và connection
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
       
}
