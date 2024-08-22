package org.java.springsecurity.Abstraction.PriceList;

import java.util.ArrayList;



public class Store {
    private static ArrayList<ProductForSale> storeProduct = new ArrayList<>();
    public static void main(String[] args) {
        storeProduct.add( new ArtObject("Oil Painting", 1200, "very expensive art"));
        storeProduct.add( new ArtObject("Harry Potter and the Philosopher's Stone", 150, "fantasy book"));
        storeProduct.add( new ArtObject("To Kill a Mockingbird", 180, "classic novel"));
        storeProduct.add(new Furniture("Desk", 500,
                "Mahogany Desk"));

        storeProduct.add(new Furniture("Lamp", 200,
                "Tiffany Lamp with Hummingbirds"));
        System.out.println("\n--------------------------------");

        var order = new ArrayList<OrderItem>();
        addItemOrder(order, 0, 3);
        printOrder(order);


        listProducts();

    }

    public static void listProducts( ) {
        for (var item: storeProduct) {
            System.out.println("_".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty,storeProduct.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double totalPrice = 0;
        for (var item: order) {
           item.productForSale().printPricedItem(item.qty());
           totalPrice += item.productForSale().getSalesPrice(  item.qty());

        }
        System.out.println("Total Price: " + totalPrice);
    }
}
