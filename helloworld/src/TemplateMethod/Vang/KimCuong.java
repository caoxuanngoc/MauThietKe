/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod.Vang;

/**
 *
 * @author DELL
 */
public class KimCuong extends HoaDon{
    @Override
    public double tinhChietKhau() {
        if (tinhTien() > 500000)
            return tinhTien() * 0.03;
        else if (tinhTien() > 1000000)
            return tinhTien() * 0.05;
        else if (tinhTien() > 1500000)
            return tinhTien() * 0.06;
        else return 0;
    }
}