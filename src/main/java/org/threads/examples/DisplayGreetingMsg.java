package org.threads.examples;

public class DisplayGreetingMsg {
    public synchronized void greet(String name){ // since more than 1 thread will act on this method, it has been synchronized
        for(int i=0;i<10; i++) {
            System.out.print("Good morning !!! ");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.print(name);
            System.out.println("\n");
        }
    }
}
