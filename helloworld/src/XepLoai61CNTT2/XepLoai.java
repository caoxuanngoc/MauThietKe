/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XepLoai61CNTT2;

/**
 *
 * @author DELL
 */
public class XepLoai implements  IXepLoai{
    String nhan;
    float min;
    IXepLoai caoHon;

    public XepLoai(String nhan, float min) {
        this.nhan = nhan;
        this.min = min;
    }
    
    

    @Override
    public IXepLoai thietLapCaoHon(IXepLoai xepLoai) {
        caoHon = xepLoai;
        return xepLoai;
    }

    @Override
    public String xepLoai(float diem) {
        if(diem >= min)
            return nhan;
        
        return caoHon.xepLoai(diem);
    }
    
    
}
