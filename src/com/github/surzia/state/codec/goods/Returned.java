package com.github.surzia.state.codec.goods;

public class Returned implements GoodsState {

    public Returned(){
        super();
    }

    @Override
    public String name() {
        return "退回";
    }

    @Override
    public void processGoods(GoodsContext context) {
        Goods goods = context.getGoods();
        System.out.printf("订单#'%s'的货物'%s'目前状态为'%s'。\n已配送到'%s'\n", goods.getOrderNumber(),
                goods.getOrderItem(), name(), goods.getDeliveryAddress());
        System.out.println("--------------------------------------------------------------");
    }
}
