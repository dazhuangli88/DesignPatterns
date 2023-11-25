package IteratorPattern;

/**
 * @Author 富贵
 * @Date 2023/10/25 18:05
 * @Version 1.0
 */
public interface Container {
    /**
     * 获得迭代器，需要具体的实现
     * @return 迭代器
     */
    public Iterator getIterator();
}
