class MicroWave{
static boolean isConnected = true;
static int currentVolume ;
static int minVolume ;
static int maxVolume = 7;

public static void onOrOff(){
System.out.println("OnorOff started");
if(isConnected == false){
isConnected = true;
System.out.println("Microwave is turned on");
}
else if(isConnected == true){
isConnected = false;
System.out.println("Microwave is turned off");
}
System.out.println("OnorOff ended");

return ;
}
public static void increaseVolume(){
	System.out.println("increaseVolume() started");
	if(isConnected == true){
	if (currentVolume <= maxVolume){
		currentVolume = currentVolume + 1;
		System.out.println("The currentVolume is : "+ currentVolume);
	}else {
		System.out.println("maxVolume is reached");
	      }
	}
		System.out.println("increaseVolume() ended");
		return;
	}
	
	}