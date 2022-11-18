package FactoryMethodSingleton.TronVuong;

public class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Hinh vuong");
    }
    private static Rectangle instance;

    protected Rectangle() {
    }
    public static Rectangle createInstance(){
        if (instance == null){
            instance = new Rectangle();
        }
        return instance;
    }
}
