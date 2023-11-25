package AdapterPattern;

/**
 * ***媒体播放器适配器
 * @Author 富贵
 * @Date 2023/10/27 11:45
 * @Version 1.0
 */
public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer  advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
             advancedMusicPlayer = new Mp4Player();

        }
    }



    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")) {
             advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);

        }
    }

}

