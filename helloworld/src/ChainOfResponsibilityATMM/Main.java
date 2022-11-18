/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ChainOfResponsibilityATMM;

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
        IATM motTram = new LoaiTien(100);
        IATM namMuoi = new LoaiTien(50);
        IATM haiMuoi = new LoaiTien(20);
        IATM hai = new LoaiTien(2);
        IATM mot = new MotNghin(1);
        motTram.menhGiaThapHon(namMuoi)
                .menhGiaThapHon(haiMuoi)
                .menhGiaThapHon(hai)
                .menhGiaThapHon(mot);
        motTram.soTien(2673f);
    }
    
}
