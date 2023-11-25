package AdapterPattern;

/**
 * @Author 富贵
 * @Date 2023/10/27 12:24
 * @Version 1.0
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "fly.mp3");
        audioPlayer.play("mp4", "good.mp4");
        audioPlayer.play("vlc", "red.vlc");
        audioPlayer.play("avi", "duck.avi");

    }
}
