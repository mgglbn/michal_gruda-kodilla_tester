package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        boolean isViennaInUse = false;
        try {
            isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status: " + isViennaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Airport not available");
        } finally {
            System.out.println("Thank you");
        }
    }
}
