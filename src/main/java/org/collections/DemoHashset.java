package org.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

public class DemoHashset {
    public static void main(String[] args) {
        Set<Integer> mydata = new HashSet<Integer>();
        mydata.add(4);
        mydata.add(21);
        mydata.add(77);
        mydata.add(2);
        mydata.add(88);
        mydata.add(20);
        mydata.add(20);

        Predicate<Integer> resultvalue = (item) -> item <50;

        for (Integer value: mydata){
            if(resultvalue.test(value)){
                System.out.println(value);
            }
        }

        mydata.stream().filter(item->item!=null && item<50).limit(4).forEach(System.out::println);


//        Iterator it =mydata.iterator();
//
//        while (it.hasNext()){
//            System.out.print(" "+it.next()+"");
//        }
    }
}
