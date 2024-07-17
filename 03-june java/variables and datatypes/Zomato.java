class Zomato{
public static double takeOrder(String foodMenu){
//"Pizza" == "Pizza"
if(foodMenu == "chocolate cake"){
  return 199.00;
  }
  if(foodMenu == "banana milkshake"){
  return 70.00;
  }
  if(foodMenu == "strawberry milkshake"){
  return 60.00;
  }
  if(foodMenu == "vanilla milkshake"){
  return 40.00;
  }
  if(foodMenu == "mango milkshake"){
  return 40.00;
  }
  if(foodMenu == "butterstoch milkshake"){
  return 15.00;
  }
  if(foodMenu == "melon milkshake"){
  return 15.00;
  }
  if(foodMenu == "watermelon juice"){
  return 40.00;
  }
  if(foodMenu == "cane juice"){
  return 50.00;
  }
  if(foodMenu == "melon juice"){
  return 99.00;
  }
  if(foodMenu == "coffee"){
  return 15.00;
  }
  if(foodMenu == "tea"){
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
  public static double takeOrder(String foodMenu , int Q){
  if(foodMenu == "chocolate cake"){
  return 199.00 * Q;
  }
  if(foodMenu == "banana milkshake"){
  return 70.00 * Q;
  }
  if(foodMenu == "strawberry milkshake"){
  return 60.00 * Q;
  }
  if(foodMenu == "vanilla milkshake"){
  return 40.00 * Q;
  }
  if(foodMenu == "mango milkshake"){
  return 40.00 * Q;
  }
  if(foodMenu == "butterstoch milkshake"){
  return 15.00 * Q;
  }
  if(foodMenu == "melon milkshake"){
  return 15.00 * Q;
  }
  if(foodMenu == "watermelon juice"){
  return 40.00 * Q;
  }
  if(foodMenu == "cane juice"){
  return 50.00 * Q;
  }
  if(foodMenu == "melon juice"){
  return 99.00 * Q;
  }
  if(foodMenu == "coffee"){
  return 15.00 * Q;
  }
  if(foodMenu == "tea"){
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