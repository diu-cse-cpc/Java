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
public class CreditAccount extends BankAccount {

    private double creditLimit;

    public CreditAccount(String accountName, String accountNo,
            double balance, double creditLimit) {
        super(accountName, accountNo, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void widthdraw(double ammount) {
        if (ammount>creditLimit) {
            System.out.println("Operation Failed! Your cradit limit is "
                    +this.creditLimit);
        }else{
            super.widthdraw(ammount);
        }

    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

}
