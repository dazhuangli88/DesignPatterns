package Template;

/**
 * @Author 富贵
 * @Date 2023/10/25 16:13
 * @Version 1.0
 */
public class Cricket extends Game{

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start Playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started.Enjoy the game!");

    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished！");

    }
}
