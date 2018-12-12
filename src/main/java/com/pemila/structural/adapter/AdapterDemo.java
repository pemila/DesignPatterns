package com.pemila.structural.adapter;

/**
 * @author： 月在未央
 * @date： 2018/12/12 15:00
 * @Description：
 */
public class AdapterDemo {
    public static void main(String[] args) {

        MusicPlayerImpl player = new MusicPlayerImpl();

        player.play("mp3","歌唱祖国");
        player.play("mv","疯狂动物城");
        player.play("avi","世界真奇妙");
        player.play("lalala","想唱就唱");
    }
}
