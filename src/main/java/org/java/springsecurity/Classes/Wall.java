package org.java.springsecurity.Classes;

public class Wall {
    private double height;
    private double width;

    public Wall(double height, double width) {
        if (height < 0 || width < 0) {
            this.height = 0;
            this.width = 0;
        } else {
            this.height = height;
            this.width = width;
        }
    }
    public Wall() {
    }

    public void setHeight(double height) {
//        if (height < 0) {
//            this.height = 0;
//        } else {
//            this.height = height;
//        }

        this.width = height < 0 ? 0 : height;
    }

    public void setWidth(double width) {
//        if (width < 0) {
//            this.width = 0;
//        } else {
//            this.width = width;
//        }
        this.height = width < 0 ? 0 : width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return height * width;
    }

    public static void main(String[] args) {
        Wall wall = new Wall(-5,-4);
        System.out.println("area= " + wall.getArea());
    }
}
