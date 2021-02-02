package com.github.surzia.state.codec;

import com.github.surzia.state.codec.goods.Goods;
import com.github.surzia.state.codec.goods.GoodsContext;
import com.github.surzia.state.codec.goods.GoodsState;
import com.github.surzia.state.codec.goods.Location;
import com.github.surzia.state.codec.television.Context;
import com.github.surzia.state.codec.television.TV;

public class state {

    public static void main(String[] args) {
//        new state().television();
        new state().goods();
    }

    private void television() {
        //初始化电视
        TV tv = new TV();
        //初始化环境，此时电视默认被打开
        Context context = new Context(tv);
        //调台，随机输出一个电视台
        context.switchTv();
        //关掉电视
        context.turnOff();
        //再调台，这时会提示电视已经关了无法调台
        context.switchTv();
        //再打开电视
        context.turnOn();
        //再调台，随机输出一个电视台
        context.switchTv();
    }

    private void goods() {
        Goods goods = new Goods(
                "OD12345FL9J6NY17E",
                "HUAWEI Mate 40 Pro 5G 全网通 8GB+256GB（亮黑色）",
                new Location(
                        "CN",
                        "上海市",
                        "浦东新区",
                        "上海",
                        "中国",
                        "200120"
                )
        );
        GoodsContext context = new GoodsContext(goods);
        while (notReceived(context.getState())) {
            context.process();
        }
    }

    private static boolean notReceived(GoodsState currentState) {
        return !"签收成功".equals(currentState.name());
    }
}
