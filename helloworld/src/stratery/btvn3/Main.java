package stratery.btvn3;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date d = new Date();
        SinhVien s1 = new SinhVien("Thanh", d,10);
        SinhVien s2 = new SinhVien("Hung", d,6);
        QLSV ql = new QLSV();
        ql.sv.add(s1);
        ql.sv.add(s2);
        
        System.out.println("SO SANH THEO DIEM");
        ISoSanh iSoSanh = new SoSanhTheoDiem();
        ql.setiSoSanh(iSoSanh);
        ql.sapXep();
        ql.inDS();

        System.out.println("\nSO SANH THEO TEN");
        ISoSanh iSoSanh1 = new SoSanhTheoTen();
        ql.setiSoSanh(iSoSanh1);
        ql.sapXep();
        ql.inDS();
    }

}