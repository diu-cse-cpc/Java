/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpc.car;

/**
 *
 * @author DELL
 */
public class Car {

    private String model;
    private String brand;
    private String color;
    private String engine;
    private String password;
    private int door;
    private int year;
    private float fuel;
    private double prize;

    public Car(String model, String brand, String color,
            String engine, int door, int year, 
            double prize) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.door = door;
        this.year = year;
        this.prize = prize;
        this.password = "1234";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    public void start() {
        System.out.println("Your car has started....");
    }

    public void stop() {
        System.out.println("Your car has stoped....");
    }

    public void run(float km) {
        System.out.println("Car is running....");
        float fuelCost= (600f*km)/1000;
        System.out.println("Fuel costi for this trip "+fuelCost);
        fuel -= fuelCost;
    }

    public void reFueling(float fuel) {
        this.fuel += fuel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getFuel() {
        return fuel;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Model=" + model +
                "\nBrand="+ brand +
                "\nColor="+ color +
                "\nEngine=" + engine + 
                "\npassword=" + password +
                "\nDoor=" + door + 
                "\nyear=" + year + 
                "\nfuel=" + fuel + 
                "\nPrize=" + prize;
    }
    
    

}
