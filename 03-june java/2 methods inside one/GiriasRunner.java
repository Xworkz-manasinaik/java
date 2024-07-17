class GiriasRunner{
public static void main(String[] args){
	
Girias.getNames("refrigerator");
Girias.getPrice(40000);

Girias.getNames("hp 15s laptop");
Girias.getPrice(60000);

Girias.getNames("boat  airbuds");
Girias.getPrice(4000);

Girias.getNames("samsung smart phones");
Girias.getPrice(90000);

Girias.getNames("drip cafe mixer");
Girias.getPrice(4000);

Girias.getNames("deep kadai");
Girias.getPrice(4000);

Girias.getNames("round tawa");
Girias.getPrice(400);

Girias.getNames("micro oven");
Girias.getPrice(400);

Girias.getNames("led 4k ultra hd tv");
Girias.getPrice(40000);

Girias.getNames("1200mm rapid air fan");
Girias.getPrice(400000);

Girias.getNames("cgx 2 eco gas");
Girias.getPrice(2000);

Girias.getNames("macho iron");
Girias.getPrice(6000);
	


boolean nameUpdated = Girias.updateNames("macho iron","headphones");
System.out.println("the name updated is" + nameUpdated);
Girias.getDetails();

boolean nameDeleted =Girias.deleteNames ("micro oven");
System.out.println("new food name is " + nameDeleted);
Girias.getDetails();
}
}