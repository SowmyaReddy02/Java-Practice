package org.collections;

import java.util.*;

public class DemoPriority {
    public static void main(String[] args) {
        Queue<Integer> mydata = new PriorityQueue<Integer>();
        mydata.add(4);
        mydata.add(21);
        mydata.add(77);
        mydata.add(2);
        mydata.add(20);

        Iterator it =mydata.iterator();

        while (it.hasNext()){
            System.out.print(" "+it.next()+"");
        }

        System.out.println("peek"+mydata.peek());
        System.out.println("poll"+mydata.poll());

    }
}
