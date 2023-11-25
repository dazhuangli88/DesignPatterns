package PrototypePattern;

/**
 * 图形抽象类
 *
 * @Author 富贵
 * @Date 2023/10/26 19:45
 * @Version 1.0
 */
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }


    public void setId(String id) {
        this.id = id;
    }

    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }
}
