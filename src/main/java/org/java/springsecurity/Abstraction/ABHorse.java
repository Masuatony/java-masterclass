package org.java.springsecurity.Abstraction;

public class ABHorse extends Mammal{
    public ABHorse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " :Mammals always shed hair: ");
    }
}
