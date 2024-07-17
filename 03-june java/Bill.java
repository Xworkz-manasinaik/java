class Bill{
	static int billId = 237489;
static String nameUser = "tommy";
static String billIssueDate = "01/07/2024";
static String billDueDate = "21/07/2024";
static boolean isBillPaid = true;
static boolean isLatestBill = false;
public static void main(String jioBill[]){


System.out.println("**********************");
System.out.println("The Bill id is " + billId);
System.out.println("The user name is " + nameUser);
System.out.println("The Bill issued on " + billIssueDate);
System.out.println("The Bill Due Date is on " + billDueDate);
System.out.println("The Bill paid is  " + isBillPaid);
System.out.println("The Bill is Latest " + isLatestBill);
System.out.println("**********************");
}
}