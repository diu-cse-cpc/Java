/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpc;

import com.cpc.car.Car;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        System.out.println("----------------Car 1------------------");
        Car car1 = new Car("VM-45", "Ferrari","Blue","2000CC",
        4,2010,20000000);
        car1.reFueling(20);
        System.out.println(car1.getFuel());
        car1.run(20);
        System.out.println("Fuel "+car1.getFuel());
        System.out.println("Password "+car1.getPassword());
        
        
        
        System.out.println("----------------Car 2------------------");
        Car car2 = new Car("FX-45", "Toyeta","Blue","800CC",
        2,2000,2000000);
        car2.reFueling(23);
        System.out.println(car2.getFuel());
        car2.run(13);
        System.out.println("Fuel "+car2.getFuel());
        System.out.println("Password "+car2.getPassword());
        
        System.out.println("----------------Car 2------------------");
        Car car3 = new Car("CW-45", "BMW","Orrange","1000CC",
        2,2015,3000000);
        car3.reFueling(23);
        System.out.println(car3.getFuel());
        car3.run(13);
        System.out.println("Fuel "+car3.getFuel());
        System.out.println("Password "+car3.getPassword());
        
        
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        System.out.println("");
        for (Car car : cars) {
            System.out.println(car.toString());
            System.err.println();
        }
        
    }
    
}
