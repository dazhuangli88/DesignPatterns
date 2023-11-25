package Template;

import java.sql.SQLOutput;

/**
 * @Author 富贵
 * @Date 2023/10/25 16:19
 * @Version 1.0
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        //new Cricket对象，故在play的时候也是调用Cricket的具体实现
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
