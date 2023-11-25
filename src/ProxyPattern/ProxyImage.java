package ProxyPattern;

/**
 * @Author 富贵
 * @Date 2023/10/25 15:44
 * @Version 1.0
 */
public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    /**
     * 构造方法，只有一个记录传入fileName作用
     * @param
     */

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            // 通过代理来调用实际的代码
            // 这样用户在调用的时候并不需要知道还要调用RealImage的loadFromDisk方法
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
