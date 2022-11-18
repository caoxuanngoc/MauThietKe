/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TemplateMethod.Vang;

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
        factoryHoaDon sp = new factoryHoaDon();
        HoaDon h1 = sp.creatGioHang(TypeKH.KimCuong) ;
        HoaDon h2 = sp.creatGioHang(TypeKH.KimCuong) ;
        MatHang m1 = new MatHang("coca",10,100000);
        MatHang m2 = new MatHang("pepsi",5,10000);

        h1.dsHangHoa.add(m1);
        h1.dsHangHoa.add(m2);

        h2.dsHangHoa.add(m1);
        h2.dsHangHoa.add(m1);

        h1.HienThi();
        sp.addgiohang(h1);
        sp.addgiohang(h2);
        sp.in();
    }
    
}
