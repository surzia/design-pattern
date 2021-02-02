package com.github.surzia.state.codec.goods;

public class GoodsContext {

    protected Goods goods;
    protected GoodsState state;
    protected boolean customerAtLocation = false;
    protected int currentLocationIndex = 0;

    public GoodsContext(Goods goods) {
        this.goods = goods;
        this.state = new OrderPlaced();
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public GoodsState getState() {
        return state;
    }

    public void setState(GoodsState state) {
        this.state = state;
    }

    public boolean isCustomerAtLocation() {
        return customerAtLocation;
    }

    public void setCustomerAtLocation(boolean customerAtLocation) {
        this.customerAtLocation = customerAtLocation;
    }

    public int getCurrentLocationIndex() {
        return currentLocationIndex;
    }

    public void setCurrentLocationIndex(int currentLocationIndex) {
        this.currentLocationIndex = currentLocationIndex;
    }

    public void process() {
        state.processGoods(this);
    }
}
