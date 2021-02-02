package com.github.surzia.state.codec.goods;

import java.util.List;

public class DeliveryInProgress implements GoodsState {

    protected List<Location> goodsItinerary;

    public DeliveryInProgress(List<Location> locations) {
        super();
        this.goodsItinerary = locations;
    }

    @Override
    public String name() {
        return "货物正在路上";
    }

    @Override
    public void processGoods(GoodsContext context) {
        int currentLocationIndex = context.getCurrentLocationIndex();
        Goods goods = context.getGoods();
        System.out.printf(
                "订单#'%s'的货物'%s'目前状态为'%s'。\n下一站发往'%s'，目前位于'%s'\n",
                goods.getOrderNumber(), goods.getOrderItem(), name(), goods.getDeliveryAddress(),
                goodsItinerary.get(currentLocationIndex++));
        System.out.println("--------------------------------------------------------------");
        if (currentLocationIndex == (goodsItinerary.size() - 1)) {
            context.setState(new OutForDelivery());
        } else {
            context.setCurrentLocationIndex(currentLocationIndex);
        }
    }
}
