package com.structureds.stack;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericStack<E> implements Iterable<E> {
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
            for (int i = size() - 1; i >= 0; i--){
                System.out.println(stackList.get(i).toString());
            }
        }else {
            System.out.println("Stack is Empty.");
        }

    }

    @Override
    public Iterator<E> iterator() {
        return stackList.iterator();
    }
}
