package food;

public class Food {


    public String foodName ;

    public int price;
    public  int quantity;

    public String hotelName;


    public void displayDetails(){
        System.out.println("The Food Name of the order is:" +this.foodName);
        System.out.println("The Amount of food is:" +this.price);
        System.out.println("The total number of quantity is:" +this.quantity);
        System.out.println("The name of the hotel is:" +this.hotelName);


    }
}


