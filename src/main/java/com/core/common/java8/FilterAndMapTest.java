package com.core.common.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterAndMapTest {

    public static void main(String[] args) {
        //Collections.sort();
        List<Integer> list=List.of(2,4,5,7,8,9,10,23);
        Stream<Integer> nums = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> mins=list.stream().sorted(Comparator.naturalOrder()).limit(3).collect(Collectors.toList());
        System.out.println("3 min nums::"+mins);

        List<Integer> maxs=list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println("3 max nums::"+maxs);
        //List<Boolean> l1 = nums.map(i -> i % 2 == 0).collect(Collectors.toList());

        //List<Integer> l2= nums.filter(i->i%2==0).collect(Collectors.toList());
        //separate even & odd
//       Map<Boolean, List<Integer>> oddEvenMap= nums.collect(Collectors.groupingBy(i->i%2==0));
//       System.out.println("oddEvenMap:: "+oddEvenMap.toString());
//
//        Function<Integer, String> f = (a) -> {
//            return String.valueOf(a);
//        };
//
//        Predicate<Integer> i = (num) -> {
//            return num % 2 != 0;
//        };

//        Map<Integer, Long> freqMap= nums.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println("Frequency map:: "+freqMap.toString());
//
//        //find 3 min and max nums
//
//        List<Integer> mins=nums.sorted(Comparator.naturalOrder()).limit(3).collect(Collectors.toList());
//        System.out.println("3 min nums::"+mins);
    }
}
