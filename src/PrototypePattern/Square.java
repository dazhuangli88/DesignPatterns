package PrototypePattern;

/**
 * @Author 富贵
 * @Date 2023/10/26 19:55
 * @Version 1.0
 */
public class Square extends Shape{

    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
