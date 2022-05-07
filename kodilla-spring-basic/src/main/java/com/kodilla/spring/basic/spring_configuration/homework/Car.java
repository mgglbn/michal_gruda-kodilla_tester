package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public interface Car {
    boolean hasHeadLightTurnedOn(LocalTime timeOfDay);

    String getCarType();
}