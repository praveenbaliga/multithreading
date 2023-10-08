package org.threads.examples;

public class ThreadRunnableDemo implements Runnable{ // Thread creation using runnable
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("I'm in the child thread using runnable interface : " + i);
        }
    }
}
