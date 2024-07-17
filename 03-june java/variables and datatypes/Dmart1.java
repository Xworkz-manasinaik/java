class Dmart1{
	static String chocolate[] = {"Dairy Milk" , "kit kat" , "munch" , "bounty" , "fuse" , "snickers", "ferrero roacher" , "5-star"};

public static void main (String[]newCollection){
	System.out.println("The Available chocolates are : ");
	//for loop
	for (int index = 0;index <chocolate.length ; index++ ){
		System.out.println(chocolate[index]);
	}
	System.out.println("The Available chocolates are : ");
	//for each loop
	for(String chocolate:chocolate){
		System.out.println(chocolate);
	}
}
}