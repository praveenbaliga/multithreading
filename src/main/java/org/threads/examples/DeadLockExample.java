package org.threads.examples;

public class DeadLockExample {
    public static void main(String[] args) {

        final String resource1 = "Resource 1";
        final String resource2 = "Resource 2";
        // t1 tries to lock resource1 then resource2

        Runnable runnable = () ->{
            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }

                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        };

        Runnable runnable1 = () -> {
            synchronized (resource2) {
                System.out.println("Thread 2: locked resource 2");

                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }

                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1");
                }
            }

        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable1);

        t1.start();
        t2.start();
    }

}

