class GymRunner{
public static void main(String[] args){
Gym.addEquipment("spin bike");
Gym.addEquipment("stair master");
Gym.addEquipment("calf machine");
Gym.addEquipment("ab roller");
Gym.addEquipment("barbell");
Gym.addEquipment("smith machine");
Gym.addEquipment("dipping bars");
Gym.addEquipment("elliptical");


Gym.addPrice(3000);
Gym.addPrice(40000);
Gym.addPrice(50000);
Gym.addPrice(2000);
Gym.addPrice(20000);
Gym.addPrice(30000);
Gym.addPrice(30000);
Gym.addPrice(20000);


Gym.getEquipment();
Gym.getAmount();
boolean nameUpdated = Gym.updateEquipment("spin bike","treadmill");
System.out.println("the name updated is" + nameUpdated);
Gym.getEquipment();

boolean nameDeleted = Gym.deleteName("ab roller");
System.out.println("the name deleted is " + nameDeleted);
Gym.getEquipment();

}


}