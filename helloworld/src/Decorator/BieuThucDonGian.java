/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author DELL
 */
public class BieuThucDonGian extends BieuThuc {
    private float toanHang;

    public BieuThucDonGian(float toanHang) {
        this.toanHang = toanHang;
    }
 
    @Override
    public float giaTri() {
       return toanHang;
    }

    @Override
    public String bieuThuc() {
        return String.valueOf(toanHang);
    }
    
}
