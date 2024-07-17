class LibertyRunner{
public static void main(String args[]){
Liberty.addShoeBrands("Bata");
Liberty.addShoeBrands("Paragon");
Liberty.addShoeBrands("Nike");
Liberty.addShoeBrands("Adidas");
Liberty.addShoeBrands("Puma");
Liberty.addShoeBrands("Fitbit shoes");
Liberty.addShoeBrands("Vans");

Liberty.getAllShoeBrands();
boolean nameUpdated = Liberty.updateShoeBrand("Bata","New Balance");
System.out.println("the name updated is" + nameUpdated);
Liberty.getAllShoeBrands();

boolean nameDeleted = Liberty.deleteShoeBrand("Vans");
System.out.println("the name deleted is " + nameDeleted);
Liberty.getAllShoeBrands();
}
}