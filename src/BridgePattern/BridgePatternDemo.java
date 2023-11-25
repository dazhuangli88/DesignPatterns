package BridgePattern;

/**
 * @Author 富贵
 * @Date 2023/10/27 12:50
 * @Version 1.0
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        //*** 此处new RedCircle(),是为了能够画出不同颜色的圆形
        Shape redCircle = new Circle(50,50,5,new RedCircle());
        Shape greenCircle = new Circle(50,50,5,new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
