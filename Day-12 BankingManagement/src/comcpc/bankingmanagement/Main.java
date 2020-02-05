/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comcpc.bankingmanagement;

import com.cpc.bankmanagement.account.CurrentAccount;
import com.cpc.bankmanagement.account.SavingsAccount;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SavingsAccount sa1= new SavingsAccount
        ("223 4783 793483", "Rejaul Karim");
        sa1.deposite(50000);
        System.out.println("Account Balance :"
                +sa1.getBalance());
        
        CurrentAccount ca1= new CurrentAccount("CA 74394", "X");
        ca1.getAccNo();
        
        
        
        
    }
    
}
