package org.java.springsecurity.Bank;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(Branch branch) {

        branches.add(branch);
    }

    public Branch findBranch(String name) {

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

}
