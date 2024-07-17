class SiteRegistration {
static String Email;
static Long phoneNumber;
static String siteAddress;
static int sitelength;
static int sitewidth;
static String name;
static String amount;
	public static boolean creatregistration(String email,Long phoneNo,String siteAdress,int siteLength,int siteWidth,String Name,String Amount){ 
	boolean IssiteRegistration=false;

	Email=email;
	phoneNumber=phoneNo;
	siteAddress=siteAdress;
	sitelength=siteLength;
	sitewidth=siteWidth;
	name=Name;
	amount=Amount;
	return IssiteRegistration;
	}
	
public static void getsiteRegistration(){
	System.out.println(" The email is:" +Email);
	System.out.println(" The Phone Number is:" +phoneNumber);
	System.out.println(" The Address is:" +siteAddress);
	System.out.println(" The length dimenstion  is:" +sitelength);
	System.out.println("The width dimenstion is:" +sitewidth);
	System.out.println(" The Name is:" +name);
	System.out.println(" The Amount is:" +amount);
	}
}