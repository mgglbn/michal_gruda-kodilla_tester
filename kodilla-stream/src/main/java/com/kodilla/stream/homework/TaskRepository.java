package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Change Job", LocalDate.of(2022, 3, 1), LocalDate.of(2022, 6, 1)));
        tasks.add(new Task("Change Tires", LocalDate.of(2022, 3, 10), LocalDate.of(2022, 4, 3)));
        tasks.add(new Task("Do groceries", LocalDate.of(2022, 4, 1), LocalDate.of(2022, 4, 10)));
        tasks.add(new Task("Learn to code", LocalDate.of(2022, 1, 1), LocalDate.of(2022, 5, 20)));
        tasks.add(new Task("Learn Java", LocalDate.of(2022, 3, 1), LocalDate.of(2022, 7, 1)));
        tasks.add(new Task("Get fit", LocalDate.of(2020, 1, 1), LocalDate.of(2021, 6, 1)));
        tasks.add(new Task("Learn back flip", LocalDate.of(2019, 1, 1), LocalDate.of(2022, 1, 1)));

        return tasks;
    }
}
