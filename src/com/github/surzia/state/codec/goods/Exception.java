package com.github.surzia.state.codec.goods;

public class Exception implements GoodsState {

    protected String exceptionMsg;

    public Exception(String exceptionMsg) {
        super();
        this.exceptionMsg = exceptionMsg;
    }

    @Override
    public String name() {
        return "异常";
    }

    @Override
    public void processGoods(GoodsContext context) {
        Goods goods = context.getGoods();
        exceptionMsg = "货物已成功配送";
        System.out.printf("订单#'%s'的货物'%s'目前状态为'%s (%s)'。\n已配送到'%s'\n", goods.getOrderNumber(),
                goods.getOrderItem(), name(), exceptionMsg, goods.getDeliveryAddress());
        System.out.println("--------------------------------------------------------------");
        context.setState(new Returned());
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }
}
