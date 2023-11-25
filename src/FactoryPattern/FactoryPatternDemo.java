package FactoryPattern;

/**
 * @Author 富贵
 * @Date 2023/10/25 12:33
 * @Version 1.0
 */
public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        //获取Circle的对象，并调用它的draw方法，如此类推
        Shape shape1 = shapeFactory.getShape("circle");

        //调用Circle 的draw方法
        shape1.draw();

        //获取Rectangle 的对象，并且调用它的draw方法
        Shape shape2 = shapeFactory .getShape("rectangle");

        //调用Rectangle的draw 方法
        shape2 .draw();

        //获取Square 的对象，并调用它的draw方法
        Shape shape3 = shapeFactory.getShape("square");

        //调用Square的draw 方法
        shape3.draw();

    }
}
