package org.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add("sow");
        list.add(30);
        list.add(30);
        list.add(null);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (int i=0;i<5;i++){
            list.add(i);
        }
        List list1 = new ArrayList();
        for (int i=0;i<5;i++){
            list1.add(i);
        }

        list.addAll(3,list1);
        for (int i =0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
