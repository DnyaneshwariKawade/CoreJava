package com.core.common.threadExamples;

import java.util.concurrent.Semaphore;

public class LoginTask extends  Thread {

    private Semaphore semaphore;
    private String userName;

    public LoginTask(Semaphore semaphore, String userName) {
        this.semaphore = semaphore;
        this.userName = userName;
    }

    @Override
    public void run() {
        try {
            System.out.println(userName + " is trying to log in.");
            semaphore.acquire();
            System.out.println(userName + " has logged in.");
            // Simulate some work
            Thread.sleep(2000);
            System.out.println(userName + " has logged out.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            //semaphore.release(1);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore=new Semaphore(3);
        LoginTask user1=new LoginTask(semaphore,"Kiran");
        LoginTask user2=new LoginTask(semaphore,"Raghav");
        LoginTask user3=new LoginTask(semaphore,"Radhika");
        LoginTask user4=new LoginTask(semaphore,"Swaraj");
        user1.start();
        user2.start();
        user3.start();
        user4.start();

        user1.join();
        user2.join();
        user3.join();
        user4.join();
    }
}
