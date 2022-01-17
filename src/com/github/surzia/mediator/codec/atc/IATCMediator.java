package com.github.surzia.mediator.codec.atc;

public interface IATCMediator {

    void registerRunway(Runway runway);

    void registerFlight(Flight flight);

    boolean isLandingOk();

    void setLandingStatus(boolean status);
}
