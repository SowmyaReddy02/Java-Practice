package org.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    private ArrayList<String> names;

    public Student(ArrayList<String> names) {
        this.names = names;
    }


    public void searchName(String name){
        for(int i=0;i<names.size();i++){
            if (name.equals(names.get(i))){
                System.out.println("Search name :"+name);
            }
        }
    }
    public void searchName(int index){
        System.out.println("Search by Index : "+names.get(index));
    }
    public void printName(){
        Iterator iterator = names.iterator();
        while ((iterator.hasNext())){
            System.out.println(iterator.next());
        }
    }
    public void removeName(String name){
        names.remove(name);
        Iterator iterator = names.iterator();
        while ((iterator.hasNext())){
            System.out.println(iterator.next());
        }
    }
}

class ArrayListDemo1{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("sow");
        list.add("the");
        list.add("all");
        list.add("then");
        list.add("them");
        list.add("this");
        Student student = new Student(list);
        student.printName();
        student.searchName(0);
        student.searchName("this");
        student.removeName("this");
    }
}