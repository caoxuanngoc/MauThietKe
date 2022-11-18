/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XepLoai61CNTT2;

/**
 *
 * @author DELL
 */

public class YeuKem implements  IXepLoai{

    String nhan;
    float min;

    public YeuKem(String nhan, float min) {
        this.nhan = nhan;
        this.min = min;
    }
    
    @Override
    public IXepLoai thietLapCaoHon(IXepLoai xepLoai) {
        return null;
    }

    @Override
    public String xepLoai(float diem) {
        if(diem >= min)
            return nhan;
        return "Diem ngoai pham vi";
    }
    
}
