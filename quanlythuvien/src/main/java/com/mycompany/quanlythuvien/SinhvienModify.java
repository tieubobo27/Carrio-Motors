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
public class SinhvienModify {
     public static List<Sinhvien> findAll() {
        List<Sinhvien> sinhvientList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            //lay tat ca danh sach sinh vien
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
            //querry
            String sql = "select * from sinhvien";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                 Sinhvien std = new Sinhvien(resultSet.getString("msv"),
                                           resultSet.getString("tensv"),
                                            resultSet.getString("diachi"),
                                             resultSet.getString("sdt"),
                                              resultSet.getString("email"))
                                               ;
                 sinhvientList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ketthuc
        return sinhvientList;
    
    }
    
    public static void insert(Sinhvien std){
           
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
            //querry
            String sql = "insert into sinhvien(msv,tensv,diachi,sdt,email) values(?,?,?,?,?)";
            
            statement = connection.prepareCall(sql);
            
            statement.setString(1,std.getMsv());
             statement.setString(2,std.getTensv());
              statement.setString(3,std.getDiachi());
               statement.setString(4,std.getSdt());
                statement.setString(5,std.getEmail());
                    statement.execute();
            }
        catch (SQLException ex) {
            Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ketthuc
    }
    
    
    public static void update(Sinhvien std){
           
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
            //querry
            String sql = "update sinhvien set tensv=?,diachi=?,sdt=?,email=? where msv=?";

            statement = connection.prepareCall(sql);
            
            statement.setString(1,std.getTensv());
             statement.setString(2,std.getDiachi());
              statement.setString(3,std.getSdt());
               statement.setString(4,std.getEmail());
                statement.setString(5,std.getMsv());
                    statement.execute();
            }
        catch (SQLException ex) {
            Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ketthuc
    }
    
     public static void delete(String msv){
           
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
            //querry
            String sql = "delete from sinhvien where msv = ?";
            statement = connection.prepareCall(sql);
                statement.setString(1,msv);
                    statement.execute();
            }
        catch (SQLException ex) {
            Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ketthuc
    }
     
      public static List<Sinhvien> findByFullname(String tensv) {
        List<Sinhvien> sinhvienList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
            //querry
            String sql = "select * from sinhvien where tensv like ? ";
            statement = connection.prepareCall(sql);
            statement.setString(1,"%"+tensv+"%");
            
           ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                 Sinhvien std = new Sinhvien(resultSet.getString("msv"),
                                           resultSet.getString("tensv"),
                                            resultSet.getString("diachi"),
                                             resultSet.getString("sdt"),
                                              resultSet.getString("email"));
                                               
                 sinhvienList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ketthuc
        return sinhvienList;
    
    }
      
     public static boolean isMsvExists(String msv) {
    boolean exists = false;
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
        String sql = "SELECT COUNT(*) FROM sinhvien WHERE msv = ?";
        statement = connection.prepareStatement(sql);
        statement.setString(1, msv);
        resultSet = statement.executeQuery();
        if (resultSet.next()) {
            int count = resultSet.getInt(1);
            exists = (count > 0);
        }
    } catch (SQLException ex) {
        Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException ex) {
                Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    return exists;
} 
     
       public static Sinhvien findSinhvienById(String id) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Sinhvien sinhvien = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
            String sql = "SELECT * FROM sinhvien WHERE msv = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                sinhvien = new Sinhvien();
               
                sinhvien.setMsv(resultSet.getString("msv"));
                sinhvien.setTensv(resultSet.getString("tensv"));
                sinhvien.setDiachi(resultSet.getString("diachi"));
                sinhvien.setSdt(resultSet.getString("sdt"));
                sinhvien.setEmail(resultSet.getString("email"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return sinhvien;
    }

}
