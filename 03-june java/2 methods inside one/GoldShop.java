import java.util.*;
class GoldShop{
static String goldItems[]={null,null,null,null,null,null,null};
static int index;
static double goldPrice[]={0,0,0,0,0,0,0};
static int priceIndex;


public static boolean addGoldItem(String name){
boolean isItemValid=false;

if(name !=null){
        goldItems[index]  =name;
		index++;
		isItemValid=true;
}
else System.out.println("provide valid item");

return isItemValid;
}

public static void getAllGoldItems(){
for(String goldItem:goldItems){
System.out.println(goldItem);
}
}

public static boolean updateGoldItem(String oldGoldItem,String newGoldItem){
	System.out.println("The updated gold items are :");
	boolean isGoldItemUpdated = false;
	for(int index = 0 ;index <goldItems.length;index++){
		if(oldGoldItem == goldItems[index]){
			goldItems[index] = newGoldItem;
		}
	}
	if(isGoldItemUpdated = true){
		System.out.println(oldGoldItem + "not found");
}

return isGoldItemUpdated;
}
public static boolean deleteGoldItem (String goldItemToBeDeleted){
	boolean isGoldItemDeleted =false;
	int oldindex,newindex;
	for(newindex = 0,oldindex= 0; oldindex<addGoldItem.length; oldindex++){
		if(addGoldItem[oldindex] !=goldItemToBeDeleted)
		{
			addGoldItem[newindex] =addGoldItem[oldindex] ;
			newindex++;
		}
	}
	addGoldItem = Arrays.copyOf(addGoldItem , newindex);
	if(addGoldItem !=null){
		isGoldItemDeleted = true;
	}
		if(isGoldItemDeleted == false){
			System.out.println(goldItemToBeDeleted +"not found");
		}
		return isGoldItemDeleted;
}
	
}