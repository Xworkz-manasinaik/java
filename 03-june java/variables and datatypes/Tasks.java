class Tasks{
static String chocolateNames[]={"5star","munch","perk"};
	static String foodNames[]={chocolateNames + "burger", "pizza"};

public static void main(String []chocolate){
	//String foodNames[]={chocolateNames + "burger", "pizza"}
System.out.println("The chocolate names are : ");
for(String chocolateName:chocolateNames){
System.out.println(chocolateName);
}
for(String foodName:foodNames){
	System.out.println(foodName);
}
}
}

