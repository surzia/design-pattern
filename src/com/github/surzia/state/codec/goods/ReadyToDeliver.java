package com.github.surzia.state.codec.goods;

public class ReadyToDeliver implements GoodsState {

    public ReadyToDeliver() {
        super();
    }

    @Override
    public String name() {
        return "货物已发货";
    }

    @Override
    public void processGoods(GoodsContext context) {
        Goods goods = context.getGoods();
        System.out.printf("订单#'%s'的货物'%s'目前状态为'%s'。\n下一站发往'%s'\n", goods.getOrderNumber(), goods.getOrderItem(), name(), goods.getDeliveryAddress());
        System.out.println("--------------------------------------------------------------");
        Location origin = new Location(
                "CN",
                "北京市",
                "昌平区",
                "北京",
                "中国",
                "102200"
        );
        context.setState(new DeliveryInProgress(ItineraryFinder.find(origin, context.getGoods().getDeliveryAddress())));
    }
}
