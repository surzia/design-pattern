package com.github.surzia.adapter.codec.media;

public class MP3 implements MediaPlayer {

    @Override
    public void play(String source) {
        System.out.println("Playing MP3 File " + source);
    }
}
