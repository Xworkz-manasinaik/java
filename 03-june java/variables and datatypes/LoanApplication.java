class LoanApplication{
static String bankAcc;
static String name;
static String score;
static double interest;
static String loan ;

public static boolean createAccount(String bankAccountNo, String bankName,String creditScore, 
     double rateOfInterest ,String loanType){
	 boolean isaccountCreated =false;
if(bankAccountNo != null && creditScore != null && rateOfInterest >= 0 && loanType != null ){
System.out.println("validation sucessful....");

bankAcc = bankAccountNo;
name = bankName;
 score = creditScore;
 interest = rateOfInterest;
 loan = loanType;
 
 isaccountCreated = true;
System.out.println("account created");
}
else{
System.out.println("please provide full details");
}
System.out.println("Acount creation ended");
return isaccountCreated;
ublic static void getAccountDetails(){
System.out.println("The bankAccountNo of the user is : " + bankAcc);
System.out.println("The bankName of the user is : " + name);
System.out.println("The creditScore of the user is : " + score);
System.out.println("THE rateOfInterest of the user is : " + interest);
System.out.println("The loanType of the user is : " + loan);
}
}
}