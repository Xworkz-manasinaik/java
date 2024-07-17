class BankAccount{
static double balance;

public static void withDraw(double amount){
System.out.println("Debit started");
balance = balance-amount;
System.out.println("Debit ended");
return; 
}


public static void credit(double amount){
System.out.println("credit started");
balance = balance+amount;

System.out.println("credit ended");
return;
}
public static double getBalance(){
System.out.println("Fetching BALANCE....");
return balance;
}
}