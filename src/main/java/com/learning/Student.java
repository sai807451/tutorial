package com.learning;

import java.util.List;

public class Student {

    private int studentId;

    private String firstName;

    private String lastName;

    private String address;

    private static String collegeName;

    private List<String> subjects;



    static {
        collegeName = "SLU";
        System.out.println("assignig static block college value");
    }

    public Student() {
        System.out.println("am in default constrctor");
    }

    public Student(int studentId, String firstName, String lastName) {
        System.out.println("am in parameterized constrctor");

        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(int studentId, String firstName, String lastName, String address) {
        System.out.println("am in parameterized constrctor");

        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }


    public void setStudentId(int studentId ) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public boolean enrollCourse() {

        return true;
    }

    public boolean dropCourse() {

        return false;
    }

    public void printName() {

        System.out.println( "ID:" + studentId + ", Full Name: " + firstName + " " + lastName + ", address: " + address + ", college name: " + collegeName);
    }


}
