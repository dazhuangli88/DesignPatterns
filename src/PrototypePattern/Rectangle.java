package PrototypePattern;

/**
 * @Author 富贵
 * @Date 2023/10/26 19:54
 * @Version 1.0
 */
public class Rectangle extends Shape{

    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
