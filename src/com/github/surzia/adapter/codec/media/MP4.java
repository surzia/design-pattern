package com.github.surzia.adapter.codec.media;

public class MP4 implements MediaPackage {

    @Override
    public void playFile(String name) {
        System.out.println("Playing MP4 File " + name);
    }
}
