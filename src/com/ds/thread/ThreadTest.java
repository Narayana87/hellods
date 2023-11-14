package com.ds.thread;

class DemonWorker implements Runnable{
    @Override
    public void run(){
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Daemon thread is finishes...");
        }
    }
}

class NormalWorker implements Runnable{
    @Override
    public void run(){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Normal Thread is running...");
        }

}
public class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DemonWorker());
        Thread t2 = new Thread(new NormalWorker());
        t1.setDaemon(true);
        t2.setDaemon(false);
        t1.start();
        t2.start();

    }

}
