package org.java.springsecurity.Abstraction;

import java.util.Objects;

public class ABFish extends ABAnimal{
    public ABFish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Aquatic animal makes water sounds");
    }

    @Override
    public void move(String speed) {
        String s = (Objects.equals(speed, "fast")) ? "sinks" : "float";
        System.out.println(s);
    }
}
