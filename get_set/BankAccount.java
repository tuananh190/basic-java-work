package get_set;

import java.util.Scanner;

public class BankAccount {
    private String accountHolder;
    private double balance; //  số dư tài khoản

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;

        } else {
            System.out.println("só dư không được âm");
        }
    }

    public void withdraw(double amount) { // số tiền
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("rút được" + "" + amount + "" + balance);
        } else {
            System.out.println("số tiền rút không hợp lệ doặc số dư không đủ ");
        }
    }
}

