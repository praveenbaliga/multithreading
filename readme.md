Multi threading notes - Java

Introduction

Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. Each part of such a program is called a thread. So, threads are light-weight processes within a process.

Thread life cycle


1. Ways to define threads
   Extends Thread class
   Implementing runnable interface

2. Getting & setting name of the thread

3. Thread priorities
   Every thread in Java has some priority, it may be declared by JVM or dev can provide that too. The priority range is 1 to 10. Min = 1 and max = 10

Thread.MIN_PRIORITY = 1
Thread.NORM_PRIORITY = 5
Thread.MAX_PRIORITY = 10

The default priority for every thread is inherited from parent to child, only for the main thread is 5.
Thread.getPriority() and Thread.setPriority(int priority) are the methods available. If the priority is > 10, we get a runtime exception - IllegalArgument exception.

Note: Always the child thread inherits the priority of the parent thread.

4. Methods to prevent thread execution
   yield() : Pauses the current thread, enters the running state to give the chance for remaining waiting threads to execute the same priority. Suppose the waiting threads are of low priority the current thread would continue its execution. The decision on which waiting thread will get a chance to execute solely depends on the JVM.

join() : Whenever there are multiple threads being executed, if one of the threads depends on the output of the other then, the thread which wants the output of the other thread should call the join() method on the other thread. For e.g. If there are 2 threads t1 & t2, and t2 wants the output of t1, then t2 has to call the join() method on t1 i.e. t1.join(). This way we get the execution order of the threads too and the output will not have the jumbled results. join() method waits until the threads are dead.

Note: If a thread calls join() method on the same thread itself then the program will get stuck.

sleep(): Method Whenever Thread.sleep() functions to execute, it always pauses the current thread execution. If any other thread interrupts when the thread is sleeping, then an InterruptedException will be thrown. If the system is busy, then the actual time the thread will sleep will be more as compared to that passed while calling the sleep method and if the system has less load, then the actual sleep time of the thread will be close to that passed while calling sleep() method.

5. Synchronization
   Synchronization of thread can be achieved using synchronized keyword to the method/ block of code which is shared across multiple threads. This way we don’t get unexpected outputs, however when the synchronized keyword is not used properly then there’s a chance of deadlock.

6. Inter-thread communication
   Threads can communicate with each other by using wait(), notify(), notifyAll() methods. These methods are present in Object class. If we are waiting for an update of the results from other threads, then wait() method should be used. If we use join() method, the thread will wait until the entire execution of the other thread is done. Instead, use wait(), notify() if we want only a small block of code to be addressed and that’s our need. But wait(), notify() and notifyAll() methods should be called only in the synchronized area otherwise we get an IllegalMonitorStateException exception.

7. Deadlock
   If threads are waiting for eachother forever, such a condition is called a deadlock. If the synchronized blocked are not coded carefully, they may lead to deadlock

9. Multithreading enhancements
   Two commonly used mechanisms for locks in Java are synchronized blocks and the java.util.concurrent.locks package, which includes ReentrantLock.
   Java provides the synchronized keyword to create synchronized blocks of code. You can use it to synchronize access to a specific block of code or a method. When a thread enters a synchronized block, it acquires the lock associated with the monitor object, and other threads attempting to enter the same synchronized block will be blocked until the lock is released.

Using ReentrantLock from java.util.concurrent.locks:
The ReentrantLock class provides more flexibility and control compared to synchronized blocks. It allows you to explicitly acquire and release locks, and it supports features like lock timeouts, condition variables, and more.




