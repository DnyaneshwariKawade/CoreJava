package com.core.common.java;

import java.util.*;

public class CoomonTest {

    public static void main(String[] args) {
//        System.out.println("Main start");
//        Color c= Color.RED;
//        System.out.println(c);

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        pq.add(3);
        pq.add(2);
        pq.add(1);
        System.out.println(pq.peek());
        System.out.println(pq.peek());

      //  SequencedSet<String> set = new LinkedHashSet<>();
        //foo(10);
//        List<String> list=new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//
//       Iterator<String> it=list.iterator();
//       it.next();
//       it.remove();
//
//       System.out.println(list);
//
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "One");
//        map.put(2, "Two");
//        map.put(1, "First");
//
//        byte a=127;
//        a++;
//        a++;
//        System.out.println(a);
//        String a=new String("Hello").intern();
//        String b="Hello";
//        System.out.println(a==b);
     //   System.out.println(Double.isNaN(1) == Double.isNaN(1));
    }

    public static void foo(int x) {
        if(x>0){
            x=x-1;
            foo(x);
        }
        System.out.println(x);
    }
}

enum Color {
    RED,GREEN,BLUE;
    Color(){
        System.out.println("In constructor");
        System.out.println(this.name());
    }
}
