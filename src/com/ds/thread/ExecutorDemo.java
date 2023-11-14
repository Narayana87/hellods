package com.ds.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {

        //If we need to create a thread for just one task, use the Thread class.
        // if you need to create threads for multiple tasks. It is better to use a thread pool.
        //Create a fixed thread pool with maximum three threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        //submit runnable tasks to the executor
        executorService.execute(new PrintChar('a', 100));
        executorService.execute(new PrintChar('b', 100));
        executorService.execute(new PrintNum(100));

        //shutdown the executor
        executorService.shutdown();
    }
}
