package com.github.surzia.state.codec.goods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ItineraryFinder {

    public static List<Location> find(Location origin, Location deliveryAddress) {
        return Arrays.stream(new Location[]{
                origin,
                new Location("CN", "北京市", "海淀区", "北京", "中国", "100876"),
                new Location("CN", "北京市", "大兴区", "北京", "中国", "102600"),
                new Location("CN", "天津市", "天津市", "天津", "中国", "300000"),
                deliveryAddress
        }).collect(Collectors.toList());
    }
}
