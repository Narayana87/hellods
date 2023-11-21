package com.ds.functional;

@FunctionalInterface
public interface Hello {
    public void getListOfUsers();
    default void getUserDetails(){

    }
    static void getOtp(){

    }
}
