package MediatorPattern;

import java.util.Date;

/**
 * @Author 富贵
 * @Date 2023/10/26 11:40
 * @Version 1.0
 */
public class ChatRoom {
    public static void showMessage(User user,String message){
        System.out.println(new Date().toString()
                            + "[" + user.getName() + "] : " + message);

    }
}
