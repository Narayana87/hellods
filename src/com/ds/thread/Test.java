package com.ds.thread;

public class Test implements Runnable {
    public static void main(String[] args) {
        Runnable task = new Test();
        Thread thread1 = new Thread(task);
        thread1.start();
    }
    public Test() {
        Test task = new Test();

    }
    public void run() {
        System.out.println("test");
    }
}