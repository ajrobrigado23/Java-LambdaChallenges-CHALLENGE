package dev.lpa;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        /*
            Unary Operator -  is a special type of function, where all type arguments
            are the same reference type, String in this case.
         */

        // Challenge - 2 (Unary operator or Function interface)
        Function<String, String> outputResult = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }

            return returnVal.toString();
        };
        // Challenge - 3 (Print it all)
        System.out.println(outputResult.apply("1234567890"));
        // Challenge - 5 (Print the result returned from the method)
        System.out.println(everySecondCharacter(outputResult, "1234567890"));
        // Challenge - 6 (Write a lambda expression that is declared with the Supplier interface)
        Supplier<String> iLoveJava = () -> "I love Java!";
        // Challenge - 7 (Print that variable to the console)
        String supplierResult = iLoveJava.get(); // Using the method get()
        System.out.println(supplierResult);

    }

    // Challenge - 4 Instead of executing this function directly, suppose we want to pass it to a method.
    // Method that target for a lambda
    public static <T> T everySecondCharacter(Function<T, T> function, T source) {
        return function.apply(source);
    }
}
