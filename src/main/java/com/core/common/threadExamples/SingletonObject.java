package com.core.common.threadExamples;

public class SingletonObject {

    private volatile static SingletonObject object;

    private SingletonObject() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }

    public static SingletonObject getObject() {
        if (object == null) {
            synchronized (SingletonObject.class) {
                if (object == null) {
                    System.out.println("in null check");
                    object = new SingletonObject();
                }
            }
        }
        return object;
    }

    public static void main(String[] args) {
//        SingletonObject obj1 = SingletonObject.getObject();
//        obj1.test();
//        SingletonObject obj2 = SingletonObject.getObject();
//        obj2.test();
//        SingletonObject obj3 = SingletonObject.getObject();
//        obj3.test();


        Thread t1 = new Thread(() -> {
            SingletonObject obj1 = SingletonObject.getObject();
            System.out.println("Obj1 is created::" + obj1.hashCode());
        });

        Thread t2 = new Thread(() -> {
            SingletonObject obj2 = SingletonObject.getObject();
            System.out.println("Obj2 is created::" + obj2.hashCode());
        });
        t1.start();
        t2.start();

        //Thread t3=new Thread(() -> {});

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // System.out.println("Obj1 hashcode::" + obj1.hashCode() + " obj2 hashcode::" + obj2.hashCode() + " obj3 hashcode:;" + obj3.hashCode());
    }

    public void test() {
        System.out.println("test() called");
    }
}
