/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien;

/**
 *
 * @author khang
 */
public class Sach {
    int id;
    String tensach,tacgia,theloai;
    int soluong;

    public Sach() {
    }

    public Sach(int id, String tensach, String tacgia, String theloai, int soluong) {
        this.id = id;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.theloai = theloai;
        this.soluong = soluong;
    }

    public Sach(String tensach, String tacgia, String theloai, int soluong) {
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.theloai = theloai;
        this.soluong = soluong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    
    
    
}
