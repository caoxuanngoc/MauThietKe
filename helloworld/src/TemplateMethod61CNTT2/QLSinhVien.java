/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod61CNTT2;

/**
 *
 * @author DELL
 */
public class QLSinhVien extends QLData<SinhVien>{

    @Override
    protected int khoa(SinhVien t) {
        return t.id;
    }

    @Override
    public void hienThiDoiTuong(SinhVien t) {
        System.out.println("id" + t.id);
        System.out.println("mssv" + t.mssv);
        System.out.println("ten" + t.ten);
        System.out.println("queQuan" + t.queQuan);
    }
    
}
