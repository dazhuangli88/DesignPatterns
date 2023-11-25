package DecoratorPatternDecorator;

/**
 * @Author 富贵
 * @Date 2023/10/27 18:08
 * @Version 1.0
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        //***重写画图形方法，拓展了一个画红色边框的功能
        setRedBorder(decoratedShape);

    }


        /**
         * 设置红色边框
         *
         * @param decoratedShape
         */
        private void setRedBorder(Shape decoratedShape) {
            System.out.println("Border Color:Red");
        }
    }

