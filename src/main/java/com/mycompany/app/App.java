package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    // private final String message = "Hello World123!";
    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
