class AxisBank{
static String fname;
static String lname;
static String eMail;
static long phNumber;
static long adrNo;
static String pan;
static String accountType;
static String addRess;
static String genDer;
static String birth;
static String nomiNee;

public static boolean createAccount(String fullName,String lastName,String email,
long phoneNumber , long adhaarNo ,String panNo , String typeOfAccount , String address , 
String gender , String dob ,String nominee){
	
boolean isaccountCreated =false;

if(fullName != null && email != null && phoneNumber >= 0 && panNo != null ){
System.out.println("validation sucessful....");

fname = fullName;
lname = lastName;
eMail = email;
phNumber = phoneNumber;
adrNo = adhaarNo;
pan = panNo;
accountType = typeOfAccount;
addRess = address;
genDer = gender;
birth = dob;
nomiNee = nominee;

isaccountCreated = true;
System.out.println("account created");
}

else{
System.out.println("please provide fullName/email/phno/panNo");
}
System.out.println("Acount creation ended");
return isaccountCreated;
}

public static void getAccountDetails(){
System.out.println("The fullname of the user is : " + fname);
System.out.println("The lastname of the user is : " + lname);
System.out.println("The email of the user is : " + eMail);
System.out.println("THE PHONE NUMBER of the user is : " + phNumber);
System.out.println("The adhar number of the user is : " + adrNo);
System.out.println("The pan number of the user is : " + pan);
System.out.println("The type of account of the user is : " + accountType);
System.out.println("The address of the user is : " + addRess);
System.out.println("The gender of the user is : " + genDer);
System.out.println("The NOMINEE of the user is : " + nomiNee);

}
}

