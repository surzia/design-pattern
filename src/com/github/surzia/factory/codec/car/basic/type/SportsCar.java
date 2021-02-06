package com.github.surzia.factory.codec.car.basic.type;

import com.github.surzia.factory.codec.car.basic.components.Car;
import com.github.surzia.factory.codec.car.basic.components.Color;
import com.github.surzia.factory.codec.car.basic.components.Fuel;

public class SportsCar implements Car {

    @Override
    public Color color() {
        return Color.WHITE;
    }

    @Override
    public Fuel fuel() {
        return Fuel.ENERGY;
    }

    @Override
    public int doors() {
        return 2;
    }

    public boolean cruiseControl() {
        return false;
    }

    public boolean energyHeatControl() {
        return true;
    }

    public boolean fourWheelSteering() {
        return true;
    }

    public boolean headLightIntake() {
        return true;
    }

    @Override
    public String toString() {
        String cruise;
        String energy;
        String wheel;
        String head;
        if (cruiseControl()) cruise = "能";
        else cruise = "不能";
        if (energyHeatControl()) energy = "能";
        else energy = "不能";
        if (fourWheelSteering()) wheel = "能";
        else wheel = "不能";
        if (headLightIntake()) head = "能";
        else head = "不能";
        return "可以生产跑车，属性如下：\n" +
                "颜色：" + color().getName() +
                "\t" +
                "燃料：" + fuel().getName() +
                "\t" +
                doors() + "开门" +
                "\t" +
                cruise + "巡航控制" +
                "\t" +
                energy + "能量热控制" +
                "\t" +
                wheel + "四轮转向" +
                "\t" +
                head + "头灯进气";
    }
}
