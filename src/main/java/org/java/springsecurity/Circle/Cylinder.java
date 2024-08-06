package org.java.springsecurity.Circle;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        System.out.println("radius: {} " + circle.getRadius());
        System.out.println("area: {} " + circle.getArea());
        Cylinder cylinder = new Cylinder(4.2, 5.7);
        System.out.println("height: {} " + cylinder.getHeight());
        System.out.println("Volume : {} "+ cylinder.getVolume());
    }
}
