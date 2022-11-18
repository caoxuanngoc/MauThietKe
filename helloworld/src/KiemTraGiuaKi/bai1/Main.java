/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KiemTraGiuaKi.bai1;



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
        
        CTTourBuilder t = new CTTourBuilder.Builder()
                .addtentour("Nha Trang")
                .addgia("15000")
                .addthoigian("2ngay")
                .adddsach("3tour")
                .build();
        System.out.println(t.toString());
    }
}
    

