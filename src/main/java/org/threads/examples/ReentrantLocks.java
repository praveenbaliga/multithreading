package org.threads.examples;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLocks {
    public static void main(String[] args) {
        ReentrantLock reentrantLocks = new ReentrantLock();
        reentrantLocks.lock();
        reentrantLocks.lock();

        System.out.println(reentrantLocks.isLocked());
        System.out.println(reentrantLocks.isHeldByCurrentThread());
        System.out.println(reentrantLocks.getQueueLength());
        reentrantLocks.unlock();
        System.out.println(reentrantLocks.getHoldCount());
    }
}
