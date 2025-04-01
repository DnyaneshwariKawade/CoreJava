package com.core.common.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

    public void m1() {
        enum Day {
            Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
        }
    }


    public static void main(String[] args) {

        if(null instanceof  String){
            System.out.println("true");
        }
        //take while
        Map<Integer, String> map2=Map.of(1,"One",2,"Two",3,"Three");
        List<String> l2=map2.values().stream()
                            .takeWhile(s->!s.equals("Two"))
                            .toList();
        System.out.println(l2);

        List<String> list = new ArrayList<>();
        list.add("Dnyanu");
        list.add("Kiran");
        list.add("Raghav");
        list.add("Radhika");
        list.add("Swaraj");
        list.add("Santosh");
        list.add("Sachin");
        list.add("Vikas");

        int batchSize = 3;

        for (int i = 0; i < list.size(); i++) {
            List<String> batch = list.stream()
                    .skip(i+1)
                    .limit(batchSize)
                    .collect(Collectors.toList());
            System.out.println(batch);
        }

        List<String> lst = Arrays.asList("a", "b", "c");
        Stream<String> stream = lst.stream();
        List<String> lst1 = stream.collect(Collectors.toList());
       // stream.forEach(System.out::println);

        List<Integer> listNum= List.of(5,3,4,8,9,6,11,13,3,17,19,21);
        //print prime number
        listNum.stream()
                .filter(i-> IntStream.range(2,i).noneMatch(x->i%x==0))
                //.filter(i->i%2!=0)
                .distinct()
                .toList()
                .forEach(e-> System.out.println(e));

//        for(Integer num: listNum) {
//            System.out.println(num);
//            System.out.println(IntStream.range(2,num).noneMatch(x->num%x==0));
//        }

        Object obj=new int[]{1,2,3};
        if(obj instanceof  int[]) {
            System.out.println("Array");
        } else {
            System.out.println("Not an Array");
        }
        System.out.println(IntStream.range(2,9).sum());

    }
}
