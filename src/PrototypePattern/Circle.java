package PrototypePattern;

/**
 * @Author 富贵
 * @Date 2023/10/26 19:57
 * @Version 1.0
 */
public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
