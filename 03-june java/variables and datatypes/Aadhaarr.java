class Aadhaarr {
	
	static String fullNamee;
	static String genderr;
	static int yearss;
	static String dateofbirth;
	static String villagee;
	static String districttt;
	static String statee;
	static String emailiId;
	static String signaturee;
	static String captchaa;
	
	//Method
	public static boolean createAadhaar(String fullName,String gender, 
	int years,String dob,
	 String village,String district,
	 String state,String email,String signatureOfIntroducer,String captcha){
		boolean isAadhaarDataCreated=false;

				fullNamee=fullName;
				genderr=gender;
				//yearss=years;
				dateofbirth=dob;
				villagee=village;
				districttt=district;
				statee=state;
				emailiId=email;
				signaturee=signatureOfIntroducer;
				captchaa=captcha;
		return isAadhaarDataCreated;
	}
	
	public static void getAadhaarCardDetails(){
	
	System.out.println("The full Name is:" +fullNamee);
	System.out.println("The genderr is:" +genderr);
	//System.out.println("The yearss is :" +yearss);
	System.out.println("The date of birth is :" +dateofbirth);
	System.out.println("The place is :" +villagee);
	System.out.println("The district is:" +districttt);
	System.out.println("The state is:" +statee);
	System.out.println("The e-Mailid is:" +emailiId);
	System.out.println("The signature is:" +signaturee);
	System.out.println("The captcha is:" +captchaa);
	
}
}