/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod.GioHang;

/**
 *
 * @author DELL
 */
public class MatHang {
    String tenhang;
    float dongia;
    float soluong;

    public MatHang(String tenhang, float dongia, float soluong) {
        this.tenhang = tenhang;
        this.dongia = dongia;
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public float getSoluong() {
        return soluong;
    }

    @Override
    public String toString() {
        return "\t" +tenhang + "\t\t\t " + soluong + "  \t\t"+ dongia;
    }
}
