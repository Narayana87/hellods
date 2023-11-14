package com.ds.thread;



import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemoCallable {
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        Producer producer = new Producer();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        System.out.println("executor Service consumer: "+ executorService.submit(consumer));
        System.out.println("executor Service producer: "+ executorService.submit(producer));
        executorService.shutdown();
    }
}

class Consumer implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return (int) Math.round(Math.random() * 10 + 100);
    }
}

class Producer implements Callable<String>{

    @Override
    public String call() throws Exception {
        return "Hello";
    }
}

