package com.xworkz.supermarket;

import com.xworkz.supermarket.SuperMarket.SuperMarket;
import com.xworkz.supermarket.Worker.Worker;

public class SuperMarkerRunner {

    public static void main(String[] args) {

        System.out.println("MAIN METHOD STARTED");


        SuperMarket superMarket=new SuperMarket();
        superMarket.hiringThresholdSalary = 3000; // Set the threshold salary for hiring

        Worker worker=new Worker();
       // Worker worker = new Worker();
        worker.name = "John Doe";
        worker.position = "Cashier";
        worker.salary = 3500; // Salary of the worker
        worker.isAvailable = true;

        superMarket.hireWorker(worker);

        System.out.println("MAIN ENDED");
    }

}
