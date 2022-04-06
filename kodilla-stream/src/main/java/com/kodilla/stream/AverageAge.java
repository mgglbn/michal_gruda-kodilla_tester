package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        double average = UserRepository.getUserList()
                .stream()
                .mapToInt(u -> u.getAge())
                .average()
                .getAsDouble();
        System.out.println(average);


    }
}
