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
public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountName, String accountNo,
            double balance) {
        super(accountName, accountNo, balance);
    }

    @Override
    public void widthdraw(double ammount) {
        if (ammount>getBalance()) {
            System.out.println("You have not enough balance");
            }else{
            super.widthdraw(ammount);
        }
 
    }
    
    
    
}
