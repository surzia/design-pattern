package com.github.surzia.proxy.codec.image;

public interface Image {

    void load();

    void show();

    void showSummary();

    void resize();

    void remove();

    void close();
}
