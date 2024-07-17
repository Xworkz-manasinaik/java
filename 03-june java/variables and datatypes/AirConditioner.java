class AirConditioner{
static boolean isConnected = true;
static int currentTemparature ;
static int minTemparature ;
static int maxTemparature = 6;
//method declaration
public static void onOrOff(){
System.out.println("OnorOff started");
if(isConnected == false){
isConnected = true;
System.out.println("ac is turned on");
}
else if(isConnected == true){
isConnected = false;
System.out.println("ac is turned off");
}
System.out.println("OnorOff ended");

return ;
}

public static void increaseTemparature(){
	System.out.println("increaseTemparature() started");
	if(isConnected == true){
	if (currentTemparature <= maxTemparature){
		currentTemparature = currentTemparature + 1;
		System.out.println("The currentTemparature is : "+ currentTemparature);
	}else {
		System.out.println("maxTemparature is reached");
	      }
	}
	else {
		System.out.println("ac on madu");
        }
	
		System.out.println("increaseTemparature() ended");
		return;
	}
	
public static void decreaseTemparature(){
		System.out.println("decreaseTemparature() started");
		if(isConnected == true){
		if (currentTemparature <= minTemparature){
		currentTemparature = currentTemparature + 1;
		System.out.println("The currentTemparature is : "+ currentTemparature);
	}else {
		System.out.println("minTemparature is reached");
	      }
	}else {
		System.out.println("ac off madu");
        }
	
		System.out.println("decreaseTemparature() ended");
		return;
	}

}

