package com.github.surzia.adapter.codec.media;

public class FormatAdapter implements MediaPlayer {

    private final MediaPackage media;

    public FormatAdapter(MediaPackage media) {
        this.media = media;
    }

    @Override
    public void play(String source) {
        System.out.print("Using Adapter --> ");
        media.playFile(source);
    }
}
