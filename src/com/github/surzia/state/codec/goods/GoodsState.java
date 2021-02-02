package com.github.surzia.state.codec.goods;

public interface GoodsState {

    String name();

    void processGoods(GoodsContext context);
}
