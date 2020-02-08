/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpc.bank.management.system;

import com.cpc.bank.management.system.bank.account.BankAccount;
import com.cpc.bank.management.system.bank.account.CreditAccount;
import com.cpc.bank.management.system.bank.account.SavingsAccount;
import com.cpc.bank.management.system.customer.Customer;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        SavingsAccount sa1= new SavingsAccount
        ("Tirtho", "738434738", 20000);
        System.out.println(sa1.getBalance());
        sa1.widthdraw(250000);
        System.out.println(sa1.getBalance());
        
//        com.cpc.bank.management.system.customer
        //==========Credit Accoulnt===============
        CreditAccount ca1= new CreditAccount("Y", 
                "783477", 5000, 100000);
        ca1.widthdraw(10000);
        System.out.println(ca1.getBalance());
        
        Customer c= new Customer();
        c.getAddress().getPostCode();
    }
    
}
