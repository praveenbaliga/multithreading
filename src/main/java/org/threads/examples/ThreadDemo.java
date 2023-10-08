package org.threads.examples;

public class ThreadDemo {
    public static void main(String[] args) {

        // Child thread started here
        MyThread thread = new MyThread();
        thread.start(); // by calling start() method the child thread starts its execution

        // Set and Get priorities
        thread.setPriority(10);
        //thread.setPriority(19); // throws illegal argument exception
        System.out.println(" The priority of the thread : " + thread.getPriority());
        System.out.println(" The priority of the main thread : " + Thread.currentThread().getPriority());

        // Change the priority of the main thread
        Thread.currentThread().setPriority(7);
        System.out.println("The main thread priority : " + Thread.currentThread().getPriority());
        System.out.println("The child thread priority : " + thread.getPriority());


        // Child thread created using runnable interface
        Runnable runnable = new ThreadRunnableDemo();
        Thread thread1 = new Thread(runnable);
        thread1.start();

        // A for loop for the main thread
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside the main thread : " + i);
        }

        // Get the name of the threads
        System.out.println("The name of the threads are  :" + thread.getName() + " : " + thread1.getName() + " : " + Thread.currentThread().getName());

        // Set the name of the threads
        thread1.setName("Runnable impl thread ");
        thread.setName("Thread class extends thread ");
        Thread.currentThread().setName("The main thread");

        // Get the name of the threads
        System.out.println("The name of the threads are  :" + thread.getName() + " : " + thread1.getName() + " : " + Thread.currentThread().getName());


    }
}
