package AbstractFactory;

/**
 * 重点：生产工厂
 * @Author 富贵
 * @Date 2023/10/25 14:37
 * @Version 1.0
 */
public class FactoryProducer {
    /**
     * 获得工厂
     * @param choice 工厂选择
     * @return 工厂对象
     */
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}

