package FactoryMethodSingleton.TronVuong;

public class ShapeFactory{
    public Shape createShape(ShapeType shapeType){
        if (shapeType == null){
            return null;
        }else if (shapeType == ShapeType.Rectangle){
            return Rectangle.createInstance();
        }else if (shapeType == ShapeType.Triangle){
            return Triangle.createInstance();
        }else if (shapeType == ShapeType.Circle){
            return Circle.createInstance();
        }
        return null;
    }
}
