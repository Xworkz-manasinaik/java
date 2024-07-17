class Factorial{
	static int fact = 1;
public static int toGetFact(int factNumber){ 
System.out.println("Fact method started");
//static int fact = 1;
for(int num=1;num<=factNumber;num++){
	fact = num * fact;
	return fact;
	//System.out.println(fact);
}
System.out.println("Fact method ended");
//return fact;
}
}
