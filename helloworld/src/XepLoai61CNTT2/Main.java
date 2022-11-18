/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XepLoai61CNTT2;

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
        IXepLoai xuatSac = new XepLoai("Xuat Sac", 9);
        IXepLoai gioi = new XepLoai("Gioi", 8);
        IXepLoai kha = new XepLoai("Kha", 7);
        IXepLoai tb = new XepLoai("Trung Binh", 5);
        IXepLoai yeu_kem = new XepLoai("Yeu Kem", 0);
        
        
        xuatSac.thietLapCaoHon(gioi)
               .thietLapCaoHon(kha)
               .thietLapCaoHon(tb)
               .thietLapCaoHon(yeu_kem);
        System.out.println("Diem 7.5:" +xuatSac.xepLoai(7.5f));
    }
    
}
