class Swiggy{
public static double takeOrder(String foodMenu){
//"Pizza" == "Pizza"
if(foodMenu == "Pizza"){
  return 199.00;
  }
  if(foodMenu == "Burger"){
  return 70.00;
  }
  if(foodMenu == "pasta"){
  return 60.00;
  }
  if(foodMenu == "macoroni"){
  return 40.00;
  }
  if(foodMenu == "chiken tikka pizza"){
	  
  return 40.00;
  }
  if(foodMenu == "samosa"){
  return 15.00;
  }
  if(foodMenu == "kachori"){
  return 15.00;
  }
  if(foodMenu == "aloo bun"){
  return 40.00;
  }
  if(foodMenu == "sandwich"){
  return 50.00;
  }
  if(foodMenu == "chicken puff"){
  return 99.00;
  }
  if(foodMenu == "veg puff"){
  return 15.00;
  }
  if(foodMenu == "egg puff"){
  return 10.00;
  }
  if(foodMenu == "mango juice"){
  return 99.00;
  }
  else{
  System.out.println(foodMenu + "Not found");
  }
  return 0.0;
  }
  public static double takeOrder(String foodMenu,int Q){
  double prize=0.0;
	if(foodMenu == "Pizza"){
  return 199.00 * Q;
  }
  if(foodMenu == "Burger"){
  return 70.00 * Q;
  }
  if(foodMenu == "pasta"){
  return 60.00 * Q;
  }
  if(foodMenu == "macoroni"){
  return 40.00 * Q;
  }
  if(foodMenu == "chiken tikka pizza"){
	  
  return 40.00 * Q;
  }
  if(foodMenu == "samosa"){
  return 15.00 * Q;
  }
  if(foodMenu == "kachori"){
  return 15.00 * Q;
  }
  if(foodMenu == "aloo bun"){
  return 40.00 * Q;
  }
  if(foodMenu == "sandwich"){
  return 50.00 * Q;
  }
  if(foodMenu == "chicken puff"){
  return 99.00 * Q;
  }
  if(foodMenu == "veg puff"){
  return 15.00 * Q;
  }
  if(foodMenu == "egg puff"){
  return 10.00 * Q;
  }
  if(foodMenu == "mango juice"){
  return 99.00 * Q;
  }
  else{
  System.out.println(foodMenu + "Not found");
  }
  return 0.0 * Q;
	}
  }
  