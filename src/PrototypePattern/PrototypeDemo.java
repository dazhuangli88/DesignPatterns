package PrototypePattern;

/**
 * @Author 富贵
 * @Date 2023/10/26 20:13
 * @Version 1.0
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + cloneShape1.getType());

        Shape cloneShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + cloneShape2.getType());

        Shape cloneShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + cloneShape3.getType());
    }
}
