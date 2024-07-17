class FiveStarChicken{
public static double takeOrder(String foodMenu){
//"Pizza" == "Pizza"
if(foodMenu == "Chicken roll") return 100.00;
  if(foodMenu == "chicken crispy burger") return 150.00;
  if(foodMenu == "chicken strips") return 120.00;
 
  if(foodMenu == "chicken popcorn") return 140.00;
  
  if(foodMenu == "chicken fingers") return 140.00;
  
  if(foodMenu == "masala fries") return 150.00;
  
  if(foodMenu == "chicken nuggets") return 150.00;
  
  if(foodMenu == "chicken tandoori") return 190.00;
  
  if(foodMenu == "seekh chicken") return 170.00;
  
  if(foodMenu == "tandoori roll") return 199.00;
  
  if(foodMenu == "chicken burger") return 159.00;
  
  if(foodMenu == "hungry bird") return 170.00;
  
  if(foodMenu == "chicken hot n smokey") return 199.00;
  
  else System.out.println(foodMenu + " Not found");
 
  return 0.0;
  }
  }