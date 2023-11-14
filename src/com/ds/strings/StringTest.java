package com.ds.strings;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello"; //both s1 and s2 will be in one memory location
        String s3 = new String("Hello") ; //Creats in heap location as it is used new

        // only two obejct will be created.

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

    }
}
