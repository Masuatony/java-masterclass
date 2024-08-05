package org.java.springsecurity.Classes;

import lombok.Data;

@Data
public class ConstructorsExample {
    private String name;
    private int age;
    private String description;

    public ConstructorsExample() {
        this("Default Name", 0, "Default Description");
        System.out.println("constructor called {}: 0");
    }
    public ConstructorsExample(String name, int age, String description) {
        System.out.println("ConstructorsExample with Args : ");
        this.name = name;
        this.age = age;
        this.description = description;
    }


    public static void main(String[] args) {
        ConstructorsExample example1 = new ConstructorsExample("John Doe", 30, "Good Boy");
        System.out.println(example1);

        ConstructorsExample example2 = new ConstructorsExample();
        System.out.println(example2);
    }
}
