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
public class Day8JavaMethod {
    int a;
    public static void main(String[] args) {
        Address address = new Address();
        BankAccount account1 = new BankAccount("Tirtho",
                 400000, address);
        Day8JavaMethod djm = new Day8JavaMethod();
        BankAccount account2 = new BankAccount("Test", 2000000);
        BankAccount account3 = new BankAccount();
        account1.deposite(50000);
        account1.getAmmount();
        account1.withdraw(400000);
        account1.getAmmount();
        System.out.println(account2.accountNumber);
        BankAccount.print();
    }

//    public static int add(int a, int b){
//        return a+b;
//    }
//    
//     public static int add(int a, int b,int c){
//        return a+b+c;
//    }
//     
//     public static float add(float a, int b,int c){
//        return a+b+c;
//    }
//     public static float add(int a, float b,int c){
//        return a+b+c;
//    }
//    
}
