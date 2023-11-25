package MediatorPattern;

/**
 * @Author 富贵
 * @Date 2023/10/26 11:44
 * @Version 1.0
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sendMessage(String message){
        //***聊天室发送消息
        ChatRoom.showMessage(this,message);
    }
}
