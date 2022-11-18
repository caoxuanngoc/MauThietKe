/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod61CNTT2;

/**
 *
 * @author DELL
 */
public class SinhVien {
    int id;
    String mssv, ten, ngaySing, queQuan;

    public SinhVien(int id, String mssv, String ten, String ngaySing, String queQuan) {
        this.id = id;
        this.mssv = mssv;
        this.ten = ten;
        this.ngaySing = ngaySing;
        this.queQuan = queQuan;
    }

    
    public int getId() {
        return id;
    }

    public String getMssv() {
        return mssv;
    }

    public String getTen() {
        return ten;
    }

    public String getNgaySing() {
        return ngaySing;
    }

    public String getQueQuan() {
        return queQuan;
    }
    
   
}
