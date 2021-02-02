package com.github.surzia.state.codec.goods;

public class Delivered implements GoodsState {

    protected String deliveryNote;

    public Delivered() {
        super();
    }

    @Override
    public String name() {
        return "配送成功";
    }

    @Override
    public void processGoods(GoodsContext context) {
        Goods goods = context.getGoods();
        deliveryNote = "货物已成功配送";
        System.out.printf("订单#'%s'的货物'%s'目前状态为'%s (%s)'。\n已配送到'%s'\n", goods.getOrderNumber(),
                goods.getOrderItem(), name(), deliveryNote, goods.getDeliveryAddress());
        System.out.println("--------------------------------------------------------------");
        context.setState(new Received());
    }

    public String getDeliveryNote() {
        return deliveryNote;
    }

    public void setDeliveryNote(String deliveryNote) {
        this.deliveryNote = deliveryNote;
    }
}
