class ActorsRunner{
public static void main(String[] args){
Actors.getNames("akshay kumar");
Actors.getNames("gaurav verma");
Actors.getNames("aamir khan");
Actors.getNames("sharukh khan");
Actors.getNames("karan johar");
Actors.getNames("deepika padukone");
Actors.getNames("alia bhatt");
Actors.getNames("abhishek bachchan");
Actors.getNames("rajinikanth");


Actors.getActorsNames();
boolean actorsNameUpdated = Actors.updateActorsNames("karan johar","hrithik roshan");
System.out.println("new actor name is " + actorsNameUpdated);
Actors.getActorsNames();

boolean actorsNameDeleted = Actors.deleteActorsName("alia bhatt");
System.out.println("deleted actor is " + actorsNameDeleted);
Actors.getActorsNames();

}
}