package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    private static List<Flight> flights = new ArrayList<>(List.of(
            new Flight("LUZ", "DUB"),
            new Flight("LUZ", "TRF"),
            new Flight("LUZ", "DSA"),
            new Flight("LUZ", "LTN"),
            new Flight("LUZ", "WAW"),
            new Flight("LUZ", "GDN"),
            new Flight("WAW", "LUZ"),
            new Flight("WAW", "MUN"),
            new Flight("WAW", "LTN"),
            new Flight("LTN", "LUZ"),
            new Flight("LTN", "WAW"),
            new Flight("LTN", "MUN"),
            new Flight("TRF", "LUZ"),
            new Flight("TRF", "LTN"),
            new Flight("TRF", "WAW"),
            new Flight("TRF", "MUN")
    ));


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