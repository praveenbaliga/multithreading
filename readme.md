Multi threading notes - Java

1. Ways to define threads
   Extends Thread class
   Implementing runnable interface

2. Getting & setting name of the thread

3. Thread priorities
   Every thread in Java has some priority, it may be declared by JVM or dev can provide that too. The priority range is 1 to 10. Min = 1 and max = 10

Thread.MIN_PRIORITY = 1
Thread.NORM_PRIORITY = 5
Thread.MAX_PRIORITY = 10

4. Methods to prevent thread execution
   yield()
   join()
   sleep()

5. Synchronization
6. Inter-thread communication
7. Deadlock
8. Demon threads
9. Multithreading enhancements

Introduction

Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. Each part of such a program is called a thread. So, threads are light-weight processes within a process.





Thread life cycle



