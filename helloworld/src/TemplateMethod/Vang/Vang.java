/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod.Vang;

/**
 *
 * @author DELL
 */
public class Vang extends HoaDon{
    @Override
    public double tinhChietKhau() {
        if (tinhTien() > 500000)
            return tinhTien() * 0.03;
        else if (tinhTien() > 1000000)
            return tinhTien() * 0.05;
        else return 0;
    }
}
