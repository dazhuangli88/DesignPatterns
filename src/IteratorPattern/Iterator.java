package IteratorPattern;

/**
 * @Author 富贵
 * @Date 2023/10/25 18:06
 * @Version 1.0
 */
public interface Iterator {
    /**
     * 是否存在下一个元素
     */
    public boolean hasNext();


    /**
     * 指标游向下一位
     * @return 下一位的对象
     */
    public Object next();




}
