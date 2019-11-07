package com.company;

public class Main {

    public static void main(String[] args) {
        // passing an anonymous object with an interface class is called a Lambda
        System.out.println( process("Hello, World!", str -> str.toUpperCase()) );
    }

    private static String process(String str, Processor processor) {
        return processor.process(str);
    }
}

//interface with a  single method is called a functional interface, and wherever they are used, lambdas can be too.
interface Processor {
    String process(String str);
}