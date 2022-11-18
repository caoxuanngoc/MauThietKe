package FactoryMethodSingleton.TronVuong;

public class Main {
    public static void main(String[] args) {
        ShapeFactory s = new ShapeFactory();
        Shape s1 = s.createShape(ShapeType.Rectangle);
        System.out.print("Hinh 1: ");
        s1.draw();
        Shape s2 = s.createShape(ShapeType.Circle);
        System.out.print("Hinh 2: ");
        s2.draw();
        Shape s3 = s.createShape(ShapeType.Triangle);
        System.out.print("Hinh 3: ");
        s3.draw();
    }
}
