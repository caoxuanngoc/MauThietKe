/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Decorator;

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
        BieuThuc bt = new BieuThucDonGian(8);
        bt = new Cong(bt, 6);
        bt = new Chia(bt, 2);
        bt = new Nhan(bt, 5);
        bt = new Cong(bt, 8);
        bt = new Tru(bt, 50);
        System.out.println(bt.bieuThuc());
        System.out.println(bt.giaTri());
        
        
    }

   
    
}
