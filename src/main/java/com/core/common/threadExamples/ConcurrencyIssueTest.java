package com.core.common.threadExamples;

public class ConcurrencyIssueTest {
    private int regularInt=5;

    public int addAndGet(int val) {
        System.out.println(Thread.currentThread().getName());
        regularInt+=val;
        return regularInt;
    }
    public  int getAndAdd(int val) {
        System.out.println(Thread.currentThread().getName());
        int temp= regularInt;
        regularInt+=val;
        return temp;
    }

    public int getRegularInt() {
        return regularInt;
    }

    public static void main(String[] args) {
        ConcurrencyIssueTest example=new ConcurrencyIssueTest();
        Thread t1=new Thread(()-> System.out.println(example.addAndGet(10)));
        t1.start();
        try{
        Thread.sleep(1000);
        new Thread(()-> System.out.println(example.getAndAdd(5))).start();
            Thread.sleep(1000);
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(example.getRegularInt());
    }
}
