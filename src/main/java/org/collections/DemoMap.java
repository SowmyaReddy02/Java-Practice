package org.collections;

import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        Map<Integer,Integer> mydata = new HashMap<Integer, Integer>();
        mydata.put(4,6);
        mydata.put(4,null);
        mydata.put(44,66);
        mydata.put(41,16);

        Iterator it =mydata.entrySet().iterator();

        while (it.hasNext()){
            System.out.print(" "+it.next()+"");
        }

    }
}
