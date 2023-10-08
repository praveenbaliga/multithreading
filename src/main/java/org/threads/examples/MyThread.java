package org.threads.examples;

public class MyThread extends Thread{

    // This block of code is called defining a thread
    @Override
    public void run(){

        // This block of code is called job of the thread
        for(int i=0; i<10; i++){
            System.out.println("Inside the run method of child thread : " + i);
        }
    }
}
