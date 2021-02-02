package com.github.surzia.state.codec.television;

public interface TvState {

    //关掉电视
    void shutdown(Context context);

    //打开电视
    void turn(Context context);

    //调台
    void change(Context context);
}
