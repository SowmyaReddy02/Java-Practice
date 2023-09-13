package org.collections;

import java.util.*;

public class StudentCompare implements Comparable<StudentCompare>{
    private int rollno;
    private String name;

    public StudentCompare(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentCompare{" +
                "rollno=" + rollno +
                ", name=" + name +
                '}';
    }

    public int getRollno() {
        return rollno;
    }

    public int setRollno(int rollno) {
       return this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
       return this.name = name;
    }

    @Override
    public int compareTo(StudentCompare o) {
        int id3 = o.rollno;
        if(id3>getRollno()){
            return -1;
        }
        else if(id3<getRollno()){
            return 1;
        }
        return 0;
    }
}

class SortDemo{
    public static void main(String[] args) {
        ArrayList<StudentCompare> list = new ArrayList<>();

        list.add(new StudentCompare(2,"sow"));
        list.add(new StudentCompare(1,"the"));
        list.add(new StudentCompare(0,"it"));
        list.add(new StudentCompare(3,"qqq"));
        Collections.sort(list);
        for (StudentCompare studentCompare : list){
            System.out.println(" NAME "+studentCompare.getRollno());
        }
    }
}
