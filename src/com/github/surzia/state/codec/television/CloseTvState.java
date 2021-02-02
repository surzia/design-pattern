package com.github.surzia.state.codec.television;

public class CloseTvState implements TvState {

    public CloseTvState() {
        System.out.println("你关掉了电视");
    }

    @Override
    public void shutdown(Context context) {
        System.out.println("电视已经关了");
    }

    @Override
    public void turn(Context context) {
        context.setState(new OpenTvState());
    }

    @Override
    public void change(Context context) {
        System.out.println("电视关了无法调台！");
    }
}
