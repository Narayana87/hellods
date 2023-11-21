package com.structureds.stack;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class GenericStackTest {

    @Test
    public void testPush() {
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.size());
    }

    @Test
    public void testPop() {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        stack.pop();
        assertEquals(2, stack.size());

        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        GenericStack<Double> stack = new GenericStack<>();
        assertTrue(stack.isEmpty());

        stack.push(3.14);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testSize() {
        GenericStack<Character> stack = new GenericStack<>();
        assertEquals(0, stack.size());

        stack.push('A');
        stack.push('B');
        stack.push('C');

        assertEquals(3, stack.size());

        stack.pop();
        assertEquals(2, stack.size());
    }

    @Test
    public void testDisplay() {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");

        // Assuming display() prints to the console, capture the output for testing
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        stack.display();
        System.setOut(System.out);
        String expectedOutput = "Orange\nBanana\nApple\n";  // reverse order due to stack behavior
        String actualOutput = outContent.toString().replaceAll("\\r\\n", "\n").replaceAll("\\r", "\n");
        assertEquals(expectedOutput, actualOutput);
    }
}
