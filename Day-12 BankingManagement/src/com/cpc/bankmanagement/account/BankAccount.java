package com.cpc.bankmanagement.account;


public class BankAccount {
    private String accNo;
    private String accName;
    private double balance;

    public BankAccount(String accNo, String accName) {
        this.accNo = accNo;
        this.accName = accName;
    }
    
    
    
    
    public void deposite(double ammount){
        balance+=ammount;
    }
    public void widthdraw(double ammount){
        balance-=ammount;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public double getBalance() {
        return balance;
    }

    
    
    
    
    
}
