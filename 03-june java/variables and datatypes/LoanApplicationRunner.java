class LoanApplicationRunner{
public static void main(String []app){


boolean isAccountCreated= LoanApplication.createAccount("");

if(isAccountCreated==true){
LoanApplication.getAccountDetails();
}else{
System.out.println("provided details not found");
}
}
}