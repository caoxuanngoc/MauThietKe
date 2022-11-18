/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibilityATMM;

/**
 *
 * @author DELL
 */
public class LoaiTien implements IATM{
    float menhGia;
    IATM thapHon;
    int soLuong;

    public LoaiTien(float menhGia) {
        this.menhGia = menhGia;
    }

    @Override
    public IATM menhGiaThapHon(IATM menhGia) {
        thapHon = menhGia;
        return menhGia;
    }

    @Override
    public void soTien(float tien) {
        while (tien >= menhGia){
            tien -= menhGia;
            soLuong++;
        }
        System.out.println("Mệnh giá " + menhGia + "nghin" + " Số lượng " + soLuong);
        thapHon.soTien(tien);
    }
}
