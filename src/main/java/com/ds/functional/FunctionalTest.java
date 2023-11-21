package com.ds.functional;

public class FunctionalTest {
    public static void main(String[] args) {
        System.out.println("Hello");
        MyInterface myInterface = () -> System.out.println("Do Something");
        myInterface.doSomething();
    }
}
