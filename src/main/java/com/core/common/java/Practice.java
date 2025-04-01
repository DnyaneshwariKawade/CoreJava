package com.core.common.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practice {

    public void m1() throws InterruptedException {

        wait(100);
        System.out.println("Hii");
    }
        static int result;
    public static int rec(int num) {

        result=rec(num-1);
        return result;
    }
    public static void main(String[] args) throws InterruptedException {
        String msg="";
        Practice p=new Practice();
        p.m1();
        A.process();
        Optional<String> opt=Optional.ofNullable(null);
        System.out.println("---"+opt.orElse("default"));

        List<String> list= Arrays.asList("Java","is","awsomee");
        String result=list.stream().collect(Collectors.joining(" "));
        System.out.println(result);

        //System.out.println(rec(12));

        Object obj=new int[]{1,2,3};
        if(obj instanceof  int[]) {
            System.out.println("Array");
        } else {
            System.out.println("Not an Array");
        }

        try(BufferedWriter br=new BufferedWriter(new FileWriter("file.txt"));
            PrintWriter pw=new PrintWriter(br)
        ) {
            pw.write("Hii");
        } catch (IOException e) {
            e.printStackTrace();
        }
      //  Float f=new Float(12f);
//        switch (f) {
//            case 12:
//                System.out.println(12);
//        }

    }

}

abstract  class A{
    static void process(){
        System.out.println("system processing");
    }
}
