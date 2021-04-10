package com.github.surzia.builder.codec;

public interface CarBuilder {

    // Step 1
    CarBuilder fixChassis();

    // Step 2
    CarBuilder fixBody();

    // Step 3
    CarBuilder paint();

    // Step 4
    CarBuilder fixInterior();

    // delivery of car
    Car build();
}
