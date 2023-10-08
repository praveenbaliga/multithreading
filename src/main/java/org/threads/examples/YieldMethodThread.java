package org.threads.examples;

public class YieldMethodThread {
    public static void main(String[] args) {
        // Creating a child thread
        Runnable childThread = () -> {
            for(int i=0; i<1000; i++){
                System.out.println("The child thread execution : " + i);
                Thread.yield();
            }
        };
        Thread thread = new Thread(childThread);
        thread.start();

        // main thread continues its execution
        for (int i=0; i < 2000; i++){
            System.out.println("The main thread execution : " + i);
        }
    }
}
