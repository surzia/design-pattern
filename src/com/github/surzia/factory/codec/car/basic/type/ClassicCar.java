package com.github.surzia.factory.codec.car.basic.type;

import com.github.surzia.factory.codec.car.basic.components.Car;
import com.github.surzia.factory.codec.car.basic.components.Color;
import com.github.surzia.factory.codec.car.basic.components.Fuel;

public class ClassicCar implements Car {

    @Override
    public Color color() {
        return Color.BLACK;
    }

    @Override
    public Fuel fuel() {
        return Fuel.GASOLINE;
    }

    @Override
    public int doors() {
        return 4;
    }

    @Override
    public String toString() {
        return "可以生产旧汽车，属性如下：\n" +
                "颜色：" + color().getName() +
                "\t" +
                "燃料：" + fuel().getName() +
                "\t" +
                doors() + "开门";
    }
}
