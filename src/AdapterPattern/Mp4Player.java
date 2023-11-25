package AdapterPattern;

/**
 * @Author 富贵
 * @Date 2023/10/27 11:41
 * @Version 1.0
 */
public class Mp4Player implements AdvancedMediaPlayer{


    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file.Name:" + fileName);

    }
}
