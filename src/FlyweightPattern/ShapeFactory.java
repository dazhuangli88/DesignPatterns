package FlyweightPattern;

import java.util.HashMap;

/**
 * 图形工厂
 *
 * @Author 富贵
 * @Date 2023/10/27 19:20
 * @Version 1.0
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        //***当Map没有相关对象的时候创建并返回一个对象
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("creating circle of color: " + color);
        }
        return circle;
    }
}

