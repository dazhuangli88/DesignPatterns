package AdapterPattern;

/**
 * 音屏播放器
 * @Author 富贵
 * @Date 2023/10/27 12:14
 * @Version 1.0
 */
public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;

    /**
     * ***播放文件，既能支持视频播放也能支持音频播放
     *
     * @param audioType
     * @param fileName
     */
    @Override
    public void play(String audioType, String fileName) {

        //播放 MP3 音乐文件的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        //mediaAdapter 提供了播放其它文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc")
                 || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else{
            System.out.println("Invalid media." + audioType + "format not supported");
        }
    }
}
