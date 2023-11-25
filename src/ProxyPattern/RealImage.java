package ProxyPattern;

/**
 * @Author 富贵
 * @Date 2023/10/25 15:39
 * @Version 1.0
 */
public class RealImage implements Image{
    private String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    @Override
    public void display() {
        System.out.println("Display" + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("loading" + fileName);
    }
}
