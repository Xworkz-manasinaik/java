import java .util.*;
class Girias{

static String addNames[]={null,null,null,null,null,null,null,null,null,null,null,null};
static int index;
static double addPrice[]={0,0,0,0,0,0,0,0,0,0,0,0};
static int priceIndex;

public static boolean getNames(String name){
boolean isNameValid=false;
if(name !=null){
         addNames[index]  =name;
		 index++;
		 isNameValid=true;
}
else System.out.println("provide valid name");
return isNameValid;
}
public static  boolean getPrice(double price){
boolean isPriceValid=false;
if(price>0){
         addPrice[priceIndex]  =price;
		 priceIndex++;
		 isPriceValid=true;
}
else System.out.println("provide valid amount");
return isPriceValid;
}
public static void getDetails(){
for(String element:addNames)
System.out.println(element);
}
public static void getItemPrice(){


for(double elements :addPrice)
System.out.println(elements);
}
public static boolean updateNames(String oldName ,String newName){
	System.out.println("The updated names are : ");
	boolean isNameUpdated = false;
	for(int index  = 0;index<addNames.length;index ++){
	if(oldName == addNames[index]){
			addNames[index] = newName;
			isNameUpdated= true;
		}
	}
	if(isNameUpdated == false){
		System.out.println(oldName + "not found" );
}

return isNameUpdated;
}
public static boolean deleteNames(String NameToBeDeleted){
	boolean isNameDeleted =false;
	int oldindex,newindex;
	for(newindex = 0,oldindex= 0; oldindex<addNames.length; oldindex++){
		if(addNames[oldindex] !=NameToBeDeleted)
		{
			addNames[newindex] =addNames[oldindex] ;
			newindex++;
		}
	}
	addNames = Arrays.copyOf(addNames , newindex);
	if(addNames !=null){
		isNameDeleted = true;
	}
		if(isNameDeleted == false){
			System.out.println(NameToBeDeleted +"not found");
		}
		return isNameDeleted;
}
}