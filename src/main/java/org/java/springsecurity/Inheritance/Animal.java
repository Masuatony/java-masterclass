package org.java.springsecurity.Inheritance;

public class Animal {
//    String color = "white";
    protected String type;
    private String size;
    private double weight;
    public Animal() {
        System.out.println("Animal created");
    }
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed ) {
        System.out.println(type + " moves " + speed);
    }
    public void makeNoise() {
        System.out.println(type + " makes some noise ");
    }

    void eat() {
        System.out.println("Carnivores");
    }
    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
