package org.java.springsecurity.Abstraction;

import lombok.Data;

@Data
public abstract class ABAnimal {
    protected String type;
    private String size;
    private double weight;

    public ABAnimal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void makeSound();
    public abstract void move(String speed);
}
