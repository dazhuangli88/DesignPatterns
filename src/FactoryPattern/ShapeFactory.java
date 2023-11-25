package FactoryPattern;

/**
 * @Author 富贵
 * @Date 2023/10/25 12:22
 * @Version 1.0
 */
public class ShapeFactory {
    //使用shape方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        //根据相应的字符串获得对象实例
        if(shapeType.equalsIgnoreCase("rectangle")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("square")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}
