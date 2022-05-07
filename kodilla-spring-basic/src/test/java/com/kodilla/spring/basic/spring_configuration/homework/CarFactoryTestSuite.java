package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarFactoryTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

    @Test
    public void shouldGetSedanInAutumn() {
        Car car = (Car) context.getBean("createCar", Seasons.AUTUMN);
        assertEquals("Sedan", car.getCarType());
        assertEquals(Sedan.class, car.getClass());
    }

    @Test
    public void shouldGetSedanInSpring() {
        Car car = (Car) context.getBean("createCar", Seasons.SPRING);
        assertEquals("Sedan", car.getCarType());
        assertEquals(Sedan.class, car.getClass());
    }

    @Test
    public void shouldGetSUVinWinter() {
        Car car = (Car) context.getBean("createCar", Seasons.WINTER);
        assertEquals("SUV", car.getCarType());
        assertEquals(SUV.class, car.getClass());
    }

    @Test
    public void shouldGetCabrioinSummer() {
        Car car = (Car) context.getBean("createCar", Seasons.SUMMER);
        assertEquals("Cabrio", car.getCarType());
        assertEquals(Cabrio.class, car.getClass());
    }

    @ParameterizedTest
    @CsvSource(value = {"20,0", "6,0", "12,0"})
    public void shouldHaveHeadLightTurnedOff(int hour, int minute) {
        Random generator = new Random();
        Seasons[] seasons = Seasons.values();
        Seasons season = seasons[generator.nextInt(seasons.length)];
        Car car = (Car) context.getBean("createCar", season);
        assertFalse(car.hasHeadLightTurnedOn(LocalTime.of(hour, minute)));
    }

    @ParameterizedTest
    @CsvSource(value = {"20,1", "5,59", "0,0", "23,59"})
    public void shouldHaveHeadLightTurnedOn(int hour, int minute) {
        Random generator = new Random();
        Seasons[] seasons = Seasons.values();
        Seasons season = seasons[generator.nextInt(seasons.length)];
        Car car = (Car) context.getBean("createCar", season);
        assertFalse(car.hasHeadLightTurnedOn(LocalTime.of(hour, minute)));
    }
}