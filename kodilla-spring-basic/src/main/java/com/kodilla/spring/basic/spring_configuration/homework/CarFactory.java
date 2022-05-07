package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CarFactory {

    @Bean
    @Scope(value = "prototype")
    public Car createCar(Seasons season) {
        switch (season) {
            case WINTER:
                return new SUV();
            case SPRING:
            case AUTUMN:
                return new Sedan();
            case SUMMER:
                return new Cabrio();
        }
        return null;
    }
}