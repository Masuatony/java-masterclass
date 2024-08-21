package org.java.springsecurity.Bank;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branch) {
        if (findBranch(branch) == null) {
            branches.add(new Branch(branch));
            return true;
        }

        return true;
    }

    private Branch findBranch(String name) {

//        for (int i = 0; i < branches.size(); i++) {
//            Branch checked = branches.get(i);
//
//            if (checked.getName().equals(name)) {
//                return checked;
//            }
//        }
        for (Branch branch : branches) {
            if (branch.getName().equalsIgnoreCase(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {

        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customer, double amount) {
        Branch  branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customer, amount);

        }
        return false;
    }

    public boolean removeCustomer(String branchName, String customerName) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.removeCustomerTransaction(customerName);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Cust details: "+ branch.getName());
        }
        ArrayList<Customer> branchCustomers = branch.getCustomers();
        for (Customer customer: branchCustomers) {
            System.out.println(customer.getName() + ": " + customer.getTransactions());
            if (showTransaction) {
                System.out.println("Transactions: ");

                ArrayList<Double> transactions = customer.getTransactions();
                for (Double transaction : transactions) {
                    System.out.println("trans+ " + transaction);
                }

            }
        }
        return true;
    }


    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "John", 123);
        bank.addCustomer("Sydney", "Jane", 456);

        bank.addCustomerTransaction("Sydney", "John", 3231);
        bank.addCustomerTransaction("Sydney", "Jane", 234);

        bank.listCustomers("Sydney", true);
    }



}
