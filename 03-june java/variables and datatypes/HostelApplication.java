class HostelApplication {
	static String SSPStudentIDs;
	static long mobileNumberr;
	static String casteRDNumberr;
	static String incomeRdNumberr;
	static String registrationNumberr;
	static String  studyCertificates;
	static String marksCardd;
	static String contactAddres;
	static String captchaa;
	
	//Method
	public static boolean creatHostelApplication(String SSPStudentID,long mobileNumber,String casteRDNumber,String incomeRdNumber,
	String registrationNumber,String studyCertificate,String marksCard,String contactAddress,String captcha){
		boolean isHostelApplicationCreated=false;

				SSPStudentIDs=SSPStudentID;
				mobileNumberr=mobileNumber;
				casteRDNumberr=casteRDNumber;
				incomeRdNumberr=incomeRdNumber;
				registrationNumberr=registrationNumber;
				studyCertificates=studyCertificate;
				marksCardd=marksCard;
				contactAddres=contactAddress;
				captchaa=captcha;
				return isHostelApplicationCreated ;
	}
	
	public static void getHostelApplicationDetails(){
	
	System.out.println("The ssp student id is:" +SSPStudentIDs);
	System.out.println("The mobileNumber is:" +mobileNumberr);
	System.out.println("The caste RD Numberis :" +casteRDNumberr);
	System.out.println("The income RD Number is :" +incomeRdNumberr);
	System.out.println("The registration Number is :" +registrationNumberr);
	System.out.println("The study Certificate is :" +studyCertificates);
	System.out.println("The marks Card is:" +marksCardd);
	System.out.println("The contact Addres is:" +contactAddres);
	System.out.println("The Captcha is:" +captchaa);
	
}
	}