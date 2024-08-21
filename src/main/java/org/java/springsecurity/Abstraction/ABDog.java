package org.java.springsecurity.Abstraction;

import java.util.Objects;

public class ABDog extends ABAnimal{
    public ABDog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeSound() {

        String s = (Objects.equals(type, "Wolf")) ? "Howling! " : "Bark";
        System.out.println(s);
    }

    @Override
    public void move(String speed) {
//        ABAnimal animal = new ABAnimal()
        if (speed.equalsIgnoreCase(" :slow")) {
            System.out.println(getExplicitType() + " :walks");
        } else {
            System.out.println(getExplicitType() + " :Running");
        }
    }
}
