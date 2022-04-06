package com.kodilla.stream;

public class UserManager {
    public static void main(String[] args) {
        UserRepository.getUserList().stream().map(u -> u.getUsername()).forEach(un-> System.out.println(un));
    }
}
