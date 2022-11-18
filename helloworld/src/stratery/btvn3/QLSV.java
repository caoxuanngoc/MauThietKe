package stratery.btvn3;

import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
import java.util.List;

public class QLSV {
    public void setiSoSanh(ISoSanh iSoSanh) {
        this.iSoSanh = iSoSanh;
    }

    ISoSanh iSoSanh;
    QLSV qlsv;
    List<SinhVien> sv = new ArrayList<>();

    static void swap(SinhVien a, SinhVien b){
        SinhVien s3 = new SinhVien(a.getHoTen(),a.getNgaySinh(), a.getDiemTB());
        a.setDiemTB(b.getDiemTB());
        a.setHoTen(b.getHoTen());
        a.setNgaySinh(b.getNgaySinh());

        b.setDiemTB(s3.getDiemTB());
        b.setHoTen(s3.getHoTen());
        b.setNgaySinh(s3.getNgaySinh());
    }

    public void sapXep() {
        for (int i = 0; i < sv.size() - 1; i++){
            for (int j = i+1; j < sv.size(); j++){
                if(iSoSanh.soSanh(sv.get(i),sv.get(j))==1)
                {
                    swap(sv.get(i),sv.get(j));
                }
            }
        }
    }
    public void inDS() {
        for (SinhVien item: sv){
            System.out.println("Thong tin Sinh Vien: \n");
            System.out.println("Ten Sv: " + item.getHoTen() + "\nNgay sinh: " +
                    item.getNgaySinh() + "\nDiem TB: " + item.getDiemTB());
        }
    }

}
