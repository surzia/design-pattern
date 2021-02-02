package com.github.surzia.state.codec.goods;

public class OutForDelivery implements GoodsState {

    public OutForDelivery() {
        super();
    }

    @Override
    public String name() {
        return "货物正在配送";
    }

    @Override
    public void processGoods(GoodsContext context) {
        Goods goods = context.getGoods();
        System.out.printf("订单#'%s'的货物'%s'目前状态为'%s'。\n已配送到'%s'\n", goods.getOrderNumber(),
                goods.getOrderItem(), name(), goods.getDeliveryAddress());
        System.out.println("--------------------------------------------------------------");
        if (context.isCustomerAtLocation()) {
            context.setState(new Delivered());
        } else {
            context.setState(new DeliveryAttempted("Customer not at Home!"));
        }
    }
}
