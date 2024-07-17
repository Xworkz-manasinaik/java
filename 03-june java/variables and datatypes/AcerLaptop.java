class AcerLapTop{

static String userNma;
static String brandNma;
static String versionTypea;
static Long costa;
static int windowa;
static String storagea;
static String placeWhereBuya;


public static boolean laptopFeature(String userName,String brandName,String version,
Long cost,int window,String storage,String placeWhereBuy){
boolean isLaptopFeature=false;

 userNma=userName;
 brandNma= brandName;
versionTypea= version;
 costa=cost;
 windowa=window;
 storagea=storage;
 placeWhereBuya=placeWhereBuy;
 return isLaptopFeature;
 }
 public static void getLaptopFeature(){
	System.out.println(" The User name is:"+userNma );
	System.out.println(" The brand name is:" +brandNma);
	System.out.println(" The version of laptop is:" +versionTypea);
	System.out.println(" The amount is:" +costa);	
	System.out.println(" The windows is:"  +windowa);
	System.out.println(" The storage capacity is:" +storagea);
	System.out.println(" The place laptop buy is:" +placeWhereBuya);
	}
}