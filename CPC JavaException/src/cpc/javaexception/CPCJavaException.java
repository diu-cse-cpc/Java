/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpc.javaexception;

import java.util.Scanner;

/**
 *
 * @author rktirtho
 */
public class CPCJavaException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Occure a exception b'coz object is null. 
        Null Poinler exception
        */
        Person person = null;
        person.getName();
        
        
        /*
        Loop will run whilie i is greterthen o.
        I InputMissMatch exception would occoure when user gives a non integer input
        */
        int i = scanner.nextInt();
        while (i > 0) {            
            System.out.println("loop continue");
            
            // to know more abou try search in internet
            try {
                i = scanner.nextInt();
            } catch (Exception e) { //try through a exception, and catch block catch it to handle
                System.out.println("Please Give a number input");
            }        
        }

        //Arightmatic exception
        System.err.println(4/0);

    }

}
