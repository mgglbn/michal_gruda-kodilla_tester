package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car {

    @Override
    public boolean hasHeadLightTurnedOn(LocalTime timeOfDay) {
        if (timeOfDay.isAfter(LocalTime.of(20, 0)) && timeOfDay.isBefore(LocalTime.of(6, 00)))
            return true;
        else
            return false;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}