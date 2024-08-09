package com.xworkz.Laptopapp.MotherBoard;

public class MotherBoard {

    public String brand;
    public String model;
    public double price;
    public boolean isCompatible;

    public void displayDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
        System.out.println("Compatibility: " + (this.isCompatible ? "Compatible" : "Not Compatible"));
    }
}
