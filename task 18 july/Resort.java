class Resort{

String Name;
String place;
int noOfRooms;

public boolean toEnjoy( String name, int noOfRooms, String place){

  boolean isRoomsAvailable=false;
  if(name!=null && noOfRooms>0 && place!=null ){
  
  this.name=name;
  this.noOfRooms=noOfRooms;
  
  this.place=place;
  isRoomsAvailable=true;
  }
  
  return isRoomsAvailable;
  }
   
   public void displayRooms(){
   
  System.out.println("The Brand name :"+ this.name);
  System.out.println("The no of Rooms"+this.noOfRooms);
  System.out.println("The Place is"+this.place);
  }
 
}