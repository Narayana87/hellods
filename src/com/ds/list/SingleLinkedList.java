package com.ds.list;

public class SingleLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SingleLinkedList() {
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public E firstElement(){
        if(isEmpty()){
            return null;
        }
        return head.getElement();
    }

    public E lastElement(){
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }

    public void addFirst(E e){
        Node<E> newNode = new Node<>(e, head);
        if(size == 0){
            tail = head;
            size++;
        }
    }
}
