package org.java.springsecurity.Classes;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
//import lombok.Getter;

@Data
@Slf4j
public class Classes {
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void depositBalance(double depositAmount) {
        balance += depositAmount;
        System.out.println("deposit" + this.balance);
    }

    public void withdrawBalance(double withdrawAmount) {
        log.info("Current balance: {}", balance);
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println("withdraw:" + "$" + withdrawAmount + " Balance: "+ this.balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args) {
        Classes classes = new Classes();
        classes.setCustomerName("John Doe");
        classes.setCustomerEmail("johndoe@example.com");
        classes.setCustomerPhone("1234567890");
        classes.setBalance(1200);
        classes.depositBalance(1000.00);

        classes.withdrawBalance(1000);


    }

}
