package PrototypePattern;

import java.util.Hashtable;

/**
 * 图像缓存
 *
 * @Author 富贵
 * @Date 2023/10/26 19:58
 * @Version 1.0
 */
public class ShapeCache {

    /**
     * 用于存放图像对象
     */
    private static Hashtable<String,Shape> shapeMap = new Hashtable<String,Shape>();

    /**
     * 根据图形名称获得形状对象
     */

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /**
     * 加载图像缓存
     * 这里用于加载所以图像，方便进行获取
     */

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
