package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> principalSchoolMap = new HashMap<>();
        principalSchoolMap.put(new Principal("John", "Bravo"),
                new School("High School No. 1", 22, 32, 19));
        principalSchoolMap.put(new Principal("Jerzy", "Killer"),
                new School("High School No. 2", 27, 21, 22, 34, 12, 34, 12));
        principalSchoolMap.put(new Principal("Adam", "Słodowy"),
                new School("High School No. 3", 31, 32, 22, 23, 53));

        for (Map.Entry<Principal, School> principalSchool : principalSchoolMap.entrySet()) {
            System.out.println(principalSchool.getKey() + " is principal of " + principalSchool.getValue() +
                    " which has " + principalSchool.getValue().getNumberOfAllStudents() + " students");
        }
    }
}