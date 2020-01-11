/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tirtho;

/**
 *
 * @author DELL
 */
public class App {
    
public static void main(String[] args) {
    Teacher teacher = new Teacher();
    Address address = new Address();
    
    address.houseNo="60/C";
    address.block="C";
    address.post="Dhaka";
    address.street="Dhaka";
    
    teacher.name="Samsu";
    teacher.age=70;
    teacher.salary=70000;
    teacher.performance="good";
    teacher.address=address;
    
    
    System.out.println(teacher.name);
    System.out.println(teacher.address.houseNo);
    
    
        int result = power(2, 3);
//        System.out.println(result);
        
        
        int result2= power(3, 4);
        // TODO code application logic here
    }
    
   public static int power(int number, int power){
       int result =1;
       
       for(int i=1; i<=power; i++){
           result =result*number;
       }
       return result;
   }
    
}
