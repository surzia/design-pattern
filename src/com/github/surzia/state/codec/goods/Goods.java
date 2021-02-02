package com.github.surzia.state.codec.goods;

public class Goods {

    protected String orderNumber;
    protected String orderItem;
    protected String goodsNumber;
    protected Location deliveryAddress;

    public Goods(String orderNumber, String orderItem, Location deliveryAddress) {
        this.orderNumber = orderNumber;
        this.orderItem = orderItem;
        this.deliveryAddress = deliveryAddress;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(String orderItem) {
        this.orderItem = orderItem;
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Location getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Location deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
