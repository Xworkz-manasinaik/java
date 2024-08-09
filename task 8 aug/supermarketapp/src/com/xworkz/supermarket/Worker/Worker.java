package com.xworkz.supermarket.Worker;

public class Worker {

    public String name;
    public String position;
    public double salary;
    public boolean isAvailable;

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Position: " + this.position);
        System.out.println("Salary: " + this.salary);
        System.out.println("Availability: " + (this.isAvailable ? "Available" : "Not Available"));
    }
}
