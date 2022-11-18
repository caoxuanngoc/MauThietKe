/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BuilderPattern.HoaDon;


import java.util.Date;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HoaDon hd1 = new HoaDon.HoaDonBuilder()
              .addHeader("hd001",new Date(), "Xuan Ngoc")
              .addCTHD("Keo", 3, 10000d, 0 )
              .addCTHD("Banh mi", 2, 15000d, 0 )
              .addCTHD("Sua", 3, 20000d, 0 )
              .addCTHD("Kem", 1, 10000d, 0 )
              .build();
      hd1.showCTDH();
        // TODO code application logic here
    }
    
}

