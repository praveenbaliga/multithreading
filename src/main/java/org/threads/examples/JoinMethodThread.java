package org.threads.examples;

public class JoinMethodThread {
    public static void main(String[] args) {
//        Runnable runnable1 = () ->{ // Thread-1
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("Inside t1");
//                }
//        };
//
//        Runnable runnable2 = () ->{ // Thread-2
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Inside t2");
//            }
//        };
//
//        Thread t1 = new Thread(runnable1);
//        Thread t2 = new Thread(runnable2);
//        // Starting the child threads
//        t1.start();
//        t2.start();
//
//        try { // Waiting for child threads to finish
//            t1.join();
//            t2.join();
//            System.out.println("t1 & t2 finished");
//        } catch (InterruptedException e) {
//            System.out.println("Interrupted Exception");
//        }
//
//        for (int i = 0; i < 10; i++) { // Continuing the execution of the main thread
//            System.out.println("Inside main thread ");
//        }
//    }
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                // The task to be executed by child thread 1
                for(int i=0; i<10; i++)
                System.out.println("Inside t1");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                // The task to be executed by child thread 2
                for(int i=0; i<10; i++)
                System.out.println("Inside t2");
            }
        });

        // Starting the child threads
        t1.start();
        t2.start();

        // Waiting for child threads to finish
        try {
            t1.join(2000);
            t2.join(2000);
            System.out.println("t1 & t2 finished");
        } catch (InterruptedException e) {
            // Handling the exception
            System.out.println("Interrupted Exception");
        }

        // Continuing the execution of the main thread \
        for(int i=0; i< 10; i++){
            System.out.println("The main thread : " + i);
        }

    }
}
