package com.kodilla.spring.basic.spring_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class AnimalFactory {

    @Bean
    public Dog createDog(){
        return new Dog();
    }

    @Bean
    public Animal randomAnimal(){
        Random generator = new Random();
        int chosen = generator.nextInt(3);
        switch (chosen){
            case 0: return new Dog();
            case 1: return new Cat();
            case 2: return new Duck();
        }
        return null;
    }
}