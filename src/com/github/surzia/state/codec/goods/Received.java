package com.github.surzia.state.codec.goods;

public class Received implements GoodsState {

    public Received() {
        super();
    }

    @Override
    public String name() {
        return "签收成功";
    }

    @Override
    public void processGoods(GoodsContext context) {
        Goods goods = context.getGoods();
        System.out.printf("订单#'%s'的货物'%s'目前状态为'%s'。\n已配送到'%s'\n", goods.getOrderNumber(),
                goods.getOrderItem(), name(), goods.getDeliveryAddress());
        System.out.println("--------------------------------------------------------------");
    }
}
