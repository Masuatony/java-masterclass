package org.java.springsecurity.Abstraction.PriceList;

import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductForSale> storeProduct = new ArrayList<>();
    public static void main(String[] args) {
        storeProduct.add( new ArtObject("Oil Painting", 1200, "very expensive art"));
        storeProduct.add( new ArtObject("Harry Potter and the Philosopher's Stone", 150, "fantasy book"));
        storeProduct.add( new ArtObject("To Kill a Mockingbird", 180, "classic novel"));
        listProducts();

    }

    public static void listProducts( ) {
        for (var item: storeProduct) {
            System.out.println("_".repeat(30));
            item.showDetails();
        }
    }


}
