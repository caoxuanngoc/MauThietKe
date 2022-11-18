package FactoryMethodSingleton.TronVuong;

public class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Hinh tron");
    }
    private static Circle instance;

    protected Circle() {
    }
    public static Circle createInstance(){
        if (instance == null){
            instance = new Circle();
        }
        return instance;
    }
}

