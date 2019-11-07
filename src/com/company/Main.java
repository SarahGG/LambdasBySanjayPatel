package com.company;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // passing an anonymous object with an interface class is called a Lambda
        System.out.println( process("Hello, World!", String::toUpperCase) );
    }

    // String::toLowerCase is the same as
    // str -> str.toLowerCase()

    // another example .. when a parameter is needed
    // String::substring(i) is the same as
    // str, i -> str.substring(i)

    // another example .. static methods
    // String::valueOf(number) is the same as
    // number -> String.valueOf(number)

    // another example .. self initialized objects
    // String::new
    // () -> new String()

    // another example .. initializing an object with a parameter
    // (parameter) -> new String(parameter)

    // someString, otherString:: someString.concat(otherString)

    private static String process(String str, Function<String, String> processor) {
        return processor.apply(str);
    }
}