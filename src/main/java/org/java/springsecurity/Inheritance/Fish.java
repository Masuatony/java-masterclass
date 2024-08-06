package org.java.springsecurity.Inheritance;

public class Fish extends Animal{
    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void  moveMuscles() {
        System.out.print("Muscles moving");

    }
    private void moveBackFins() {
        System.out.print("Backfin moves");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
       if (speed == "fast") {
           moveBackFins();
       }
        System.out.println();
    }

    public static void main(String[] args) {
        Fish fish = new Fish("Goldfish", 0.1, 4, 2);
        doAnimalStuff(fish, "fast");
    }
}
