package com.ds.designpattern;

/*
The Singleton design pattern ensures that a class has only one instance and provides a global point of access to that
instance. It is useful when you want to restrict the instantion of a class to single instance and ensure that this
instance can be accessed from anywhere in the application
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("Private constructor");
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
