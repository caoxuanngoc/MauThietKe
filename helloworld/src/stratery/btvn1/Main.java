package stratery.btvn1;

public class Main {
    public static void main(String[] args) {
        context c = new context();
        ITinh t = new Cong();
        c.setTinhToan(t);
        System.out.println(c.tinh(75,12));

        ITinh t1 = new Tru();
        c.setTinhToan(t1);
        System.out.println(c.tinh(54,78));
    }
}

