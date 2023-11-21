package com.ds.ImmutableClass;

//Make your class final
// Declare all instance variable with private and final
//Say no to setter
// initialize all variable in constructor
//you can initialize variables in constructor
// perform cloning of mutable objects while returning from getter method.

public final class ImmutableClass {
    private final String name;

    public ImmutableClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass("Immutable Class1");
        System.out.println(immutableClass.getName());

    }
}
