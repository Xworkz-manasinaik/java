class Bar{
static String brandNames[]={null,null,null,null,null,null,null};
static int index;


public static boolean addWineBrands(String name){
boolean isBrandValid=false;

if(name !=null){
        brandNames[index]  =name;
		index++;
		isBrandValid=true;
}
else System.out.println("provide valid name");

return isBrandValid;
}

public static void getAllBrands(){
for(String brandName:brandNames){
System.out.println(brandName);
}
}

public static boolean updateWineBrand(String oldBrandName,String newBrandName){
	System.out.println("The updated gold items are :");
	boolean isWineBrandUpdated = false;
	for(int index = 0 ;index <brandNames.length;index++){
		if(oldBrandName == brandNames[index]){
			brandNames[index] = newBrandName;
		}
	}
	if(isWineBrandUpdated = true){
		System.out.println(oldBrandName + "not found");
}

return isWineBrandUpdated;
}
}