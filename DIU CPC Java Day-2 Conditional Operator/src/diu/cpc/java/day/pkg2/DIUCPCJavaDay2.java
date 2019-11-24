/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diu.cpc.java.day.pkg2;

import java.util.Scanner;

/**
 *
 * @author lab-3
 */
public class DIUCPCJavaDay2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c, d;
        a = 50;
        b = 49;
        c = 30;
        d = 45;

//        System.out.println("Given Condition is "
//                + (a>b));
//        
//        System.out.println("Given Condition is "
//                + (a=b));
//        System.out.println("Given Condition is "
//                + (a<=b));
//        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mark :");
        int age = sc.nextInt();
//        if (age < 20) {
//            if (age < 12) {
//                System.out.println("You are child");
//            } else {
//                System.out.println("You are teenager");
//            }
//        }else{
//            System.out.println("Your age is more then 19");
//        }


        int number;
        number = sc.nextInt();
        if (number >= 80) {
            System.out.println("A+"); 
        } else if (number >= 79 && number <= 70) {
            System.out.println("A");
        }else if (number >= 69 && number <= 60) {
            System.out.println("A-");
        }else if (number >= 59 && number <= 50) {
            System.out.println("b");
        }else if (number >= 49 && number <= 40) {
            System.out.println("c");
        }else if (number >= 39 && number <= 33) {
            System.out.println("D");
        }else{
            System.out.println("F");
        }
        
       



    }
}
