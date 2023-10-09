package org.threads.examples;

public class ThreadCallingJoinItself {
    public static void main(String[] args) throws InterruptedException { // a kind of deadlock situation
        Thread.currentThread().join();
    }
}
