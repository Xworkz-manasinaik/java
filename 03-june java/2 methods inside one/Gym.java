import java.util.*;
class Gym{
static String gymEquipments[]={null,null,null,null,null,null,null,null};
static int index;
static double amount[]={0,0,0,0,0,0,0,0};
static int priceIndex;


public static boolean addEquipment(String name){
boolean isEquipmentValid=false;

if(name !=null){
        gymEquipments[index]  =name;
		index++;
		isEquipmentValid=true;
}
else System.out.println("provide valid equipment");

return isEquipmentValid;

}
public static boolean addPrice(double price){
boolean isPriceValid=false;
if(price>0){
       amount[priceIndex] = price;
	   priceIndex++;
	   isPriceValid=true;
}
else System.out.println("please provide valid amount");

return isPriceValid;
}
public static void getEquipment(){
for(String elements:gymEquipments){
System.out.println(elements);
}
}

public static void getAmount(){
for(double element:amount){
System.out.println(element);
}
}
public static boolean updateEquipment(String oldEquipment,String newEquipment){
	System.out.println("The updated equipments are :");
	boolean isEquipmentUpdated = false;
	for(int index = 0 ;index <gymEquipments.length;index++){
		if(oldEquipment == gymEquipments[index]){
			gymEquipments[index] = newEquipment;
		}
	}
	if(isEquipmentUpdated = true){
		System.out.println(oldEquipment + "not found");
}

return isEquipmentUpdated;
}	
public static boolean deleteName(String NameToBeDeleted){
	boolean isNameDeleted =false;
	int oldindex,newindex;
	for(newindex = 0,oldindex= 0; oldindex<gymEquipments.length; oldindex++){
		if(gymEquipments[oldindex] !=NameToBeDeleted)
		{
			gymEquipments[newindex] =gymEquipments[oldindex] ;
			newindex++;
		}
	}
	gymEquipments = Arrays.copyOf(gymEquipments , newindex);
	if(gymEquipments !=null){
		isNameDeleted = true;
	}
		if(isNameDeleted == false){
			System.out.println(NameToBeDeleted +"not found");
		}
		return isNameDeleted;
}
	
}