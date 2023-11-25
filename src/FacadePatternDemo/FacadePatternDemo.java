package FacadePatternDemo;

/**
 * @Author 富贵
 * @Date 2023/10/27 18:51
 * @Version 1.0
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
