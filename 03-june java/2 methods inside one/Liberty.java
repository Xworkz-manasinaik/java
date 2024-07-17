import java.util.*;
class Liberty{
static String brandNames[]={null,null,null,null,null,null,null};
static int index;


public static boolean addShoeBrands(String name){
boolean isBrandValid=false;

if(name !=null){
        brandNames[index]  =name;
		index++;
		isBrandValid=true;
}
else System.out.println("provide valid name");

return isBrandValid;
}

public static void getAllShoeBrands(){
for(String brandName:brandNames){
System.out.println(brandName);
}
}

public static boolean updateShoeBrand (String oldBrandName,String newBrandName){
	System.out.println("The updated Shoe brands are :");
	boolean isShoeBrandUpdated = false;
	for(int index = 0 ;index <brandNames.length;index++){
		if(oldBrandName == brandNames[index]){
			brandNames[index] = newBrandName;
		}
	}
	if(isShoeBrandUpdated = true){
		System.out.println(oldBrandName + "not found");
}

return isShoeBrandUpdated;
}
public static boolean deleteShoeBrand(String shoeBrandToBeDeleted){
	boolean isShoeBrandNameDeleted =false;
	int oldindex,newindex;
	for(newindex = 0,oldindex= 0; oldindex>addShoeBrands.length; oldindex++){
		if(addShoeBrands[oldindex] !=shoeBrandToBeDeleted)
		{
			addShoeBrands[newindex] =addShoeBrands[oldindex] ;
			newindex++;
		}
	}
	addShoeBrands = Arrays.copyOf(addShoeBrands , newindex);
	if(addShoeBrands !=null){
		isShoeBrandNameDeleted = true;
	}
		if(isShoeBrandNameDeleted == false){
			System.out.println(shoeBrandToBeDeleted +"not found");
		}
		return isShoeBrandNameDeleted;
}
}