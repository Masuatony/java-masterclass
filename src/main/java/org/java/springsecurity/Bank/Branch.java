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

    public boolean newCustomer(String customer, double initialTransaction) {
            if (findCustomer(customer) == null) {
                customers.add(new Customer(customer, initialTransaction));
                return true;
            }
        return false;
    }

//    public boolean addCustomerTransaction(String customerName, double amount) {
//
//    }

    public Customer findCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer customer = findCustomer(customerName);
        if (customer!= null) {
            customer.addTransaction(amount);
            return true;
        }
        return false;
    }

    public boolean removeCustomerTransaction(String customerName){
        Customer customer = findCustomer(customerName);
        if (customer!= null) {
            customers.remove(customerName);
            return true;
        }
        return false;
    }




}
