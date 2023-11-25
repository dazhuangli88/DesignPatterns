package AbstractFactory;

/**
 * 抽象工厂模式 demo
 * @Author 富贵
 * @Date 2023/10/25 14:51
 * @Version 1.0
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        //获取形状 Circle 的对象
        Shape shape1 = shapeFactory.getShape("circle");
        //调用Circle draw 的方法
        shape1.draw();

        //获取形状为 Rectangle 的对象
        Shape shape2 = shapeFactory .getShape("rectangle");
        //调用 Rectangle draw 的方法
        shape2.draw();

        //获取形状为 Square 的对象
        Shape shape3 = shapeFactory.getShape("square");
        //调用 Square draw 的方法
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        //获取颜色为Red的对象
        Color color1 = colorFactory.getColor("red");
        //调用Red的fill的方法
        color1.fill();


        //获取颜色为Green的对象
        Color color2 = colorFactory.getColor("Green");
        //调用Green的fill的方法
        color2.fill();

        //获取颜色为Blue的对象
        Color color3 = colorFactory.getColor("Blue");
        //调用Red的fill的方法
        color3.fill();
    }
}
