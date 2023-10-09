package org.threads.examples;

public class ThreadInterrupted {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("I'm in child thread : ");
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                System.out.println("I'm interrupted by the main thread : ");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        thread.interrupt(); // main thread interrupts child thread

    }
}
