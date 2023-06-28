package com.mycompany.quanlythuvien;

public class Sinhvien {
    private String msv;
    private String msvOriginal;
    private String tensv;
    private String diachi;
    private String sdt;
    private String email;

    public Sinhvien() {
    }

    public Sinhvien(String msv, String tensv, String diachi, String sdt, String email) {
        this.msv = msv;
        this.msvOriginal = msv; // Lưu giá trị msv ban đầu
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

    public String getMsvOriginal() {
        return msvOriginal;
    }

    public void setMsvOriginal(String msvOriginal) {
        this.msvOriginal = msvOriginal;
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
