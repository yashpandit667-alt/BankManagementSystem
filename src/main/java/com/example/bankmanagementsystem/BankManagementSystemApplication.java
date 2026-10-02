package com.example.bankmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankManagementSystemApplication.class, args);
        BankAccount Bankaccount = new BankAccount("Yash", 10_000);
        Bankaccount.displayAccount();
        Bankaccount.depositBalance(15000);
        Bankaccount.displayAccount();
        Bankaccount.withdrawBalance(3000);
        Bankaccount.displayAccount();
        Bankaccount.withdrawBalance(50000);
    }


}
