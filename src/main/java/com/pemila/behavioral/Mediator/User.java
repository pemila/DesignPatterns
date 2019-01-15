package com.pemila.behavioral.Mediator;

import lombok.Data;

/**
 * @author： 月在未央
 * @date： 2019/1/15 15:59
 */
@Data
public class User {
    private String name;

    public User(String name){
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
