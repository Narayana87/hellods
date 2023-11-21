package com.ds.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {
        try(FileOutputStream fis = new FileOutputStream("test.txt")){
            String text = "This is a example of try with resource";
            byte[] byteArray = text.getBytes(); //converting string into byte Array
            fis.write(byteArray);
            System.out.println("Message written to file successfully..");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
