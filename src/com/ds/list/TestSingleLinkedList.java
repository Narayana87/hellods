package com.ds.list;

public class TestSingleLinkedList {
    public static void main(String[] args) {
        SingleLinkedList<String> ssl = new SingleLinkedList<String>();
        ssl.addFirst("Hello");
        System.out.println("Is Empty :"+ssl.isEmpty());

    }
}
