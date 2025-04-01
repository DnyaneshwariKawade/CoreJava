package com.core.common.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSorting {

    public static void main(String[] args) {
        Integer a=127;
        Integer b=127;
        System.out.println(a==b);

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(20);
        System.out.println(list);
        Stream<Integer> stList=list.stream().sorted();
        stList.forEach(System.out::println);

        List<Person> personList=new ArrayList<>();
        Person p1=new Person();
        p1.setId(10);
        p1.setName("Kiran");
        p1.setAge(32);

        Person p2=new Person();
        p2.setId(20);
        p2.setName("Santosh");
        p2.setAge(35);

        Person p3=new Person();
        p3.setId(30);
        p3.setName("Raghav");
        p3.setAge(6);
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        List<Person> lp=personList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());

        for(Person p:lp){
            System.out.println(p.getId()+" "+p.getName()+" "+p.getAge());
        }

    }
}

class Person {
    int id;
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
