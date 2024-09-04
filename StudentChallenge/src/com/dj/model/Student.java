package com.dj.model;

import com.dj.util.QueryItem;

import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {

    private static int LAST_ID = 10_0000;
    private int studentID;
    private String name;
    private String course;
    private int yearStarted;

    protected static Random random = new Random();
    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "JAVA", "Python"};

    public Student (){
        studentID = LAST_ID++;
        int lastNameIndex = random.nextInt(65,91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018,2023);
    }

    @Override
    public String toString() {
        return "%d %-15s %-15s %d".formatted(studentID, name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFiledValue(String fieldName, String value) {

        String fName = fieldName.toUpperCase();
        return switch (fName){
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            default -> false;
        };
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(studentID).compareTo(o.studentID);
    }
}

