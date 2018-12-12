package com.pemila.structural.adapter.impl;

import com.pemila.structural.adapter.interfacee.VideoPlayer;
import com.pemila.util.Logs;

/**
 * 2.实现视频播放接口
 * @author： 月在未央
 * @date： 2018/12/12 14:24
 * @Description：
 */
public class VideoPlayImpl implements VideoPlayer {
    @Override
    public void play(String audioType, String fileName) {
        Logs.info("播放{}：{}",audioType,fileName);
    }
}
