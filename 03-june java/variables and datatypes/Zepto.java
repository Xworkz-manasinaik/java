class Zepto{
public static double takeOrder(String foodMenu){
//"Pizza" == "Pizza"
if(foodMenu == "kurkure"){
  return 10.00;
  }
  if(foodMenu == "apple juice"){         
  return 60.00;
  }
  if(foodMenu == "lays"){
  return 20.00;
  }
  if(foodMenu == "cheese slices"){
  return 70.00;
  }
  if(foodMenu == "chocolate box"){
  return 140.00;
  }
  if(foodMenu == "amul butter"){
  return 50.00;
  }
  if(foodMenu == "banana"){
  return 50.00;
  }
  if(foodMenu == "fruit"){
  return 100.00;
  }
  if(foodMenu == "vegetables"){
  return 50.00;
  }
  if(foodMenu == "atta"){
  return 199.00;
  }
  if(foodMenu == "rice"){
  return 159.00;
  }
  if(foodMenu == "oil"){
  return 109.00;
  }
  if(foodMenu == "chicken half kg"){
  return 199.00;
  }
  else{
  System.out.println(foodMenu + "Not found");
  }
  return 0.0;
  }
  }