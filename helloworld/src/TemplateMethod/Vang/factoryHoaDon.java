/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod.Vang;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.List;

public class factoryHoaDon {
    List<HoaDon> dshd = new ArrayList<HoaDon>();

    void addgiohang(HoaDon hoaDon)
    {
        dshd.add(hoaDon);
    }
    void in()
    {
        System.out.println("danh sach thanh tien cua all hoa");
        dshd.forEach(gioHang -> System.out.println((gioHang.tinhTien()-gioHang.tinhChietKhau())));
    }
    HoaDon creatGioHang(TypeKH tt)
    {
        if(tt.equals(TypeKH.KimCuong)) {
            return new KimCuong();
        }
        else if(tt.equals(TypeKH.Vang))
        {
            return new Vang();
        }
        else if(tt.equals(TypeKH.ThanThiet))
        {
            return new ThanThiet();
        }
        else return null;
    }
}