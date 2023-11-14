package com.ds.exception;

public class TestCustomException {
    public void getOrder(int OrderId){
        if(OrderId==101){
            throw new OrderNotFoundException("Order not found with Id :"+OrderId);
        }
    }

    public static void main(String[] args) {
        TestCustomException exec = new TestCustomException();
        exec.getOrder(101);
    }
}
