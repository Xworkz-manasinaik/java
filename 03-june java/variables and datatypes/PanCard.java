class PanCard{
	
	static String applicationTypea;
	static String category a;
	static String title a;
	static String surName a;
	static String firstName a;
	static String dob a;
	static String emailId a;
	static long mobileNumber a;
	
	public static boolean creatPancard(String applicationType,String category,
	String title,String surName,String firstName,
	String dob,String emailId,long mobileNumber) {
		boolean isPancardDataCreated=false;
	
	applicationTypea=applicationType;
	categorya=category;
	titlea=title;
	surNamea=surName;
	firstNamea=firstName;
	doba=dob;
	emailIda=emailId;
	mobileNumbera=mobileNumber;
	return isPancardDataCreated;
	}
	public static void getPancardDetiles(){
	System.out.println("The application is " +applicationTypea);
	System.out.println("The category is " +categorya);
	System.out.println("The title	is " +titlea);
	System.out.println("The surname is " +surNamea);
	System.out.println("The first name  is " +firstNamea);
	System.out.println("The date of birth is " +doba);
	System.out.println("The email is " +emailIda);
	System.out.println("The mobile number is " +mobileNumbera);
	
	}
}