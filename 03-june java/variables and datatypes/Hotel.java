import java.util.*;
class Hotel{
static String name = "Udupi Upahar";

//dattypes arrayVariable[] = {value}
static String foodNames[] = {null,null,null,null,null,null};
static double foodPrices[] = {0.0, 0.0 ,0.0 ,0.0 ,0.0 ,0.0};
static int index;
static int foodPriceindex;

//add foodName in foodNames index positions(ref)
//String foodName = "masal dosa"
public static boolean createfoodName(String foodName){
boolean isfoodNameCreated = false;

//validation 
//6>6
//index = length -1
if(index < foodNames.length){
if(foodName != null){
foodNames[index] = foodName;
index++;
isfoodNameCreated = true;
}
else 
System.out.println("food name is null,cannot be defined");
}
else
System.out.println("food name is full...Amele nodona");

return isfoodNameCreated;
}
//ADDPRICE
public static boolean addfoodPrice(double foodPrice)
{
	boolean isPriceAdded = false;
	if(foodPrice>0.0){
	foodPrices[foodPriceindex] = foodPrice;
	foodPriceindex++;
	isPriceAdded =true;
}else
	System.out.println("food price is null,cannot be defined");
return isPriceAdded;
}
		//GET FOOD
public static void getfood(){
System.out.println("The available food variety are : ");
for(String foodName:foodNames){
System.out.println(foodName);
}
}
//GET PRICE
public static void getFoodPrice(){
System.out.println("The available food price are : ");
for(double foodPrices:foodPrices){
System.out.println(foodPrices);
}
}

//UPDATE FOODNAME
public static boolean updateFoodName(String oldFoodName,String newFoodName){
	System.out.println("updateFoodName is started");
	boolean isfoodNameUpdated = false;
	for (int index = 0; index <foodNames.length; index++ ){
		if(oldFoodName == foodNames[index]){
			foodNames[index] = newFoodName;
			isfoodNameUpdated = true;
		}
	}
if (isfoodNameUpdated==false){
	System.out.println(oldFoodName + "not found");
}

	System.out.println("updateFoodName is ended");
return isfoodNameUpdated;
}

//DELETE FOODNAME
public static boolean deleteFoodName(String foodNameToBeDeleted){
	boolean isFoodNameDeleted =false;
	int oldindex,newindex;
	for(newindex = 0,oldindex= 0; oldindex<foodNames.length; oldindex++){
		if(foodNames[oldindex] !=foodNameToBeDeleted)
		{
			foodNames[newindex] =foodNames[oldindex] ;
			newindex++;
		}else isFoodNameDeleted = true;
	}
	foodNames = Arrays.copyOf(foodNames , newindex);
	
	
		if(isFoodNameDeleted == false){
			System.out.println(foodNameToBeDeleted +"not found");
		}
		return isFoodNameDeleted;
}
	
}