package com.github.surzia.state.codec.goods;

public class ProcessingStock implements GoodsState {

    public ProcessingStock() {
        super();
    }

    @Override
    public String name() {
        return "仓库已出货";
    }

    @Override
    public void processGoods(GoodsContext context) {
        Goods goods = context.getGoods();
        System.out.printf("订单#'%s'的货物'%s'目前状态为'%s'。\n下一站发往'%s'\n", goods.getOrderNumber(), goods.getOrderItem(), name(), goods.getDeliveryAddress());
        System.out.println("--------------------------------------------------------------");
        context.setState(new ReadyForPacking());
    }
}
