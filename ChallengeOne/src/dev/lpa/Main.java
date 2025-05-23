package dev.lpa;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        // Challenge - 1 (Using the Consumer interface)
        Consumer<String> printTheParts = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };
        // Execute the accept method
        printTheParts.accept("Let's split this up into an array");
    }
}
