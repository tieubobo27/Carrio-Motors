/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khang
 */
public class PhieumuonModify {
  public static List<Phieumuon> findAll() {
    List<Phieumuon> phieumuonList = new ArrayList<>();
    Connection connection = null;
    Statement statement = null;
    try {
        // Lấy tất cả danh sách phiếu mượn
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
        // Truy vấn
        String sql = "SELECT * FROM phieumuon";
        statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            Phieumuon std = new Phieumuon(resultSet.getInt("maphieumuon"),
                    resultSet.getString("msv_muon"),
                    resultSet.getInt("id_sach"),
                    resultSet.getDate("ngaymuon"),
                    resultSet.getString("trangthaimuon"),
                    resultSet.getDate("ngaytra"),
                        resultSet.getDate("ngayphaitra"),
                            resultSet.getInt("songaymuon"));

            phieumuonList.add(std);
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
    // Kết thúc
    return phieumuonList;
}

    
//    public static void insert(Phieumuon std){
//           
//        Connection connection = null;
//        PreparedStatement statement = null;
//        try {
//            //lay tat ca danh sach sinh vien
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
//            //querry
//            String sql = "insert into phieumuon(msv_muon,id_sach,ngaymuon,trangthaimuon) values(?,?,?,?)";
//
//            statement = connection.prepareCall(sql);
//            
//            statement.setString(1,std.getMsv_muon());
//             statement.setInt(2,std.getId_sach());
//              statement.setString(3,std.getNgaymuon());
//               statement.setString(4,std.getTrangthaimuon());
//                    statement.execute();
//            }
//        catch (SQLException ex) {
//            Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            if(statement != null){
//                try {
//                    statement.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//        //ketthuc
//    }
     
public static boolean insert(String msv_muon, int id_sach, Date ngaymuon, String trangthaimuon) {
    Connection connection = null;
    PreparedStatement statement = null;

    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
        String sql = "INSERT INTO phieumuon (msv_muon, id_sach, ngaymuon, trangthaimuon, ngaytra, ngayphaitra, songaymuon) VALUES (?, ?, ?, ?, ?, ?, ?)";
        statement = connection.prepareStatement(sql);
        statement.setString(1, msv_muon);
        statement.setInt(2, id_sach);
        statement.setDate(3, ngaymuon);
        statement.setString(4, trangthaimuon);

        // Tính ngày phải trả (ngaymuon + 90 ngày)
        LocalDate ngaymuonLocal = ngaymuon.toLocalDate();
        LocalDate ngayphaitra = ngaymuonLocal.plusDays(90);
        Date ngaytra = Date.valueOf(ngayphaitra);

        statement.setNull(5, Types.DATE); 
        statement.setDate(6, ngaytra);
        statement.setNull(7, Types.INTEGER); // Đặt giá trị songaymuon là null

        int rowsAffected = statement.executeUpdate();
        return rowsAffected > 0;
    } catch (SQLException ex) {
        ex.printStackTrace();
        return false;
    } finally {
        // Đóng kết nối và giải phóng tài nguyên
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
    
   
    
//    public static void update(Phieumuon std){
//           
//        Connection connection = null;
//        PreparedStatement statement = null;
//        try {
//            //lay tat ca danh sach sinh vien
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
//            //querry
//            String sql = "update phieumuon set msv_muon=?,id_sach=?,ngaymuon=? where maphieumuon=?";
//
//            statement = connection.prepareCall(sql);
//            
//            statement.setString(1,std.getMsv_muon());
//             statement.setInt(2,std.getId_sach());
//              statement.setString(3,std.getNgaymuon());
//                statement.setInt(4,std.getMaphieumuon());
//                    statement.execute();
//            }
//        catch (SQLException ex) {
//            Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            if(statement != null){
//                try {
//                    statement.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//        //ketthuc
//    }
     
     public static void update(Phieumuon std) {
    Connection connection = null;
    PreparedStatement statement = null;

    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
        String sql = "UPDATE phieumuon SET msv_muon = ?, id_sach = ?, ngaymuon = ? WHERE maphieumuon = ?";
        statement = connection.prepareStatement(sql);
        statement.setString(1, std.getMsv_muon());
        statement.setInt(2, std.getId_sach());
        statement.setDate(3, std.getNgaymuon());
        statement.setInt(4, std.getMaphieumuon());
        statement.executeUpdate();
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
}
    
     public static void delete(int id){
           
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
            //querry
            String sql = "delete from phieumuon where maphieumuon = ?";
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
     
     public static List<Phieumuon> findByFullnameAndStatus(String msv_muon) {
    List<Phieumuon> phieumuonList = new ArrayList<>();
    Connection connection = null;
    PreparedStatement statement = null;
    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
        String sql = "SELECT * FROM phieumuon WHERE msv_muon LIKE ?";
        statement = connection.prepareStatement(sql);
        statement.setString(1, "%" + msv_muon + "%");

        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Phieumuon std = new Phieumuon(resultSet.getInt("maphieumuon"),
                    resultSet.getString("msv_muon"),
                    resultSet.getInt("id_sach"),
                    resultSet.getDate("ngaymuon"),
                    resultSet.getString("trangthaimuon"),
                    resultSet.getDate("ngaytra"),
            resultSet.getDate("ngayphaitra"),
           resultSet.getInt("songaymuon"));
            phieumuonList.add(std);
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
    return phieumuonList;
}
     
         public static boolean checkExistingLoan(String msv_muon, int id_sach) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
            String sql = "SELECT COUNT(*) FROM phieumuon WHERE msv_muon = ? AND id_sach = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, msv_muon);
            statement.setInt(2, id_sach);
            
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieumuonModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PhieumuonModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PhieumuonModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PhieumuonModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return false;
    }
         
         
   public static void updatetra(Phieumuon std) {
    Connection connection = null;
    PreparedStatement statement = null;
    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
        String sql = "UPDATE phieumuon SET trangthaimuon = ?, ngaytra = ?, songaymuon = DATEDIFF(ngaytra, ngaymuon) WHERE maphieumuon = ?";
        statement = connection.prepareStatement(sql);
        statement.setString(1, "DaTra");
        statement.setDate(2, new java.sql.Date(System.currentTimeMillis())); // Lấy ngày hiện tại
        statement.setInt(3, std.getMaphieumuon());
        statement.executeUpdate();
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
}

         
 
   public static boolean isStatusDangMuon(String msv_muon, int id_sach) {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
        String sql = "SELECT trangthaimuon FROM phieumuon WHERE msv_muon = ? AND id_sach = ?";
        statement = connection.prepareStatement(sql);
        statement.setString(1, msv_muon);
        statement.setInt(2, id_sach);

        resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String trangthaimuon = resultSet.getString("trangthaimuon");
            return trangthaimuon.equals("DangMuon");
        }
    } catch (SQLException ex) {
        Logger.getLogger(PhieumuonModify.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException ex) {
                Logger.getLogger(PhieumuonModify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(PhieumuonModify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(PhieumuonModify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    return false;
}

public static boolean isStatusDaTra(String msv_muon, int id_sach) {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
        String sql = "SELECT trangthaimuon FROM phieumuon WHERE msv_muon = ? AND id_sach = ?";
        statement = connection.prepareStatement(sql);
        statement.setString(1, msv_muon);
        statement.setInt(2, id_sach);

        resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String trangthaimuon = resultSet.getString("trangthaimuon");
            return trangthaimuon.equals("DaTra");
        }
    } catch (SQLException ex) {
        Logger.getLogger(PhieumuonModify.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException ex) {
                Logger.getLogger(PhieumuonModify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(PhieumuonModify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(PhieumuonModify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    return false;
}

  public static boolean checkExistingLoan1(String msv_muon, int id_sach, String trangthaimuon) {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
        String sql = "SELECT COUNT(*) FROM phieumuon WHERE msv_muon = ? AND id_sach = ? AND trangthaimuon = ?";
        statement = connection.prepareStatement(sql);
        statement.setString(1, msv_muon);
        statement.setInt(2, id_sach);
        statement.setString(3, trangthaimuon);
        resultSet = statement.executeQuery();

        if (resultSet.next()) {
            int count = resultSet.getInt(1);
            return count > 0;
        }

        return false;
    } catch (SQLException ex) {
        ex.printStackTrace();
        return false;
    } finally {
        // Đóng kết nối và giải phóng tài nguyên
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
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
  
  
  
public static boolean checkExistingLoan2(String msv_muon, int id_sach, String trangthaimuon) {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltvap", "root", "");
        String sql = "SELECT * FROM phieumuon WHERE msv_muon = ? AND id_sach = ? AND (trangthaimuon != ? OR trangthaimuon IS NULL)";
        statement = connection.prepareStatement(sql);
        statement.setString(1, msv_muon);
        statement.setInt(2, id_sach);
        statement.setString(3, trangthaimuon);
        resultSet = statement.executeQuery();
        return resultSet.next(); // Trả về true nếu có phiếu mượn tồn tại, ngược lại trả về false
    } catch (SQLException ex) {
        ex.printStackTrace();
        return false;
    } finally {
        // Đóng resultSet, statement và connection trong khối finally
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
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
