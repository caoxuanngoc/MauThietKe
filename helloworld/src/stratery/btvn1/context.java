package stratery.btvn1;

public class context {

    private ITinh tinhToan;

   

    public void setTinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }
  
 

    public float tinh(float a, float b) {
        return tinhToan.tinh(a,b);
    }

}