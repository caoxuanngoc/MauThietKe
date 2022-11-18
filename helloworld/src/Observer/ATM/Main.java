/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Observer.ATM;

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
        ATM atm = new ATM();
        TaiKhoan ngoc = new TaiKhoan("Ngoc", 2000, atm);
        TaiKhoan cao = new TaiKhoan("Cao", 1500, atm);
        System.out.println("Giao dịch lần 1:");
        ngoc.duaTheVaoATM();
        atm.rutTien(500);
        System.out.println("Giao dịch lần 2:");
        atm.rutTien(300);
        ngoc.rutThe();
        System.out.println("Giao dịch lần 3:");
        cao.duaTheVaoATM();
        atm.rutTien(300);
        cao.rutThe();
        System.out.println("Giao dịch lần 4:");
        atm.rutTien(300);
    }
    
}
