package com.xworkz.Laptopapp.Laptop;

import com.xworkz.Laptopapp.MotherBoard.MotherBoard;

public class Laptop {

   MotherBoard motherBoard;
    public double minimumPrice; // Minimum price for a motherboard to be considered

    public boolean installMotherboard(MotherBoard motherboard) {
        boolean isInstalled = false;
        if (motherboard != null ) {
            System.out.println("Motherboard's price meets the criteria.");
            if (motherboard.isCompatible) {
                this.motherBoard = motherboard;
                this.motherBoard.displayDetails();
                isInstalled = true;
                System.out.println("Motherboard successfully installed.");
            } else {
                System.out.println("Motherboard is not compatible.");
            }
        } else {
            System.out.println("Motherboard's price does not meet the criteria or motherboard is not compatible.");
        }
        return isInstalled;
    }

}
