class Dominos{
public static double takeOrder(String foodMenu){
//"Pizza" == "Pizza"
if(foodMenu == "margarita pizza"){
  return 100.00;
  }
  if(foodMenu == "chicken tikka pizza"){
  return 150.00;
  }
  if(foodMenu == "cheese corn pizza"){
  return 200.00;
  }
  if(foodMenu == "peppy paneer pizza"){
  return 400.00;
  }
  if(foodMenu == "indi tandoori pizza"){
  return 400.00;
  }
  if(foodMenu == "veg Extravaganza"){
  return 500.00;
  }
  if(foodMenu == "pepper barbeque pizza"){
  return 500.00;
  }
  if(foodMenu == "chicken sausage pizza"){
  return 600.00;
  }
  if(foodMenu == "chili chicken pizza"){
  return 500.00;
  }
  if(foodMenu == "non veg supreme"){
  return 699.00;
  }
  if(foodMenu == "chicken fiesta pizza"){
  return 559.00;
  }
  if(foodMenu == "indi chicken pizza"){
  return 470.00;
  }
  if(foodMenu == "chicken peporoni"){
  return 599.00;
  }
  else{
  System.out.println(foodMenu + "Not found");
  }
  return 0.0;
  }
  }