package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    private static List<Flight> flights = new ArrayList<>();

    public static List<Flight> getFlightsTable() {
        return flights;
    }

    public static List<Flight> getFlightsTable(String airport) {
        List<Flight> flightsAtAirport = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getArrival().equals(airport) || flight.getDeparture().equals(airport)) {
                flightsAtAirport.add(flight);
            }
        }
        return flightsAtAirport;
    }

    public static void addFlight(Flight flight) {
        if (!flights.contains(flight)) {
            flights.add(flight);
        }
    }

    public static int size() {
        return flights.size();
    }
}