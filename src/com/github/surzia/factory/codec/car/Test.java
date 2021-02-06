package com.github.surzia.factory.codec.car;

import com.github.surzia.factory.codec.car.basic.AbstractCarFactory;
import com.github.surzia.factory.codec.car.basic.type.ClassicCar;
import com.github.surzia.factory.codec.car.basic.type.ModernCar;
import com.github.surzia.factory.codec.car.basic.type.SportsCar;

public class Test {

    public static void main(String[] args) {
        AbstractCarFactory classicCarFactory = new ClassicCarFactory();
        AbstractCarFactory modernCarFactory = new ModernCarFactory();
        AbstractCarFactory sportsCarFactory = new SportsCarFactory();
        System.out.println("==========旧汽车工厂==========");
        print(classicCarFactory);
        System.out.println("============================");
        System.out.println("==========现代汽车工厂==========");
        print(modernCarFactory);
        System.out.println("=============================");
        System.out.println("==========跑车工厂==========");
        print(sportsCarFactory);
        System.out.println("==========================");
    }

    private static void print(AbstractCarFactory carFactory) {
        ClassicCar classicCar;
        ModernCar modernCar;
        SportsCar sportsCar;
        classicCar = carFactory.createClassicCar();
        if (classicCar == null) {
            System.out.println("不能生产旧汽车");
        } else {
            System.out.println(classicCar.toString());
        }
        modernCar = carFactory.createModernCar();
        if (modernCar == null) {
            System.out.println("不能生产现代汽车");
        } else {
            System.out.println(modernCar.toString());
            modernCar.music();
        }
        sportsCar = carFactory.createSportsCar();
        if (sportsCar == null) {
            System.out.println("不能生产跑车");
        } else {
            System.out.println(sportsCar.toString());
        }
    }
}
