/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpc.bank.management.system.bank.account;

/**
 *
 * @author DELL
 */
public class BankAccount {
    private String accountName;
    private String accountNo;
    private double balance;

    public BankAccount(String accountName, String accountNo,
            double balance) {
        this.accountName = accountName;
        this.accountNo = accountNo;
        this.balance = balance;
    }
    
    
    
    public void deposite(double ammount){
        balance+=ammount;
        System.out.println("Deposite Successfuly "
                +ammount+" BDT.");
    }
    
    public void widthdraw(double ammount){
        balance -= ammount;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    
    
}
