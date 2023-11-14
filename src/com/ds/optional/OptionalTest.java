package com.ds.optional;

import java.util.Optional;
import java.util.spi.ToolProvider;

public class OptionalTest {
    public static void main(String[] args) {
        String str = " ";
        Optional<String> optional = Optional.ofNullable(str);

        if (optional.isEmpty()){
            System.out.println("Optional Value : "+optional.get());
        }else {
            System.out.println(optional.orElse("Default Value"));
        }



    }
}
