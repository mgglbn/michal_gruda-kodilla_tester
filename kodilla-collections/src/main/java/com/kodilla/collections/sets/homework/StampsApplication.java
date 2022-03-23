package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("Stamp A", 40, 30, true));
        stamps.add(new Stamp("Stamp B", 40, 29, true));
        stamps.add(new Stamp("Stamp C", 42, 28, false));
        stamps.add(new Stamp("Stamp D", 38, 30, true));
        stamps.add(new Stamp("Stamp E", 39, 30, false));
        stamps.add(new Stamp("Stamp A", 41, 30, true));

        System.out.println("Stamps quantity: " + stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }

        stamps.add(new Stamp("Stamp A", 40, 30, true));
        stamps.add(new Stamp("Stamp B", 40, 29, true));
        stamps.add(new Stamp("Stamp C", 42, 28, false));
        stamps.add(new Stamp("Stamp D", 38, 30, true));
        stamps.add(new Stamp("Stamp E", 39, 30, false));
        stamps.add(new Stamp("Stamp A", 41, 30, true));

        System.out.println("Stamps quantity: " + stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}