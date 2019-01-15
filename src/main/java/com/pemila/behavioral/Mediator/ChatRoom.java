package com.pemila.behavioral.Mediator;

import com.pemila.util.Logs;

import java.util.Date;

/**
 * 中介者类
 * @author： 月在未央
 * @date： 2019/1/15 15:58
 */
public class ChatRoom {
    public static void showMessage(User user,String message){
        Logs.info("------{}----",new Date());
        Logs.info("{}:",user.getName());
        Logs.info(message);
    }
}
