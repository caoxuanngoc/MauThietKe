/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TemplateMethod61CNTT2;

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
        QLData<SinhVien> qlsv = new QLSinhVien();
        SinhVien sv1 = new  SinhVien(1,"123","an","1/2/2001","hn");
        SinhVien sv2 = new  SinhVien(2,"124","bn","1/3/2001","hy");
        SinhVien sv3 = new  SinhVien(3,"125","cn","1/4/2001","na");   
        
        qlsv.them(sv1);
        qlsv.them(sv2);
        qlsv.them(sv3);
       // qlsv.capNhat(sv3);
        qlsv.hienThi();
        
        qlsv.xoa(sv3);
        System.out.println("DANH SACH SAU KHI XOA");
        qlsv.hienThi();
        
        
    }
    
}
