package org.java.springsecurity.Abstraction.PriceList;

public class ArtObject extends ProductForSale{
    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " is a beautiful ");
        System.out.printf("The price of the piece $%6.2f", price);
        System.out.println(description);
    }

}
