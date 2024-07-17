class FoodPanda{
public static double takeOrder(String foodMenu){
//"Pizza" == "Pizza"
if(foodMenu == "idli"){
  return 10.00;
  }
  if(foodMenu == "vada"){
  return 15.00;
  }
  if(foodMenu == "maddur vada"){
  return 20.00;
  }
  if(foodMenu == "chow chow bhath"){
  return 40.00;
  }
  if(foodMenu == "veg cutlet"){
  return 40.00;
  }
  if(foodMenu == "rice bhath"){
  return 50.00;
  }
  if(foodMenu == "lemon rice"){
  return 50.00;
  }
  if(foodMenu == "chicken 65"){
  return 100.00;
  }
  if(foodMenu == "chili chicken"){
  return 150.00;
  }
  if(foodMenu == "mutton biryani"){
  return 199.00;
  }
  if(foodMenu == "chicken biryani"){
  return 159.00;
  }
  if(foodMenu == "mutton chops"){
  return 170.00;
  }
  if(foodMenu == "chicken butter masala"){
  return 199.00;
  }
  else{
  System.out.println(foodMenu + "Not found");
  }
  return 0.0;
  }
  }