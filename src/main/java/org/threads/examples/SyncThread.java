package org.threads.examples;

public class SyncThread {
    DisplayGreetingMsg displayGreetingMsg;
    String name;

    SyncThread(DisplayGreetingMsg displayGreetingMsg, String name){
        this.displayGreetingMsg = displayGreetingMsg;
        this.name = name;
    }

    Runnable runnable = () -> {
        displayGreetingMsg.greet(name);
    };
}
