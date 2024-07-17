class HotelRunner{
public static void main(String []args){
	
Hotel.createfoodName("vada");
Hotel.addfoodPrice(15);
//System.out.println("is food name"); 
Hotel.createfoodName("idli");
Hotel.addfoodPrice(10);

Hotel.createfoodName("masala dosa");
Hotel.addfoodPrice(60);

Hotel.createfoodName("sheera");
Hotel.addfoodPrice(30);

Hotel.createfoodName("chow chow bath");
Hotel.addfoodPrice(30);

Hotel.createfoodName("onion dosa");
Hotel.addfoodPrice(40);




Hotel.getfood();
Hotel.getFoodPrice();
boolean foodNameUpdated = Hotel.updateFoodName("sheera","kesari bhath");
System.out.println("new food name is " + foodNameUpdated);
Hotel.getfood();


boolean foodNameDeleted =Hotel.deleteFoodName ("idli");
System.out.println("new food name is " + foodNameDeleted);
Hotel.getfood();
}
}

