/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod.GioHang;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public abstract class GioHang {

    List<MatHang> gioHang= new ArrayList<>();

    public double Tinhtien(){
        double Tong = 0;
        for (MatHang item: gioHang ){
            Tong = (item.getDongia() * item.getSoluong()) + Tong;
        }
        return Tong;
    }
    
    public abstract double ChietKhau(double tong);
}
