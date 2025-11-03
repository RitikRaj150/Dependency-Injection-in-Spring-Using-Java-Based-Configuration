package com.nimbus.di;

public class Student {
    private Course course;

    // Constructor-based injection
    public Student(Course course) {
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Student enrolled in: " + course.getCourseName());
    }
}
