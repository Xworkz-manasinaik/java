package com.xworkz.supermarket.SuperMarket;

import com.xworkz.supermarket.Worker.Worker;

public class SuperMarket {

     Worker worker;
    public double hiringThresholdSalary; // Threshold salary for hiring

    public boolean hireWorker(Worker worker) {
        boolean isHired = false;
        if (worker != null && worker.salary >= hiringThresholdSalary) {
            System.out.println("Worker's salary meets the hiring criteria.");
            if (worker.isAvailable) {
                this.worker = worker;
                this.worker.isAvailable = false; // Mark the worker as hired
                this.worker.displayDetails();
                isHired = true;
                System.out.println("Worker successfully hired.");
            } else {
                System.out.println("Worker is not available.");
            }
        } else {
            System.out.println("Worker's salary does not meet the hiring criteria or worker is not available.");
        }
        return isHired;
    }
}
