package BridgePattern;

/**
 * 画圈——图形抽象类的具体实现
 * @Author 富贵super(drawAPI);
 * @Date 2023/10/27 12:45
 * @Version 1.0
 */
public class Circle extends Shape{
    private int x, y, radius;

    public Circle(int x, int y,int radius,DrawAPI drawAPI){
        //***super(drawAPI);
        super(drawAPI);
        this.x = y;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
