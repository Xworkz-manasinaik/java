package com.xworkz.hotel;

import com.xworkz.hotel.Hotel.Hotel;
import com.xworkz.hotel.Room.Room;

public class HotelRunner {


        public static void main(String[] args) {

            System.out.println("MAIN METHOD STARTED");

            Hotel hotel=new Hotel();
            hotel.ratings = 5; // Set ratings for the hotel

            Room room=new Room();
            room.roomNumber = 101;
            room.roomType = "Deluxe";
            room.price = 2000;
            room.isAvailable = true;

            hotel.bookRoom(room);

            System.out.println("MAIN ENDED");
        }
}
