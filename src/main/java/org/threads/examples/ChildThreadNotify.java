package org.threads.examples;

public class ChildThreadNotify extends Thread{
    public void run(){

        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println("The child thread notify example :");
            }
            this.notify(); // notify the calling thread
        }
    }
}
