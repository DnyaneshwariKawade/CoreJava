package com.core.common.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

public class Practice {
    public static void main(String[] args) {
        //System.out.println("Sum::"+IntStream.range(2,5).sum());

        Map<Integer, String> map2=Map.of(1,"One",2,"Two",3,"Three");
        List<String> l2=map2.values().stream().takeWhile(s->!s.equals("Two")).toList();
        System.out.println(l2);


        List<Integer> list=Arrays.asList(1,2,3,4,5);
        Optional<Integer> maxNum=list.stream().filter(i->i%2==0).max(Integer::compareTo);
        System.out.println("MAX NUM::"+maxNum);

        String x= "Kiran";
        System.out.println("X::"+x.repeat(3));



    }
}
