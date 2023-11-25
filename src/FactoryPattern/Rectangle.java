package FactoryPattern;

/**
 * @Author 富贵
 * @Date 2023/10/25 12:20
 * @Version 1.0
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle:: draw() method.");
    }
}
