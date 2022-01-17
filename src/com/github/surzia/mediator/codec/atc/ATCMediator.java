package com.github.surzia.mediator.codec.atc;

public class ATCMediator implements IATCMediator {

    public boolean land;

    public void registerRunway(Runway runway) {
    }

    public void registerFlight(Flight flight) {
    }

    public boolean isLandingOk() {
        return land;
    }

    @Override
    public void setLandingStatus(boolean status) {
        land = status;
    }
}
