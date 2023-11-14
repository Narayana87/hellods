package com.structureds.stack;

import java.util.ArrayList;

public class GenericStack<E> {
    private final ArrayList<E> stackList = new ArrayList<>();

    //pushing element to the stack
    public void push(E element){
        stackList.add(element);
    }

    //poping element from the list

    public void pop(){
        if(!isEmpty()){
            stackList.remove(stackList.size() - 1);
        }else {
            System.out.println("Stack is Empty.");
        }
    }

    public boolean isEmpty(){
        return stackList.isEmpty();
    }
    public int size(){
        return stackList.size();
    }

    public void display(){
        if (!isEmpty()){
            for (E e : stackList
                 ) {
                System.out.println(e.toString());
            }
        }else {
            System.out.println("Stack is Empty");
        }
    }
}
