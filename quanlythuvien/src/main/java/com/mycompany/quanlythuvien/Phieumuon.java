/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien;

import java.sql.Date;

/**
 *
 * @author khang
 */
public class Phieumuon {
    int maphieumuon;
    String msv_muon;
    int id_sach;
    Date ngaymuon;
    String trangthaimuon;
    Date ngaytra;
    Date ngayphaitra;
    int songaymuon;

    public Phieumuon() {
    }

    public Phieumuon(int maphieumuon, String msv_muon, int id_sach, Date ngaymuon, String trangthaimuon, Date ngaytra, Date ngayphaitra, int songaymuon) {
        this.maphieumuon = maphieumuon;
        this.msv_muon = msv_muon;
        this.id_sach = id_sach;
        this.ngaymuon = ngaymuon;
        this.trangthaimuon = trangthaimuon;
        this.ngaytra = ngaytra;
        this.ngayphaitra = ngayphaitra;
        this.songaymuon = songaymuon;
    }

    public Phieumuon(String msv_muon, int id_sach, Date ngaymuon, String trangthaimuon, Date ngaytra, Date ngayphaitra, int songaymuon) {
        this.msv_muon = msv_muon;
        this.id_sach = id_sach;
        this.ngaymuon = ngaymuon;
        this.trangthaimuon = trangthaimuon;
        this.ngaytra = ngaytra;
        this.ngayphaitra = ngayphaitra;
        this.songaymuon = songaymuon;
    }

    public int getMaphieumuon() {
        return maphieumuon;
    }

    public void setMaphieumuon(int maphieumuon) {
        this.maphieumuon = maphieumuon;
    }

    public String getMsv_muon() {
        return msv_muon;
    }

    public void setMsv_muon(String msv_muon) {
        this.msv_muon = msv_muon;
    }

    public int getId_sach() {
        return id_sach;
    }

    public void setId_sach(int id_sach) {
        this.id_sach = id_sach;
    }

    public Date getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(Date ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public String getTrangthaimuon() {
        return trangthaimuon;
    }

    public void setTrangthaimuon(String trangthaimuon) {
        this.trangthaimuon = trangthaimuon;
    }

    public Date getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(Date ngaytra) {
        this.ngaytra = ngaytra;
    }

    public Date getNgayphaitra() {
        return ngayphaitra;
    }

    public void setNgayphaitra(Date ngayphaitra) {
        this.ngayphaitra = ngayphaitra;
    }

    public int getSongaymuon() {
        return songaymuon;
    }

    public void setSongaymuon(int songaymuon) {
        this.songaymuon = songaymuon;
    }

    
  
}
