package com.pemila.structural.adapter;

import com.pemila.structural.adapter.MusicAdapter;
import com.pemila.structural.adapter.interfacee.MusicPlayer;
import com.pemila.util.Logs;

/**
 * 4.创建音乐播放器类，继承适配器类
 * @author： 月在未央
 * @date： 2018/12/12 14:23
 * @Description：
 */
public class MusicPlayerImpl extends MusicAdapter {
    @Override
    public void playMP3(String fileName) {
        Logs.info("播放MP3:{}",fileName);
    }
}
