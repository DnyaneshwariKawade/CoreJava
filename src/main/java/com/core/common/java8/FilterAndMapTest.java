package com.core.common.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterAndMapTest {


    public static void main(String[] args) {
        Stream<Integer> nums = Stream.of(1, 2, 3, 4, 5);
        List<Integer> list = nums.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(list);
    }
}
