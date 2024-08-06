package org.java.springsecurity.Classes;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance() {
        return distance(0,0);
    }

    public double distance(Point other) {
        return distance(other.x, other.y);
    }

    public double distance(int x, int y) {
        int dx = x - this.x;
        int dy = y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }


    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);
        System.out.println("Distance between p1 and p2: " + p1.distance());
    }

}
