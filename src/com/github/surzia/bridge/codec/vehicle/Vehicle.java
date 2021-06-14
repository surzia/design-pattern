package com.github.surzia.bridge.codec.vehicle;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    protected List<WorkShop> workshops = new ArrayList<>();

    public Vehicle() {
        super();
    }

    public boolean joinWorkshop(WorkShop workshop) {
        return workshops.add(workshop);
    }

    public abstract void manufacture();

    public abstract int minWorkTime();
}
