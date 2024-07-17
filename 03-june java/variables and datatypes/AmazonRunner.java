class AmazonRunner {

	public static  void main (String[]details){
		
			Amazon.createAccount("email","password","1234567890","Alur|T| hassan|D|","manasi");
			Amazon.getAccountDetails();
		}
}

boolean isAccountCreated= LoanApplication.createAccount(""email","password","1234567890",
                                                              "Alur|T| hassan|D|","manasi"");

if(isAccountCreated==true){
LoanApplication.getAccountDetails();
}else{
System.out.println("provided details not found");
}
}
}