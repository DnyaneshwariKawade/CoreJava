package com.core.common.threadExamples;

public class StringBuildUnsafe {

    public static void main(String[] args) throws InterruptedException {

        StringBuilder sb=new StringBuilder();  //expected length is 2000 but StringBuilder is not thread safe
        //StringBuffer sb=new StringBuffer();
        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
                sb.append("A");
            }
        });

        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++){
                sb.append("B");
            }
        });
        t1.start();
        t2.start();
        //Thread.sleep(1000);
        t1.join();
        t2.join();
        System.out.println("StringBuilder length::"+sb.length());
    }
}
