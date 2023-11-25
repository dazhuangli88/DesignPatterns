package BridgePattern;

/**
 * @Author 富贵
 * @Date 2023/10/27 12:42
 * @Version 1.0
 */
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
