package org.java.springsecurity.Area;

public class CalculateArea {
    private Floor floor;
    private Carpet carpet;

    public CalculateArea(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }


    public double getTotalCost( ) {
        double totalCost = 0;
        double area = floor.getArea();
        double cost = carpet.getCost();

        totalCost = area * cost;

        return totalCost;
    }

    public static void main(String[] args) {
        Floor floor = new Floor(10, 5);
        Carpet carpet = new Carpet(2);

        CalculateArea calculateArea = new CalculateArea(floor, carpet);
        double totalCost = calculateArea.getTotalCost();
        System.out.println("Total cost: " + totalCost);
    }

}
