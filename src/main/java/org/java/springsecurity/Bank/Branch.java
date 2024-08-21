package org.java.springsecurity.Bank;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;
    }

    public boolean newCustomer(Customer customer, double initialTransaction) {
        if (customer.getName().equalsIgnoreCase(name)) {
            customers.add(customer);
            customer.addTransaction(initialTransaction);
            return true;
        }
        return false;
    }

//    public Branch findBranch(String branchName) {
////        if ()
//        for (int i = 0; i < .size(); i)
//    }
}
