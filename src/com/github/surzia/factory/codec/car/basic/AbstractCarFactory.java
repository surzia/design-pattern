package com.github.surzia.factory.codec.car.basic;

import com.github.surzia.factory.codec.car.basic.type.ClassicCar;
import com.github.surzia.factory.codec.car.basic.type.ModernCar;
import com.github.surzia.factory.codec.car.basic.type.SportsCar;

public interface AbstractCarFactory {

    ClassicCar createClassicCar();

    ModernCar createModernCar();

    SportsCar createSportsCar();
}
