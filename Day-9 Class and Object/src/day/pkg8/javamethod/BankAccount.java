/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg8.javamethod;


/**
 *
 * @author DELL
 */
public class BankAccount {
    static String accountNumber;
    private String accountName;
    private Address address;
    double ammount;
    int a=0;
    
    static {
        System.out.println("Static Block");
        
    }
    
    public BankAccount(String accountName, double ammount,
            Address address){
        
        System.out.println("Bank account has created");
        this.accountName = accountName;
        this.ammount = ammount;
        this.address = address;
        this.accountNumber="sadv-"+(a++);
        
        
    }
    
    public BankAccount(String accountName, double ammount){
        System.out.println("Bank account has created without address");
        this.accountName = accountName;
        this.ammount = ammount;
        this.accountNumber="sadv"+(a++);
        
    }

    public static void print(){
        System.out.println("Static method has called");
    }
    public BankAccount() {
        this.accountNumber="sadv"+(a++);
    }
    
    
    void deposite(double ammount){
        this.ammount = this.ammount+ammount;
        
        System.out.println("Successfully deposit "+ammount);
    }
    void withdraw(double ammount){
        
        if(ammount<=this.ammount){
        this.ammount=this.ammount-ammount;
        System.out.println("Successfully withdraw "+ammount);
        }else{
           System.out.println("You have not enough balance");
         
        }
    }
    
    void getAmmount(){
        System.out.println(this.ammount);
    }
    
}
