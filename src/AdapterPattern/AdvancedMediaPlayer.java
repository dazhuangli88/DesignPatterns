package AdapterPattern;

/**
 * @Author 富贵
 * @Date 2023/10/27 11:31
 * @Version 1.0
 */
public interface AdvancedMediaPlayer {
    /**
     * 播放 VLC媒体文件
     */
    public void playVlc(String fileName);

    /**
     * 播放 MP4媒体文件
     */

    public void playMp4(String fileName);
}
