/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod.GioHang;

/**
 *
 * @author DELL
 */
public class ThanhToanOnl extends GioHang{
    @Override
    public double ChietKhau(double tong) {
        if(tong > 1000000)
        {
            return tong*0.05;
        }
        return tong * 0.03;
    }
}