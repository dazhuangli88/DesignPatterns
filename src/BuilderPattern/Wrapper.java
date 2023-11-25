package BuilderPattern;

/**
 * 包装类
 * 打包接口的实现
 * @Author 富贵
 * @Date 2023/10/26 17:57
 * @Version 1.0
 */
public class Wrapper implements Packing{

    @Override
    public String pack() {
        return "Wrapper";
    }
}
