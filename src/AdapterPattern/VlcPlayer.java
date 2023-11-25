package AdapterPattern;

/**
 * @Author 富贵
 * @Date 2023/10/27 11:34
 * @Version 1.0
 */
public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file.Name:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
