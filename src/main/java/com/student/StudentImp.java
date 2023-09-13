package com.student;

import excep.Employee;

import java.io.*;
import java.util.Scanner;

public class StudentImp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("C://file//studentinfo.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the details : roll no, name, sub1,sub2, sub3, totalmarks");
        Student student = new Student(scanner.nextInt(),scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),scanner.nextInt());
        oos.writeObject(student);
        System.out.println("Object saved in the file");

        FileInputStream fis = new FileInputStream("C://file//studentinfo.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj =  ois.readObject();
        Student stu = (Student) obj;
        System.out.println("Got the object "+stu.name+stu.totalMarks+stu.rollno);
    }
}
