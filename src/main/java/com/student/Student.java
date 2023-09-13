package com.student;

import java.io.Serializable;

public class Student implements StudentInt, Serializable {
    int rollno;
    String name;

    public Student(int rollno, String name, int subject1, int subject2, int subject3, int totalMarks) {
        this.rollno = rollno;
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.totalMarks = totalMarks;
    }

    int subject1, subject2, subject3,totalMarks;

    @Override
    public void readStudInfo() {
        System.out.println("name :"+name+" roll no :"+rollno);
    }

    @Override
    public void calcTotal() {
        System.out.println("total marks :"+totalMarks);
    }

    @Override
    public void printStudentInfo() {
        System.out.println("name :"+name+" roll no :"+rollno+" all details ");
    }
}


