package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println("Average number of posts for users older than 40: " + UserRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(v -> v.getNumberOfPost())
                .average()
                .getAsDouble());
        System.out.println("Average number of posts for users younger than 40: " + UserRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(v -> v.getNumberOfPost())
                .average()
                .getAsDouble());
    }
}