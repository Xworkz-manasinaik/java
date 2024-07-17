class MyntraRunner {

	public static  void main (String[]details){
		
			

boolean isAccountCreated= Myntra.createAccount("email","password","1234567890",
                                                              "Alur|T| hassan|D|","manasi");

if(isAccountCreated==true){
Myntra.getAccountDetails();
}else{
System.out.println("provided details not found");
}
}
}