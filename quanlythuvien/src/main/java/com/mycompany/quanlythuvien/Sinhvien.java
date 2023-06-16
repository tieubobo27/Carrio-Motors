/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien;

/**
 *
 * @author khang
 */
public class Sinhvien {
 
    String msv, tensv,diachi,sdt,email;

    public Sinhvien() {
    }

    public Sinhvien(String msv, String tensv, String diachi, String sdt, String email) {
        this.msv = msv;
        this.tensv = tensv;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
    }

    public Sinhvien(String tensv, String diachi, String sdt, String email) {
        this.tensv = tensv;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

            
}
