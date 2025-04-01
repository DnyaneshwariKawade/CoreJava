package com.core.common.java;

public class Test extends  child{

    Test(){
        System.out.println(super.a);
        System.out.println("in parent");
    }

    public static void main(String[] args) {

        System.out.println("math.pow::"+Math.pow(-2,3));
        System.out.println("math.sqrt::"+Math.sqrt(8));
        System.out.println("SQRT::"+Math.sqrt(Math.pow(2,3)+Math.pow(3,2)));

        Test t=new Test();
        Integer i=10;
        int b=i;
        final int x=10;
        final int y=20;
        int z=10;

        switch (z){
            case x:
                System.out.println("X");
                break;

            case y:
                System.out.println("Y");
                break;
        }
    }
}

class child{
    int a=10;
    child(){
        System.out.println("in child");
    }
}
