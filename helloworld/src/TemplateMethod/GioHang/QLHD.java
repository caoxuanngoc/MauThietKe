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
public class QLHD {

    List<GioHang> qlhd = new ArrayList<>();

    public GioHang TypeThanhToan(TypeTT typeTT)
    {
        if(typeTT==TypeTT.COD)
        {
            return new ThanhToanCOD();
        }
        if(typeTT==TypeTT.Onl)
        {
            return new ThanhToanOnl();
        }
        return null;
    }

    public void addGioHang(GioHang gioHang)
    {
        qlhd.add(gioHang);
    }
    public void HienthiTT(){
//        double tong = 0;
        final int[] i = {1};
//        for (GioHang item: qlhd ){
//            tong = (item.Tinhtien() - item.ChietKhau(item.Tinhtien()))+tong;
//            System.out.println("Hoa don "+i+" : "+ tong);
//            i++;
//        }
        qlhd.forEach(
                hoadon ->System.out.println("Hoa don "+(i[0]++) + ": "+ (hoadon.Tinhtien()-hoadon.ChietKhau(hoadon.Tinhtien()))
                        +" Vnd"
                )
        );


    }

    
}
