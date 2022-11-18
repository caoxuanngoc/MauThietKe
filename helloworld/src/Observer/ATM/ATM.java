/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer.ATM;



/**
 *
 * @author DELL
 */
public class ATM {
    ITaiKhoanATM taiKhoan;
    public void attach(ITaiKhoanATM taiKhoan){
        this.taiKhoan = taiKhoan;
    }
    public void detach(){
        this.taiKhoan = null;
    }
    private boolean kiemTraTienRut(int soTienRut){
        return taiKhoan.kiemTraSoDu(soTienRut);
    }
    public void rutTien(int soTienRut){
        if(taiKhoan!=null){
            if(kiemTraTienRut(soTienRut)){
                taiKhoan.thongBao(soTienRut, true);
            }
            else{
                taiKhoan.thongBao(soTienRut, false);
            }
        }
        else{
            System.out.println("Không có thẻ trong máy!");
        }
    }
    public static interface ITaiKhoanATM{
        boolean kiemTraSoDu(int soTienRut);
        void thongBao(int soTienRut, boolean thanhCong);
    }
}