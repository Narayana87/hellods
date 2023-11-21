package com.ds.designpattern;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton.equals(singleton1));

        System.out.println(singleton.hashCode()+" "+singleton1.hashCode());

        System.out.println(singleton == singleton1);
    }
}
