package org.java.springsecurity.Bank;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }
    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
}
