/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibilityATMM;

/**
 *
 * @author DELL
 */
public class MotNghin implements IATM{
    int soLuong;
    float menhGia;

    public MotNghin(float menhGia) {
        this.menhGia = menhGia;
    }

    @Override
    public IATM menhGiaThapHon(IATM menhGia) {
        return null;
    }

    @Override
    public void soTien(float tien) {
        while (tien >= menhGia){
            tien -= menhGia;
            soLuong++;
        }
        System.out.println("het tien");
    }
}
