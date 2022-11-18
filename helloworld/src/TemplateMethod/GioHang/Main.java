/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TemplateMethod.GioHang;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QLHD qlhd = new QLHD();
        GioHang gioHang1 = qlhd.TypeThanhToan(TypeTT.COD);
        GioHang gioHang2 = qlhd.TypeThanhToan(TypeTT.Onl);

        MatHang matHang1 = new MatHang("Cam",1000000,3);
        MatHang matHang2 = new MatHang("Oi",105000,7);
        MatHang matHang3 = new MatHang("Xoai",404500,10);

        gioHang1.gioHang.add(matHang1);

        gioHang2.gioHang.add(matHang1);
        gioHang2.gioHang.add(matHang2);
        gioHang2.gioHang.add(matHang3);

        qlhd.addGioHang(gioHang1);
        qlhd.addGioHang(gioHang2);
        qlhd.HienthiTT();
    }
    
}
