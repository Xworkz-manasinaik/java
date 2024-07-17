class XworkzRunner{
public static void main(String []app){


boolean isAccountCreated= Instagram.createAccount("");

if(isAccountCreated==true){
Instagram.getAccountDetails();
}else{
System.out.println("provided details not found");
}
}
}