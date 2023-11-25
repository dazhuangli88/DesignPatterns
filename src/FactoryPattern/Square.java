package FactoryPattern;

/**
 * @Author 富贵
 * @Date 2023/10/25 12:31
 * @Version 1.0
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square:: draw() method.");
    }
}
