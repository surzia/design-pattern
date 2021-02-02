package com.github.surzia.state.codec.television;

import java.util.Random;

public class OpenTvState implements TvState {

    public OpenTvState() {
        System.out.println("你打开了电视");
    }

    @Override
    public void shutdown(Context context) {
        context.setState(new CloseTvState());
    }

    @Override
    public void turn(Context context) {
        System.out.println("电视已经开了");
    }

    @Override
    public void change(Context context) {
        System.out.printf("你正在观看%s台\n", context.getTv().getStation()[new Random().nextInt(10)]);
    }
}
