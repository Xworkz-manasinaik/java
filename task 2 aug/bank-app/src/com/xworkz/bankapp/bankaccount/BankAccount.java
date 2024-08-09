package com.xworkz.bankapp.bankaccount;

public class BankAccount {
    static double balance;

    public static void debit(double amount){
        System.out.println("debit started");
        balance=balance-amount;
        System.out.println("debit ended");
    }

    public void credit(double amount){
        System.out.println("credit started");
        balance=balance+amount;
        System.out.println("credit ended");
    }

    public  double getBalance(){
        System.out.println("Balance Started");
        System.out.println("Balance ended");
        return balance;
    }

}
