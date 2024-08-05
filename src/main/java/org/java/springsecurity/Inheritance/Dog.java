package org.java.springsecurity.Inheritance;

public class Dog extends Animal {
    String color = "black";
    void bark() {
        System.out.println("bark bark bark");
    }
    Dog() {
        super();
        System.out.println("Dog constructor");
    }

    @Override
    void eat() {
        super.eat();
//        System.out.println("Dog eating");
    }
    void displayColor() {
        System.out.println("Dog color: " + super.color);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
//        dog.color = "blue";
        dog.bark();
        dog.displayColor();
    }
    
}
