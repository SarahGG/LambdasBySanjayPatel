package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

// Method references let us re-use the pre-existing method definitions in place of lambdas.
// Wherever we can pass a lambda, we can pass a method reference.


// Functional interfaces are interfaces that have a single method
// and to use a lambda, we first need to have a functional interface corresponding to it.
// Java comes with a lot of built in functional interfaces like Runnable, Function and BiFunction below.


public class Main {

    public static void main(String[] args) {
        // passing an anonymous object with an interface class is called a Lambda
        System.out.println( process("Hello, World!", String::toUpperCase) );
        System.out.println( process2("Hello, World!", 5, String::substring) );

        String[] names = {"Mr Sanjay", "Ms Trupti", "Dr John"};
        Arrays.sort(names, Comparator.comparing(name -> name.split(" ")[1])        );

        System.out.println(Arrays.toString(names));
    }

    private static String process2(String str, int i,
                                   BiFunction<String, Integer, String> processor) {
        return processor.apply(str, i);
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

    private static String process(String str,
                                  Function<String, String> processor) {
        return processor.apply(str);
    }
}