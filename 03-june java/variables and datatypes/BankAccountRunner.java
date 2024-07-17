class BankAccountRunner{
 public static void main(String[] account) {
        System.out.println("Main method started");
		BankAccount.credit(100000);//100000 is argument
		System.out.println(BankAccount.getBalance());
		BankAccount.credit(75000);
System.out.println(BankAccount.getBalance());
		BankAccount.credit(56000);
System.out.println(BankAccount.getBalance());
		BankAccount.credit(59000);
		System.out.println(BankAccount.getBalance());
		BankAccount.withDraw(50000);
		System.out.println(BankAccount.getBalance());
		BankAccount.withDraw(55000);
		System.out.println(BankAccount.getBalance());
		}
}