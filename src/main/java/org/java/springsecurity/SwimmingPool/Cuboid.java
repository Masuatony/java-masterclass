package org.java.springsecurity.SwimmingPool;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return super.getArea() * height;
    }

    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(4, 3, 2);
        System.out.println("Volume = " + cuboid.getVolume());
    }
}
