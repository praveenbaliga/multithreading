package org.threads.examples;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantDisplayExample {
    ReentrantLock reentrantLock = new ReentrantLock();

    public void greet(String name) {
        reentrantLock.lock(); // locking the block

        for (int i = 0; i < 10; i++) {
            System.out.print("Good morning ! : ");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(name);
            System.out.println();
        }
        reentrantLock.unlock(); // unlocking the block
    }

    public void tryLockGreet(String name) {

        if(reentrantLock.tryLock()) {

            for (int i = 0; i < 10; i++) {
                System.out.print("Good morning ! : ");
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print(name);
                System.out.println();
            }
        }else{
            System.out.println("Lock not available hence working on the other flow");
        }

    }

    public static void main(String[] args) {
        ReentrantDisplayExample reentrantDisplayExample = new ReentrantDisplayExample();

        Runnable runnable1 = () -> {
                reentrantDisplayExample.greet("Kapil");
        };

        Runnable runnable2 = () -> {
                reentrantDisplayExample.greet("Dev");
        };

        Runnable runnable3 = () -> {
            reentrantDisplayExample.tryLockGreet("Try lock 1");
        };

        Runnable runnable4 = () -> {
            reentrantDisplayExample.tryLockGreet("Try lock 2");
        };

        Thread thread = new Thread(runnable1);
        thread.start();

        Thread thread1 = new Thread(runnable2);
        thread1.start();

        Thread thread2 = new Thread(runnable3);
        thread2.start();

        Thread thread3 = new Thread(runnable4);
        thread3.start();
    }
}
