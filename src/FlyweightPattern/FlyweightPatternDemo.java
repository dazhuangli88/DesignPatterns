package FlyweightPattern;

/**
 * @Author 富贵
 * @Date 2023/10/27 19:43
 * @Version 1.0
 */
public class FlyweightPatternDemo {
    private static final String colors[]= {"Red","Green","Blue","White"};

    public static void main(String[] args) {

        for(int i = 0; i < 20; ++i){
            Circle circle= (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.draw();
        }
    }

    private static int getRandomY() {
        return (int)(Math.random() * 100);


    }

    private static int getRandomX() {
        return (int)(Math.random() * 100);

    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];

    }
}
