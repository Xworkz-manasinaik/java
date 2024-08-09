package com.xworkz.Laptopapp;

import com.xworkz.Laptopapp.Laptop.Laptop;
import com.xworkz.Laptopapp.MotherBoard.MotherBoard;

public class LaptopRunner {

    public static void main(String[] args) {

        System.out.println("MAIN METHOD STARTED");
        Laptop laptop=new Laptop();
       // Laptop laptop = new Laptop();
        laptop.minimumPrice = 100; // Set the minimum price for a motherboard

        MotherBoard motherBoard=new MotherBoard();
        motherBoard.brand = "ABC";
        motherBoard.model = "XYZ123";
        motherBoard.price = 150; // Price of the motherboard
        motherBoard.isCompatible = true;

        laptop.installMotherboard(motherBoard);

        System.out.println("MAIN ENDED");
    }

}
