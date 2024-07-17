class Instagram{
 static String Email;
 static String password;
 static String PhoneNo;
 static String addresss;
 static String UserName;
 
 public static boolean createAccount(String email,String passWord,String phoneNo,String address,String userName){
	boolean IsAmazonAccountCreated=false;
	if(email != null && passWord != null)
 
			Email=email;
			password=passWord;
			PhoneNo=phoneNo;
			addresss=address;
			UserName=userName;
			return IsAmazonAccountCreated;
		}
	public static void getAccountDetails(){
		System.out.println("The email is :" +Email);
		System.out.println("The password is:" +password);
		System.out.println("The Phone number is:" +PhoneNo);
		System.out.println("The address is :" +addresss);
		System.out.println("The User Name is:" +UserName);
	}
}