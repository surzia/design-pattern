package com.github.surzia.state.codec.television;

public class Context {

    protected TV tv;
    protected TvState state;

    public Context(TV tv) {
        this.tv = tv;
        //OpenTvState代表电视机是开的状态
        state = new OpenTvState();
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public TvState getState() {
        return state;
    }

    public void setState(TvState state) {
        this.state = state;
    }

    public void switchTv() {
        this.state.change(this);
    }

    public void turnOn() {
        this.setState(new OpenTvState());
    }

    public void turnOff() {
        this.setState(new CloseTvState());
    }
}
