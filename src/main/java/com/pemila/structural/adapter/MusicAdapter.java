package com.pemila.structural.adapter;

import com.pemila.structural.adapter.impl.VideoPlayImpl;
import com.pemila.structural.adapter.interfacee.MusicPlayer;
import com.pemila.util.Logs;

/**
 * 3.创建一个音乐播放器适配器，实现音乐播放器接口，同时依赖视频播放器
 * @author： 月在未央
 * @date： 2018/12/12 14:51
 * @Description：
 */
public class MusicAdapter implements MusicPlayer {

    VideoPlayImpl videoPlay;

    @Override
    public void playMP3(String fileName) {}

    public void play(String audioType,String fileName){
        videoPlay = new VideoPlayImpl();
        switch (audioType){
            case "mp4":
            case "avi":
            case "mv":
                videoPlay.play(audioType,fileName);
                break;
            case "mp3":
                playMP3(fileName);
                break;
            default:
                Logs.info("this audio type is not support");
        }

    }
}
