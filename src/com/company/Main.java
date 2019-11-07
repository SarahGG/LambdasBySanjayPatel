package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println( process("Hello, World!", new Processor(){
            public String process(String str) {
                return str.toUpperCase();
            }
        }) );
    }

    private static String process(String str, Processor processor) {
        return processor.process(str);
    }
}

interface Processor {
    String process (String str);
}