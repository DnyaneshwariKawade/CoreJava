package com.core.common.java;

public class DefaultAndStaticMethod {
    public static void main(String[] args) {

    }
}

interface DefaultMethood {
    public default void m1(){
        System.out.println("default");
    }
}
interface  StaticMethod extends DefaultMethood{
//    static void m1(){
//        System.out.println("default");
//    }
}
