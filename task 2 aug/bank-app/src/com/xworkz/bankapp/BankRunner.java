package com.xworkz.bankapp;

import com.xworkz.bankapp.bankaccount.BankAccount;
import com.xworkz.bankapp.currentaccount.CurrentAccount;
import com.xworkz.bankapp.savingsaccount.SavingsAccount;

public class BankRunner {
    public static void main(String[] args) {
        //BankAccount ref=new BankAccount();
        //BankAccount ref=new CurrentAccount();
        //BankAccount ref=new SavingsAccount();
        SavingsAccount ref=new CurrentAccount();
        ref.debit(3000.00);
        ref.getBalance();
    }
}
