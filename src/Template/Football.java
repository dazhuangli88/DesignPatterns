package Template;

/**
 * @Author 富贵
 * @Date 2023/10/25 16:17
 * @Version 1.0
 */
public class Football extends Game{

    @Override
    void initialize() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started.Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");

    }
}
