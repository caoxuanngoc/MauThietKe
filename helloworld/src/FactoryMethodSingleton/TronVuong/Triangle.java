package FactoryMethodSingleton.TronVuong;

public class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Hinh tam giac");
    }
    private static Triangle instance;

    protected Triangle() {
    }
    public static Triangle createInstance(){
        if (instance == null){
            instance = new Triangle();
        }
        return instance;
    }
}
