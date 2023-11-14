package com.ds.oops;

public class Tets {
    public static void main(String[] args){
        Parent p =  new Child();
        p.printHello(10);

       // Child c = (Child) new Parent(); // ClassCastException
       // c.printHello(10);

        Parent p1 = new Parent();
        p1.printHello(10);

        Child c = new Child();
        c.printHello(10.0f);
        c.printHello(20);
    }
}
