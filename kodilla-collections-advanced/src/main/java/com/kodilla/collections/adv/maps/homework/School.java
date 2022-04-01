package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;

    private List<Integer> numberOfStudentsList = new ArrayList<>();

    public School(String name, int... numberOfStudentsList) {
        this.name = name;
        for (int numberOfStudents : numberOfStudentsList) {
            this.numberOfStudentsList.add(numberOfStudents);
        }
    }

    public String getName() {
        return name;
    }

    public int getNumberOfAllStudents() {
        int sum = 0;
        for (int numberOfStudentsInClass : numberOfStudentsList) {
            sum += numberOfStudentsInClass;
        }
        return sum;
    }

    @Override
    public String toString() {
        return name;
    }
}