package org.java.springsecurity.Abstraction;

import lombok.Data;
import org.java.springsecurity.Inheritance.Animal;

import java.util.ArrayList;

abstract class Mammal extends ABAnimal {

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }
    public void makeSound() {
        System.out.println("Mammal makes sound");
    }

    @Override
    public void move(String speed) {
        System.out.println(type + " moves by animas " + speed);
    }

    public abstract void shedHair();
}

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
    public final String getExplicitType() {
        return getClass().getSimpleName() + "( " +type +")";
    }

    public static void main(String[] args) {
        ABAnimal animal = new ABDog("Dog", "Large", 5);
        System.out.println(animal.getExplicitType());
        animal.makeSound();
        animal.move("fast");
        doAnimalStuff(animal);

        ArrayList<ABAnimal> animals = new ArrayList<>();
        animals.add(new ABDog("Dog", "Large", 5));
        animals.add(new ABFish("Cat", "Small", 2));
        animals.add(new ABFish("Goldfish", "small", 1));
        animals.add(new ABFish("Barracuda", "big", 75));
        animals.add(new ABDog("German Shephard", "small", 5));
        animals.add(new ABHorse("stallion", "large", 2000));

        for (ABAnimal animalPet : animals) {
            doAnimalStuff(animalPet);

            if (animalPet instanceof Mammal curr) {
                curr.shedHair();
            }
        }
    }

    private static void doAnimalStuff(ABAnimal abAnimal) {
        abAnimal.makeSound();
        abAnimal.move("slow");
        System.out.println(abAnimal);
    }
}
