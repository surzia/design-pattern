package com.github.surzia.factory.codec.car.basic.type;

import com.github.surzia.factory.codec.car.basic.components.Car;
import com.github.surzia.factory.codec.car.basic.components.Color;
import com.github.surzia.factory.codec.car.basic.components.Fuel;

public class ModernCar implements Car {

    @Override
    public Color color() {
        return Color.RED;
    }

    @Override
    public Fuel fuel() {
        return Fuel.DIESEL;
    }

    @Override
    public int doors() {
        return 6;
    }

    public int safetyBags() {
        return 4;
    }

    public boolean cruiseControl() {
        return true;
    }

    public void music() {
        System.out.println("播放音乐中...");
    }

    @Override
    public String toString() {
        String cruise;
        if (cruiseControl()) cruise = "能";
        else cruise = "不能";
        return "可以生产现代汽车，属性如下：\n" +
                "颜色：" + color().getName() +
                "\t" +
                "燃料：" + fuel().getName() +
                "\t" +
                doors() + "开门" +
                "\t" +
                safetyBags() + "安全气囊" +
                "\t" +
                cruise + "巡航控制";
    }
}
