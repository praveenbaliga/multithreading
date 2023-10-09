package org.threads.examples;

public class WaitExample {
    public static void main(String[] args) throws InterruptedException {

        ChildThreadNotify thread = new ChildThreadNotify();
        thread.start();

        synchronized (thread) {
            thread.wait(); // wait for the first for loop to get executed by the child thread
        }
        for(int i=0; i<10; i++){
            System.out.println("The code after the thread wait() gets executed ");
        }
    }
}
