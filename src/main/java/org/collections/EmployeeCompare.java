package org.collections;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeCompare implements Comparable<EmployeeCompare>{

    int id;
    String name;

    public EmployeeCompare(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(EmployeeCompare o) {
        int id2 = o.id;
        if(id2>id){
            return -1;
        }
        else if(id2<id){
            return 1;
        }
        return 0;
    }
}

class TestCompare{
    public static void main(String[] args) {
        Set<EmployeeCompare> set = new TreeSet<EmployeeCompare>();
        set.add(new EmployeeCompare(20,"sow"));
        set.add(new EmployeeCompare(10,"chan"));
        set.add(new EmployeeCompare(40,"san"));
        for (EmployeeCompare emp:set){
            System.out.println("id : "+emp.id);
        }
    }

}
