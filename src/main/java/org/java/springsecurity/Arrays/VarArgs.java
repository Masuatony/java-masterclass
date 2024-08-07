package org.java.springsecurity.Arrays;

public class VarArgs {
    public static void main(String... args) {
       String[] strings = "Hello World".split(" ");
       printArray(strings);

        System.out.println("-".repeat(20));
        printArray("Hello");

        System.out.println("-".repeat(20));
        String[] newString = {"hello", "tony", "world"};
        System.out.println(String.join(",",newString));
        printArray(newString);

    }

    public static void printArray(String... numbers) {
        int len = numbers.length;
        System.out.println(len);
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
