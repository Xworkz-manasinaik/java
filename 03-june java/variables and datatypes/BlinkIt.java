class BlinkIt{
public static double takeOrder(String foodMenu){
//"Pizza" == "Pizza"
if(foodMenu == "Lay's"){
  return 10.00;
  }
  if(foodMenu == "kurkure"){
  return 10.00;
  }
  if(foodMenu == "Uncle chips"){
  return 20.00;
  }
  if(foodMenu == "Cheetos"){
  return 40.00;
  }
  if(foodMenu == "bingo"){
  return 40.00;
  }
  if(foodMenu == "papaya"){
  return 50.00;
  }
  if(foodMenu == "apple"){
  return 150.00;
  }
  if(foodMenu == "mosumbi"){
  return 50.00;
  }
  if(foodMenu == "spinach"){
  return 20.00;
  }
  if(foodMenu == "brocoli"){
  return 69.00;
  }
  if(foodMenu == "Haldirams bhujia"){
  return 159.00;
  }
  if(foodMenu == "act 2 popcorn"){
  return 40.00;
  }
  if(foodMenu == "pepsi"){
  return 59.00;
  }
  else{
  System.out.println(foodMenu + "Not found");
  }
  return 0.0;
  }
  }