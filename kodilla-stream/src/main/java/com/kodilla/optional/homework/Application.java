package com.kodilla.optional.homework;

import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Student 1", new Teacher("Teacher A")),
                new Student("Student 2", null),
                new Student("Student 3", new Teacher("Teacher A")),
                new Student("Student 4", null),
                new Student("Student 5", null),
                new Student("Student 6", new Teacher("Teacher B")),
                new Student("Student 7", new Teacher("Teacher B")),
                new Student("Student 8", null),
        };

        for (Student student :
                students) {
            System.out.println("uczeń: " + student.getName()+", nauczyciel: " +
                    Optional.ofNullable(student.getTeacher()).orElse(new Teacher("<undefined>")).getName());
        }
    }
}
