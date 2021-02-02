package com.github.surzia.state.codec.goods;

public class DeliveryAttempted implements GoodsState {

    protected String reasonForUndelivered;

    public DeliveryAttempted(String reasonForUndelivered) {
        super();
        this.reasonForUndelivered = reasonForUndelivered;
    }

    @Override
    public String name() {
        return "配送失败";
    }

    @Override
    public void processGoods(GoodsContext context) {
        Goods goods = context.getGoods();
        System.out.printf("订单#'%s'的货物'%s'目前状态为'%s'。\n已配送到'%s'\n", goods.getOrderNumber(),
                goods.getOrderItem(), name(), goods.getDeliveryAddress());
        System.out.println("--------------------------------------------------------------");
        context.setCustomerAtLocation(true);
        context.setState(new OutForDelivery());
    }

    public String getReasonForUndelivered() {
        return reasonForUndelivered;
    }

    public void setReasonForUndelivered(String reasonForUndelivered) {
        this.reasonForUndelivered = reasonForUndelivered;
    }
}
