package com.github.surzia.state.codec.television;

public class TV {

    protected int[] station = new int[10];

    public TV() {
        for (int i = 0; i < 10; i++) {
            station[i] = i;
        }
    }

    public int[] getStation() {
        return station;
    }

    public void setStation(int[] station) {
        this.station = station;
    }
}
