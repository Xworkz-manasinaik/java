import java.util.*;
class WatchShop{
static String brandNames[]={null,null,null,null,null,null,null};
static int index;



public static boolean addWatchBrandNames(String name){
boolean isBrandValid=false;

if(name !=null){
        brandNames[index]  =name;
		index++;
		isBrandValid=true;
}
else System.out.println("provide valid name");

return isBrandValid;
}

public static void getAllWatchBrands(){
for(String brandName:brandNames){
System.out.println(brandName);
}
}

public static boolean updateWatchBrands(String oldBrandName,String newBrandName){
	System.out.println("The updated gold items are :");
	boolean isWatchBrandUpdated = false;
	for(int index = 0 ;index <brandNames.length;index++){
		if(oldBrandName == brandNames[index]){
			brandNames[index] = newBrandName;
		}
	}
	if(isWatchBrandUpdated = true){
		System.out.println(oldBrandName + "not found");
}

return isWatchBrandUpdated;
}
public static boolean deleteWatchBrands(String WatchBrandsToBeDeleted){
	boolean isWatchBrandsNameDeleted =false;
	int oldindex,newindex;
	for(newindex = 0,oldindex= 0; oldindex<addWatchBrandNames.length; oldindex++){
		if(addWatchBrandNames[oldindex] !=WatchBrandsToBeDeleted)
		{
			addWatchBrandNames[newindex] =addWatchBrandNames[oldindex] ;
			newindex++;
		}
	}
	addWatchBrandNames = Arrays.copyOf(addWatchBrandNames,newindex);
	if(addWatchBrandNames !=null){
		 isWatchBrandsNameDeleted = true;
	}
		if(isWatchBrandsNameDeleted == false){
			System.out.println(WatchBrandsToBeDeleted +"not found");
		}
		return  isWatchBrandsNameDeleted;
}
}