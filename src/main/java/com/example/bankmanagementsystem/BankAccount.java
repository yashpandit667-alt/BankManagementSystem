package com.example.bankmanagementsystem;

public class BankAccount {

    private String accountHolder;
    private double balance;

//    public void setAccountHolder(String accountHolder) {
//        this.accountHolder = accountHolder;
//    }
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
    public void depositBalance(double balance) {
        this.balance += balance;
    }
    public  double withdrawBalance(double withdrawal) {
        if (withdrawal <= this.balance) {
            System.out.println(this.accountHolder + " you have succesfully withdraw and final amount " +(this.balance -= withdrawal));
        }else {
            System.out.println("Insufficient funds");
        }
        return this.balance;
    }
 public void displayAccount() {
     System.out.println("Account Holder: " + this.accountHolder);
     System.out.println("Balance: " + this.balance);
 }

}
