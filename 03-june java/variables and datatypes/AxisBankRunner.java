class AxisBankRunner{
public static void main(String []bank){


boolean isAccountCreated= AxisBank.createAccount("manasi","naik","abc@gmail.com",5637773838L,358926432828L,
"34adc56ty","savings","ganganagar,bangalore","female","8 march","xyz");

if(isAccountCreated==true){
AxisBank.getAccountDetails();
}else{
System.out.println("provided details not found");
}
}
}
