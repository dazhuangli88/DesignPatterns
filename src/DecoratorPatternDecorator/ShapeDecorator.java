package DecoratorPatternDecorator;

/**
 * ***实现了Shape接口的抽象装饰类
 *
 * @Author 富贵
 * @Date 2023/10/27 17:59
 * @Version 1.0
 */
public abstract class ShapeDecorator implements Shape{
    protected  Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();


    }


}
