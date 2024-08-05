package org.java.springsecurity.Inheritance;

public class Animal {
    String color = "white";
    Animal() {
        System.out.println("Animal created");
    }
    void eat() {
        System.out.println("Carnivores");
    }
}
