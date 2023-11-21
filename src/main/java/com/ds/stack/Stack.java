package com.ds.stack;

public class Stack<E> {
    private E data;
    private int top;
    private int arr[];
    private int capacity;

    //Creating a stack

    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    //push Element to the top of stack
    public void push(E data){
        if(isFull()){
            System.out.println("Stack Overflow Error : Terminating Program");
            System.exit(1);
        }
        System.out.println("Inserting : " +data);
        arr[++top] = (int) data;

    }

    //pop Element from  top of Stack

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            System.exit(1);
        }
        return arr[top --];
    }

    public int getSize(){
        return top + 1;
    }
    public Boolean isEmpty(){
        return top == -1;
    }
    public Boolean isFull(){
        return top == capacity - 1;
    }

    public void printStack(){
        for(int i = 0; i <= top; i++){
            System.out.println(arr[i] + " , ");
        }
    }

}
