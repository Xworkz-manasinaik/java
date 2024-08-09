package com.xworkz.hotel.Hotel;

import com.xworkz.hotel.Room.Room;

public class Hotel {

         Room room;
        public int ratings;

        public boolean bookRoom(Room room) {
            boolean isBooked = false;
            if (ratings >= 4) {
                System.out.println("Ratings are sufficient for booking.");
                if (room != null && room.isAvailable) {
                    this.room = room;
                    this.room.isAvailable = false; // Mark the room as booked
                    this.room.displayDetails();
                    isBooked = true;
                    System.out.println("Room successfully booked.");
                } else {
                    System.out.println("Room is not available or not found.");
                }
            } else {
                System.out.println("Booking not possible. Ratings are too low.");
            }
            return isBooked;
        }
    }
