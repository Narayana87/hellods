package com.structureds.stack;

public class GenericStackTest {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();

        //pushing elements to stack;
        stack.push("Hello");
        stack.push("World");
        stack.push("narayana");
        stack.push("zenbook");

        //displaying elements
        stack.display();

        //poping element
        stack.pop();
        System.out.println("Displaying after poping");
        stack.display();

        stack.pop();
        System.out.println("Displaying after poping");
        stack.display();

        stack.pop();
        System.out.println("Displaying after poping");
        stack.display();

        stack.pop();
        System.out.println("Displaying after poping");
        stack.display();

        System.out.println("Size of the Stack : "+stack.size());

    }
}
