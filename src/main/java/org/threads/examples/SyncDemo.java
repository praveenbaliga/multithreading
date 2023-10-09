package org.threads.examples;

public class SyncDemo {
    public static void main(String[] args) {
        DisplayGreetingMsg greetingMsg = new DisplayGreetingMsg(); // Only 1 object being used by 2 threads simultaneously

        SyncThread syncThread = new SyncThread(greetingMsg, "Robin Singh");
        Thread thread1 = new Thread(syncThread.runnable);
        thread1.start();

        SyncThread syncThread1 = new SyncThread(greetingMsg, "Virat Kohli");
        Thread thread2 = new Thread(syncThread1.runnable);
        thread2.start();

        SyncThread syncThread2 = new SyncThread(greetingMsg, "Kapil Dev");
        Thread thread3 = new Thread(syncThread2.runnable);
        thread3.start();
    }
}
