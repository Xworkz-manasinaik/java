package com.xworkz.hotel.Room;

public class Room {

        public int roomNumber;
        public String roomType;
        public int price;
        public boolean isAvailable;

        public void displayDetails() {
            System.out.println("Room Number: " + this.roomNumber);
            System.out.println("Room Type: " + this.roomType);
            System.out.println("Price per Night: " + this.price);
            System.out.println("Availability: " + (this.isAvailable ? "Available" : "Not Available"));
        }
    }
