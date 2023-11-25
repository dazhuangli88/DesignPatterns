package IteratorPattern;

/**
 * @Author 富贵
 * @Date 2023/10/25 18:10
 * @Version 1.0
 */
public class NameRepository implements Container {
    public String[] names = {"red", "yellow", "green"};

    /**
     * 获得迭代器
     */
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    /**
     * 内部类是名字迭代器的具体实现
     * 内部类实现能直接访问到names这个数组，
     * 且GetIterator方法需要返回一个Iterator对象，所以需要使用内部类进行实现
     */
    private class NameIterator implements Iterator {

        /**
         * 游标
         */
        int index;

        public boolean hasNext() {
            //游标小于数组长度，证明有下一位，故返回true
            if (index < names.length) {
                return true;
            }
            return false;
        }

        public Object next() {
            //检查是否有下一位
            if (this.hasNext()) {
                //获得数组的对象后游标下移
                return names[index++];
            }
            return null;
        }
    }
}
