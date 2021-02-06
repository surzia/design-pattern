package com.github.surzia.factory.codec.car;

import com.github.surzia.factory.codec.car.basic.AbstractCarFactory;
import com.github.surzia.factory.codec.car.basic.type.ClassicCar;
import com.github.surzia.factory.codec.car.basic.type.ModernCar;
import com.github.surzia.factory.codec.car.basic.type.SportsCar;

public class ModernCarFactory implements AbstractCarFactory {

    @Override
    public ClassicCar createClassicCar() {
        return new ClassicCar();
    }

    @Override
    public ModernCar createModernCar() {
        return new ModernCar();
    }

    @Override
    public SportsCar createSportsCar() {
        return null;
    }
}
