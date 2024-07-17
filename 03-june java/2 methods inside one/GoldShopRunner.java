class GoldShopRunner{
public static void main(String[] args){
GoldShop.addGoldItem("gold ring");
GoldShop.addGoldItem("gold necklace");
GoldShop.addGoldItem("gold earings 3gms");
GoldShop.addGoldItem("gold bangles");
GoldShop.addGoldItem("gold anklets");
GoldShop.addGoldItem("gold bracelet");
GoldShop.addGoldItem("gold kada 10 gms");


GoldShop.getAllGoldItems();
boolean nameUpdated = GoldShop.updateGoldItem("gold ring","gold bangles 8gms");
System.out.println("the name updated is" + nameUpdated);
GoldShop.getAllGoldItems();

boolean nameDeleted = GoldShop.deleteGoldItem("alia bhatt");
System.out.println("deleted gold item is " + nameDeleted);
GoldShop.getAllGoldItems();

}


}